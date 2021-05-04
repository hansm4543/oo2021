import org.junit.*;
import static org.junit.Assert.*;

public class sonaTestid {

    //javac -classpath junit4.jar; *.java
    //java -classpath junit4.jar;. org.junit.runner.JUnitCore sonaTestid
    String a = "pere";
    sona sonake= new sona(a);
    String l2 = "Jaagup on tore";
    Lause lauseke2= new Lause(l2);
    
    @Test
	public void esimene(){
		System.out.println("Testi automaatkäivitus");
	}

    @Test
	public void kontroll1(){
		assertEquals("t2hte r leidub: 1", sonake.t2heesinemisearv('r'));
	}
    @Test
	public void kontroll2(){
		assertEquals("t2hte e leidub: 2", sonake.t2heesinemisearv('e'));
	}
    @Test
	public void kontroll3(){
		assertEquals("t2hte p leidub: 1", sonake.t2heesinemisearv('p'));
	}
    @Test
	public void kontroll4(){
		assertEquals("t2hte a leidub lauses: 2", lauseke2.t2heesinemisearv('a'));
	}

	@Test
	public void lopp(){
		System.out.println("Testi automaatuselopp");
	}

}