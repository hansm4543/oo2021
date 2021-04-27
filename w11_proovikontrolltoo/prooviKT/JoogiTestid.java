import org.junit.*;
import static org.junit.Assert.*;

public class JoogiTestid {
    Jook j2 = new Jook("DrPepper", 5.5, 3);
    Joogipudel p2 = new Joogipudel(10.0, "purk", 0.5, 0.1);
	Joogivaat v1 = new Joogivaat(100.0, 25.0);
	Joogivaat v2 = new Joogivaat(50.0, 5.0);
	Joogivaat v3 = new Joogivaat(50.0, 50.0);
    
    @Test
	public void esimene(){
		System.out.println("Testi automaatkäivitus");
	}

    @Test
	public void kontroll1(){
    	p2.lisaJook(j2);
		assertEquals("3.5", p2.massKoosJoogiga());
	}
	@Test
	public void kontroll2(){
    	p2.lisaJook(j2);
		assertEquals("DrPepper", p2.nimetus);
	}
	@Test
	public void kontroll3(){
		assertEquals("Jook puudub", p2.massKoosJoogiga());
	}
	@Test
	public void kontroll4(){
		assertEquals("Pudel on täidetud", v1.taidaPudel(p2));
	}
	@Test
	public void kontroll5(){
		assertEquals("jook on ostas", v2.taidaPudel(p2));
	}
	@Test
	public void kontroll6(){
		assertEquals("Pudelid on täidetud", v3.taidaPudelid(5, p2));
	}
	@Test
	public void kontroll7(){
		assertEquals("jook on ostas ja täidetud sai " + 5 + " pudelit", v3.taidaPudelid(10, p2));
	}

	@Test
	public void lopp(){
		System.out.println("Testi automaatuselopp");
	}

}