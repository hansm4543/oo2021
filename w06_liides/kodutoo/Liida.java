public class Liida implements Arvutaja{
	double liidetav;
	public Liida(double liidetav){
		this.liidetav=liidetav;
	}
	public String arvuta(double arv){
        double vastus = 0;
        vastus = arv + liidetav;
		if(vastus != 0 ){return "Tehe " + arv + "+" + liidetav + " v6rdub: " + vastus;}

		return "xxx";
	}
}