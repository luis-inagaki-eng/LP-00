public class relogio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time1 tempo = new Time1();
		System.out.println( tempo.toUniversalString());
		tempo.setTime(13, 27, 6);
		System.out.println( tempo.toUniversalString());
		System.out.println( tempo.toString());
		
		Time2 tempo1 = new Time2();
		System.out.println("Classe 2 construida!");
		System.out.printf("%s\n ",tempo.toUniversalString());
		System.out.printf("%s\n ",tempo.toString());
		//
		int h,m;
		tempo.setTime(22, 2, 2);
		h = tempo.hour;
		//m = tempo.minute;
		Time2 tempo2 = new Time2(h);
		System.out.printf("Hora Atribuida ao construtor: %s - %s\n ",tempo2.getHour());

		tempo1.setTime(tempo.hour, tempo.minute, tempo.second);
		System.out.println("Classe com parametro construida!");
		System.out.printf("%s\n ",tempo.toUniversalString());
		System.out.printf("%s\n ",tempo.toString());
		
	}
}
