package aula1Controles;
import java.util.Scanner;
public class mainControleIfElse {
	public static int nota;
	private static String nome;
	public static void main(String[] args) {
		while (nota != -1) {
			Scanner entrarNota = new Scanner(System.in);
			System.out.println("Entre com a nota: ");
			nome = entrarNota.next();
			System.out.printf("%s", nome);
			System.out.println("");
			controleIfElse chamaIfElse = new controleIfElse(nota);
			chamaIfElse.resultado();
			System.out.println("");
		}
	}
}
