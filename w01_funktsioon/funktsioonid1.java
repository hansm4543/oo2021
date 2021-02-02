public class funktsioonid1{
	//Koostage funktsioon taksosõidu hinna kohta sisendiks kilomeetrite arv ja väljundiks hind
	//sisseistumis tasu 3 eurot ja km 80senti.
	public static Float taksosoiduHind(float km){
		float summa=3;
		summa=summa+(km*(float)0.8);
		return summa;
	}
	//Math.round(arv*100)/100
	//kutsusin funktsiooni välja Double.parseDouble-iga et saaks 
	//kilomeetreid komakohaga panna, aga kuidas Math.round-ile ümardamispiiri ette anda et ei teeks täisarvuks?
	
	public static String temperatuuriHinnang(int t){
		if(t<18){return "Külm!";}
		return "soe :P";
	}
	
	public static double ringiPindala(double r){
		return Math.PI*r*r;
	}
	public static void main(String[] arg){
		System.out.println(ringiPindala(5));
		
		if(arg.length==1){
			System.out.println(temperatuuriHinnang(Integer.parseInt(arg[0])));
			
			System.out.println(taksosoiduHind(Integer.parseInt(arg[0])));
		}
		
	}
}
