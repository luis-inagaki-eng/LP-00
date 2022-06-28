import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class wordTypeCount {
	private Map<String, Integer> map;
	private Scanner scan;
	public wordTypeCount() {
		map = new HashMap<String, Integer>();
		scan = new Scanner(System.in);
		createMap();
		displayMap();
	}
	public void createMap() {
		System.out.println("Entre  com o dados:");
		String input = scan.nextLine();
		StringTokenizer token= new StringTokenizer(input);
		while(token.hasMoreTokens()){ 
			String word = token.nextToken().toLowerCase();
			if (map.containsKey(word)) {
				int count = map.get(word);
				map.put(word, count +1);
			}else {
				map.put(word, 1);
			}
		}
	}
	public void displayMap() {
		Set<String> keys = map.keySet();
		TreeSet<String> sortedKeys = new TreeSet<String>(keys);
		System.out.println("\nkey\t\tvalue");
		for(String key:sortedKeys) {
			System.out.printf("%-10s%10s\n", key,map.get(key));
		}
		System.out.printf("\nsize:%d\nisempty:%b\n",map.size(),map.isEmpty());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new wordTypeCount();
		

	}

}
