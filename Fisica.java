import java.util.Scanner;

public class Fisica{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		double entrada1 = sc.nextDouble();
		double velocidade1 = sc.nextDouble();
		double entrada2 = sc.nextDouble();
		double velocidade2 = sc.nextDouble();
		double tempo = sc.nextDouble();
		
		double resultado1 = entrada1 + velocidade1 * tempo;
		double resultado2 = entrada2 + velocidade2 * tempo;

		double diferenca = Math.abs(resultado1 - resultado2);

		System.out.println((int)diferenca);
		sc.close();
	}
}
