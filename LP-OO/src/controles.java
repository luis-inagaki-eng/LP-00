import java.awt.*;
import java.util.Scanner;
import javax.swing.JPanel;
public class controles extends JPanel{
	private static final int contaminacao_incial = 1;
	private static final int constante_proporcionalidade = 2;
	private int tempo = 1; //constante em horas
	private String periodo;
	private double infectados;
	public controles(int tempo) {
		infectados = controles.contaminacao_incial*Math.exp(controles.constante_proporcionalidade*tempo);	
		System.out.printf("Numero de infectados: %f \n", infectados);		
	}
	@Override
	//public void calc_infeccao() {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);		
		Scanner input = new Scanner(System.in);
		System.out.println("Calcula de infectados e insira o tempo: \n");
		while (input.hasNext()){			
			this.tempo = input.nextInt();
			if (tempo > 0 && tempo <= 24)
				periodo = "horas";
			else if (tempo >24)
				periodo = "dias";
			else 
				periodo = "meses";			
			switch (periodo) {
				case "horas":
					System.out.printf("Numero de infectados: %f \n", this.contaminacao_horas(tempo));					
					
					plotInfectados(g);
					break;
				case "dias":
					System.out.printf("Numero de infectados: %f \n",this.contaminacao_dias(tempo))	;
					plotInfectados(g);
					break;
				case "meses":
					System.out.printf("Numero de infectados: %f \n", this.contaminacao_meses(tempo));
					plotInfectados(g);
					break;
				default:
					System.out.println("Fora do periodo!\\n");
					break;
			}
		}
	}
	public double contaminacao_horas(int tempo) {
		return this.infectados = controles.contaminacao_incial*Math.exp(controles.constante_proporcionalidade*tempo);
	}
	public double contaminacao_dias(int tempo) {
		return this.infectados = controles.contaminacao_incial*Math.exp(controles.constante_proporcionalidade*tempo/24);
	}
	public double contaminacao_meses(int tempo) {
		return this.infectados = controles.contaminacao_incial*Math.exp(controles.constante_proporcionalidade*tempo/360);
	}
	public void plotInfectados(Graphics g) {		
		g.setColor(Color.RED);
		//g.fillRect(15, 25, 100, 20);
		g.drawLine( 0, 0, this.tempo, (int)infectados);			
		//plot.drawChars(null, constante_proporcionalidade, tempo, {0}, infectados);		
	}
}
