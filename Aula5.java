package condicional;



import java.util.Scanner;



public class Aula5 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int inicial, i, j, x, expoente, num_termos;

		int den = 0, denominador, fat = 0, fim, s;

		

		

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de termos");

		

		num_termos = sc.nextInt();

		System.out.println("inorme o valor de x: ");

		x= sc.nextInt();

		

		denominador = 1;

		s=0;

		

	 for(i = 1; i<= num_termos; i++) {

		 fim = denominador;

		 fat=1;

		 for (j = 1;j  <= fim; j++) {

			 fat *= j;

		 }	

		 expoente = i+1; 

		 if((expoente %2)==0)

			 s = (int) (s - Math.pow(x, expoente));

		 else

			 s += (int) Math.pow(x, expoente)/fat;

		 if(denominador ==4)

			 den = -1;

		 if(denominador == 1)

			 den = 1;

		 

		 if (den == 1)

			 denominador += 1;

		 else 

			 denominador -= 1;

		 

		 System.out.printf("%d" ,s);

		 

        }

	 }



}