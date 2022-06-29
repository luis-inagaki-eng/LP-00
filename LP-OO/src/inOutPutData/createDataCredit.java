package inOutPutData;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;
public class createDataCredit {
	private Formatter output;
	private AccountRecord record = new AccountRecord();
	private Scanner input = new Scanner (System.in);
	public void openFile() {
		try {
			output = new Formatter("cliente.txt");
		} catch (SecurityException e) {
			System.err.println("Error ao escrever no arquivo.");
			System.exit(1);
		}catch (FileNotFoundException e) {
			System.err.println("Error ao escrever no arquivo.");
			System.exit(1);
		}		
	}
	public void addRecords() {
		System.out.printf("%s\n%s\n%s\n%s\n\n",
				"Para finalizar a entrada de dados,",
				"tecle <ctrl>z e tecle entrer!");
		System.out.printf("%s\n%s", "Entre com o numero,"
				+ "nome, sobrenome e saldo","->");
		while(input.hasNext()) {
			try {
				record.setAccount(input.nextInt());
				record.setfirstName(input.next());
				record.setlastName(input.next());
				record.setbalance(input.nextDouble());
				if (record.getAccount()>0) {
					output.format("%d %s %s %.2f\n", record.getAccount(),
							record.getfirstName(),record.getlastName(),
							record.getbalance());
				} else {
					System.out.println("Conta deve ter numero mais que zero!");
				}
			} catch (FormatterClosedException e) {
				System.err.println("Erro ao escrever no arquivo!");
			}
			System.out.printf("%s %s\n%s","Entre com conta, nome, sobrenome e saldo.",".>");
		}			
	}
	public void closeFile() {
		if (output != null)
			output.close();
	}
}
