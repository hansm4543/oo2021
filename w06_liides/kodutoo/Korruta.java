public class Korruta implements Arvutaja{
	double korrutaja;
	public Korruta(double korrutaja){
		this.korrutaja=korrutaja;
	}
	public String arvuta(double arv){
        double korrutis = 0;
        korrutis = arv * korrutaja;
		if(korrutis != 0 ){return "Tehe " + arv + "*" + korrutaja + " v6rdub: " + korrutis;}

		return "xxx";
	}
}