package inOutPutData;

public class mainCreditInquiry {
	public static void main (String[] args) throws Exception{
		createDataCredit conta = new createDataCredit();
		conta.openFile();
		conta.addRecords();
		conta.closeFile();
		creditInquiry app = new creditInquiry();
		app.processRequests();
	}
	}
//}
