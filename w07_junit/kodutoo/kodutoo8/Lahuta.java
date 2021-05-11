public class Lahuta implements Arvutaja{
	double lahutaja;
	public Lahuta(double lahutaja){
		this.lahutaja=lahutaja;
	}
	public String arvuta(double arv){
        double vastus = 0;
        vastus = arv - lahutaja;
		if(vastus != 0 ){return "Tehe " + arv + "-" + lahutaja + " v6rdub: " + vastus;}

		return "xxx";
	}
}
