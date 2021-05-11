import org.junit.*;
import static org.junit.Assert.*;

public class Arvutajatestid {
    
    Arvutaja abc=new Liida(150.0);
	Arvutaja gg=new Liida(50.0);

	@Test
	public void esimene(){
		System.out.println("Testi automaatkäivitus");
	}
    @Test
	public void kontroll1(){
	   abc.arvuta(45.0);
	   assertEquals("195.0", abc.tehtevastusetest());
	}
	@Test
	public void kontroll2(){
	   gg.arvuta(50.0);
	   assertEquals("100.0", gg.tehtevastusetest());
	}
	@Test
	public void lopp(){
		System.out.println("Testi automaatuselopp");
	}


}
