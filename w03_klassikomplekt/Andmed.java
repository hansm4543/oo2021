public class Andmed {
    String x;
    double y;
    
    
    public Andmed(String x, double y){

        this.x=x;
        this.y=y;

    }
    public void kannaRahayle(Andmed v){
        y+=v.y;
        System.out.println("Invsteerid kogu summa enda kontolt: -" + v.y);
        v.y=v.y-v.y;


    }

    public String toString(){
        return "("+x+", "+y+")";

    }


}
