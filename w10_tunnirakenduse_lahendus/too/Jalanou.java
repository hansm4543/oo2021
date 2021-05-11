public class Jalanou implements liides{
    public final String brand;
    public final double size;

    Jalanou(String brand, double size){
        this.brand = brand;
        this.size = size;
    }
    
    public String JalanouFirma(){
        return "Mark: "+brand;
    }
    public String JalanouSuurus(){
        return "Suurus: "+ size;
    }
}