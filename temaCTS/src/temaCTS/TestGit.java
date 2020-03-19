package temaCTS;

public class TestGit {

	public static void main(String[] args) {
		
		System.out.println("Hello Git ! Denumirea proiectului de licenta este Mobile Learning in IT");
		
		Lectie lectie = new Lectie(1,"Introducere in Java","Java "
				+ "este un limbaj de programare orientat-obiect,"
				+ " puternic tipizat, conceput de catre James Gosling la "
				+ "Sun Microsystems (acum filiala Oracle) la inceputul anilor ʼ90, "
				+ "fiind lansat in 1995. Cele mai multe aplicatii distribuite sunt "
				+ "scrise in Java, iar noile evolutii tehnologice permit utilizarea sa "
				+ "si pe dispozitive mobile, spre exemplu telefon, agenda electronica,"
				+ " etc. In felul acesta se creeaza o platforma unica, la nivelul"
				+ " programatorului, deasupra unui mediu eterogen extrem de diversificat."
				+ " Acesta este utilizat in prezent cu succes si pentru programarea aplicatiilor "
				+ "destinate intranet-urilor.\r\n" + 
				"\r\n" + 
				"Limbajul imprumuta o mare parte din sintaxa de la C si C++, "
				+ "dar are un model al obiectelor mai simplu si "
				+ "prezinta mai putine facilitati de nivel jos.");
		
		
		
		lectie.evalueaza();
	}

}
