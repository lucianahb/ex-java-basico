package caelum.poo;

public class Fatorial {

	public static void main(String[] args) {
		
		int num;
		int fatorial = 1;
		int contador = 1;

		
		for (num=0; num<=10; num++) {
			if (num <= 0) {
				System.out.print("O fatorial de " + num + " é 1\n");
			} else {
				fatorial = fatorial * contador;
				contador++;
				System.out.print("O fatorial de " + num + " é " + "(" + (num-1) + "!)" + " * " + num + " = " + fatorial + "\n");
			}
				
		}
		
	}
		
}
