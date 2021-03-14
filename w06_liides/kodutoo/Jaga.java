public class Jaga implements Arvutaja{
	double jagaja;
	public Jaga(double jagaja){
		this.jagaja=jagaja;
	}
	public String arvuta(double arv){
        double vastus = 0;
        vastus = arv / jagaja;
		if(vastus != 0 ){return "Tehe " + arv + "/" + jagaja + " v6rdub: " + vastus;}

		return "xxx";
	}
}