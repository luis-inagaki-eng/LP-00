import java.util.*;
/*
 * .list / .arraylist / .collection / .iterator / map
 */
public class lista {
	/*
	//List<String> lista = new ArrayList<String>(); //cria vetor a ser manipulado
	Vector<String> vectStr = new Vector<String>(lista);//transforma lista em vetor	
	Collection<String> collection = Collections.synchronizedList(vectStr); //cria objeto para manipula lista/vetor
	Iterator<String> iterator = collection.iterator(); // objeto q percorre a coleção 
	Map<String, Integer> mapea = new HashMap<String, Integer>();*/
	public lista() { 
		/*	
		for(String dado : tabela)
			arraylist.add(dado);
		*/	
	}
	public Collection<String> listaArray() {
		List<String> arraylist = new ArrayList<String>();
		for(int i =0; i<5; i++)
			arraylist.add("String" + i );
		/*
		System.out.println("Array List : ");
		for(int index =0; index<5; index++)
			System.out.printf("%s ", arraylist.get(index));
		*/
		System.out.println("");
		return arraylist;		
		//this.removeElemento(arraylist,iterator.);
	}
	public void listaLinked() {
		List<String> linkdedlist = new LinkedList<String>();
		
	}	
	public void listaVector()	{
		Vector<String> vectStr = new Vector<String>();
		
	}
	public void adicionaElemento(Collection<String> elemento, String dado) {	
				elemento.add(dado);
				System.out.printf("\nElemento adicionado - %s ",elemento);				
	}
	public void removeElemento(Collection<String> elemento, String dado) {
		while (elemento.iterator().hasNext()) {
			if (elemento.contains(dado)) {
				System.out.printf("Removeu? %s ",(elemento.remove(dado)?"sim":"nao"));
				break;
				}
		}		
		//for (int index=0; index <= elemento.size() ; index++)
			System.out.printf("\nElemento removido - %s ",elemento);
	}
	public void encontraElemento(Collection<String> elemento , String dado) {
		if (elemento.contains(dado));
			System.out.printf("\nEncontrado %s",elemento);
	}
	
}
