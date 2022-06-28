
public class mainColection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colection vetores = new Colection();
		vetores.printArrays();
		vetores.printEquals();
		
		int location = vetores.searchForInt(5);
		if (location >= 0)
			System.out.printf("\nEncontrado elemento %d no Array!", location);
		else
			System.out.println("\nNão Encontrado elemento no Array!");
		
		location = vetores.searchForInt(6000);
		if (location >= 0)
			System.out.printf("\nEncontrado elemento %d no Array!", location);
		else
			System.out.println("\nNão Encontrado elemento no Array!");
	}

}
