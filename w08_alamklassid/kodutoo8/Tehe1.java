public class Tehe1{
	public static void main(String[] arg){
		

        Arvutaja t1=new Liida(150.0); // sulgudesse mitmega liita tahad
		System.out.println(t1.arvuta(45.0));

		Arvutaja t2=new Liida(150.0);

        Tehetekogumik tehted1= new Tehetekogumik();
        tehted1.lisa(t1);
        tehted1.lisa(t2);
        System.out.println(tehted1.kysiKogusumma());
        System.out.println(r1.kysiEsimeneArv());
        System.out.println(r1.kysiViimaneArv());
        
		//Takisti t3 = new Takisti(1210, 40);
        //r1.lisa(t3);


	}
}