public class arvutus1{
	public static void main(String[] arg){
		//double, long, int
		double mass=73.5;
		System.out.println(mass*2);
		System.out.println(mass/2);
		//Leian kahekordne mass
		//Leian pool massi
		String eesnimi="Juku";
		int vanus=7;
		if(vanus<7){
			System.out.println("tasuta");
		}else{
			System.out.println(eesnimi+", Osta pilet");
		}
		long molekule=728382957127354L;
		System.out.println(molekule % 1000);
		short palk=2000;
		//25000 palgaga tuleb miinus
		short kogupalk=(short)(palk*(short)2);
		System.out.println(kogupalk);
		
		byte loendur=20;
		float vahemaa=100.25f;
		//float 7 tuvenumbrit
		//kui t2pselt meetermoodustikus on
		//floati abil v6imalik kirja panna vahemaa tallinna haapsalu vahel 100km
		//100km=10miljonit cm
		//1000 100meetrit
		//10 000
		char symbol='õ';
		boolean kasKorras=false;
		
	}
}
