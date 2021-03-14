public class Tehe1{
	public static void main(String[] arg){
		Arvutaja te=new Korruta(3.0); // sulgudesse mitmega korrutada tahad
		System.out.println(te.arvuta(5.0));

        Arvutaja abc=new Liida(150.0); // sulgudesse mitmega liita tahad
		System.out.println(abc.arvuta(45.0));

        Arvutaja dc=new Jaga(5.0); // sulgudesse mitmega jagada tahad
		System.out.println(dc.arvuta(20.0));

        Arvutaja gg=new Lahuta(5.0); // sulgudesse mitmega lahutada tahad
		System.out.println(gg.arvuta(20.0));

	}
}