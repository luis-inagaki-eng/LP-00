package inOutPutData;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class creditInquiry {
	private menuOption accountType;
	private Scanner input;
	private menuOption choices[] = {menuOption.zero_balance,
			menuOption.credito_balance, menuOption.debito_balance,
			menuOption.end};
	private void readRecords() {
		AccountRecord record = new AccountRecord();
		try	{
			input = new Scanner(new File("cliente.txt"));
			while(input.hasNext()) {
				record.setAccount(input.nextInt());
				record.setfirstName(input.next());
				record.setlastName(input.next());
				record.setbalance(input.nextDouble());
				if (shouldDisplay(record.getbalance())){
					System.out.printf("%-10d%-12s%-12s%10.2f\n",
							record.getAccount(),record.getfirstName(),
							record.getlastName(),record.getbalance());
				}
			}		
		}catch(NoSuchElementException elemException){
			System.out.println("error no arquivo!");
			input.close();
			System.exit(1);
		}catch(IllegalStateException stateException){
			System.out.println("error na leitura do arquivo!");
			System.exit(1);
		}catch(FileNotFoundException fileException){
			System.out.println("arquivo n�o encontrado!");
			System.exit(1);
		}finally {
			if(input != null)
				input.close();
		}		
	}
	private boolean shouldDisplay(double balance) {
		if((accountType == menuOption.credito_balance) && (balance <0))
			return true;
		else if((accountType == menuOption.debito_balance)&&(balance > 0))
			return true;
		else if((accountType == menuOption.zero_balance)&&(balance == 0))
			return true;
		return false;
	}
	private menuOption getRequest() {
		Scanner textIn = new Scanner(System.in);
		int request = 1;
		System.out.printf("\n%s\n%s\n%s\n%s\n%s\n", "Enter request",
				"1 - Lista contas com zero", "2 - Lista contas com credito",
				"3 - Lista contas com debito", "4 - fim ");
		try {
			do {
				System.out.print("\n?");
				request = textIn.nextInt();				
			}while((request<1)||request>4);
		}catch(NoSuchElementException elem) {
			System.out.println("Entrada inv�lida!");
			System.exit(1);
		}
		return choices[request - 1];
	}
	public void processRequests() {
		accountType = getRequest();
		while(accountType != menuOption.end) {
			switch (accountType) {
			case zero_balance:
				System.out.println("\nConta com saldo zero:\n");
				break;
			case credito_balance:
				System.out.println("\nConta com credito:\n");
				break;
			case debito_balance:
				System.out.println("\nConta com debito:\n");
				break;
			default:
				break;
			}
			readRecords();
			accountType = getRequest();
		}
	}
}
