
public class mainLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lista myLista = new lista();
		/*
		for(int i =0; i<5; i++)
			System.out.printf("\nLista elemento: %s ", myLista.arraylist.get(i));
		myLista.adicionaElemento(2, "teste");
		myLista.encontraElemento(2);
		//System.out.printf("\nPega elemento %s ", myLista.arraylist.get(2));
		myLista.removeElemento(0);
		myLista.encontraElemento(0);		
		//System.out.printf("\nRemoveu elemento %s ",myLista.arraylist.get(2));
		*/
		myLista.listaArray();
		//myLista.removeElemento(myLista.listaArray(), "String1");
		//myLista.encontraElemento(myLista.listaArray(), "String4");
		myLista.adicionaElemento(myLista.listaArray(), "luis");
	}

}
