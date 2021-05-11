public class Liida implements Arvutaja{
	double liidetav;
	double maluvastus;

	public Liida(double liidetav){
		this.liidetav=liidetav;
	}
	public double arvuta(double arv){
        double vastus = 0;
        vastus = arv + liidetav;
		this.maluvastus = vastus;
		if(vastus != 0 ){return vastus;}

		return 0.0;
	}
	public String tehtevastusetest(){
        if (maluvastus != 0.0){return String.valueOf(maluvastus);}
        return "0";
    }

}