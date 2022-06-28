package aula1Controles;
//classe - abstração do objeto
public class controleIfElse  {
	//variaveis da classe - atributos do objeto
	private int nota;private String conceito;
	//construtor da clase - inicialiação do objeto com valor inicial
	public controleIfElse(int nota) {
		if (nota<=100 && nota>=80){
			System.out.println("Conceito - A");
			this.conceito = "A";
		}else if (nota<=79 && nota>=60){
			System.out.println("Conceito - B");
			this.conceito = "B";
		}else if (nota<=59 && nota>=40){
			System.out.println("Conceito - C");
			this.conceito = "C";
		}else if (nota<=39 && nota>=20){
			System.out.println("Conceito - D");
			conceito = "D";
		}else if (nota<=19 && nota>=0){
			System.out.println("Conceito - E");
			conceito = "E";
		}else {
			System.out.println("Nota errada!");
		}
		this.nota = nota;		
	}
	//função do objeto - metódo de funcionalidade da classe
	public void resultado() {
		System.out.printf("Aluno com conceito %s: %s",this.conceito,
				nota >60 ? "Aprovado": "Reprovado");
	}
}