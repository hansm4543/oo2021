public class Tehing {
    Andmed hetkekonto;
    Andmed kuhurahalaheb;
    public Tehing(String x, double y, String dx, double dy){
        hetkekonto=new Andmed(x, y);
        kuhurahalaheb=new Andmed(dx, dy);
    }



    public void rahaliigub(){
        kuhurahalaheb.kannaRahayle(hetkekonto);
    }

    public String toString(){
        return hetkekonto.toString()+"  -  "+kuhurahalaheb.toString();

    }
}