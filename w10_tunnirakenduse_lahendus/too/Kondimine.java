public class Kondimine extends Jalanou {
    public final boolean onvoiei;

    Kondimine(boolean onvoiei, String brand, double size){
        super(brand, size);
        this.onvoiei = onvoiei;

    }
    public String Kasonkondimisejaoks(){
        return "Kondimise jaoks : "+ onvoiei;
    }
}
