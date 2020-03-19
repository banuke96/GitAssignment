package temaCTS;

public class Lectie implements EvaluareInterface{
	private int id;
	private String titlu;
	private String textulLectiei;
	
	
	public Lectie(int id, String titlu, String textulLectiei) {
		this.id = id;
		this.titlu = titlu;
		this.textulLectiei = textulLectiei;
	}


	@Override
	public void evalueaza() {
		System.out.println("E timpul sa testam cunostintele acumulate! Mult succes!");
		
	}
	
	
}
