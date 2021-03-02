import java.util.*;
import java.io.*;

public class Geomeetrilinekeskmine {

    public static Double ruutjuurpealekorrutist(Double x, Double y){
        double vastus = 0;
        double z = x*y;
        vastus = Math.sqrt(z);
        return vastus;
    }

    public static Double mathpow(java.util.List<Double> list) {
        double vastus = 1;
        double loendur = 0;
        double tulemus = 0;
        for (int i = 0; i < (list.size()); i++) {
            loendur = loendur + 1;

            Double a=list.get(i);
            vastus = vastus * a;
            //System.out.println(a);
            //System.out.println(vastus);
        }
        tulemus = Math.pow(vastus, 1.0 / loendur);

        return tulemus;
    }
    public static Double geomeetrilinekeskmine(java.util.List<Double> andmed){
        double vastus = 1;
        double loendur = 0;
        double tulemus = 0;
        for (int i = 1; i < (andmed.size()); i++) { //PEAN TEGEMA UUE FUNKTSIOONI KUNA ANDMETE ESIMENE ARV ON ALGNE PALK, SEEGA PEAN i v22rtuseks panema 1
            loendur = loendur + 1;
            Double a=andmed.get(i);
            vastus = vastus * a;
            //System.out.println(a);
            //System.out.println(vastus);
        }
        tulemus = Math.pow(vastus, 1.0 / loendur);

        return tulemus;
    }
    
   

    public static void main(String [] arg) throws Exception, IOException{
        java.util.List<Double> list = new ArrayList<>();
        list.add(4.0); 
        list.add(8.0);
        list.add(16.0);
        list.add(32.0);
        list.add(64.0);
        list.add(128.0);

        System.out.println("Korrutame kokku ja võtame ruutjuure");
        System.out.println(ruutjuurpealekorrutist(2.0, 4.0));
        System.out.println("Korrutame kokku ja võtame mathpow");
        System.out.println(mathpow(list));
        
         // create Scanner inFile1
        Scanner inFile1 = new Scanner(new File("Palgad.txt")).useDelimiter(",\\s*");


        // Original answer used LinkedList, but probably preferable to use ArrayList in most cases
        // List<Float> temps = new LinkedList<Float>();
        List<Double> andmed = new ArrayList<Double>();

        // while loop
        while (inFile1.hasNext()) {
        // find next line
        double token1 = inFile1.nextDouble();
        andmed.add(token1);
        }
        inFile1.close();
        /*
        Double [] tempsArray = andmed.toArray(new Double[0]);

        for (double s : tempsArray) {
        System.out.println(s);
        }
        */
        System.out.println(andmed);

        PrintWriter pw=new PrintWriter(new FileWriter("Palgavastus.txt"));
        double algpalk = andmed.get(0);
        pw.println("Algne palk "+ algpalk + " eurot!");
        double geomeetrilinekoef = geomeetrilinekeskmine(andmed);
        System.out.println(geomeetrilinekoef);

        double koef1 = andmed.get(1);
        System.out.println(koef1);
        double palk1 = Math.round(algpalk * koef1);
        double palk1geomeetrilisekoefiga = Math.round(algpalk*geomeetrilinekoef);
        pw.println("Teise aasta palk "+ palk1 + " eurot!   Teise aasta palk geomeetrilisekoefiga " + palk1geomeetrilisekoefiga + " euro!");

        double koef2 = andmed.get(2);
        System.out.println(koef2);
        double palk2 = Math.round(palk1 * koef2);
        double palk2geomeetrilisekoefiga = Math.round(palk1geomeetrilisekoefiga*geomeetrilinekoef);
        pw.println("Teise aasta palk "+ palk2 + " eurot!   Teise aasta palk geomeetrilisekoefiga " + palk2geomeetrilisekoefiga + " euro!");

        double koef3 = andmed.get(3);
        System.out.println(koef3);
        double palk3 = Math.round(palk2 * koef3);
        double palk3geomeetrilisekoefiga = Math.round(palk2geomeetrilisekoefiga*geomeetrilinekoef);
        pw.println("Teise aasta palk "+ palk3 + " eurot!   Teise aasta palk geomeetrilisekoefiga " + palk3geomeetrilisekoefiga + " euro!");

        double koef4 = andmed.get(4);
        System.out.println(koef4);
        double palk4 = Math.round(palk3 * koef4);
        double palk4geomeetrilisekoefiga = Math.round(palk3geomeetrilisekoefiga*geomeetrilinekoef);
        pw.println("Teise aasta palk "+ palk4 + " eurot!   Teise aasta palk geomeetrilisekoefiga " + palk4geomeetrilisekoefiga + " euro!");

        double koef5 = andmed.get(5);
        System.out.println(koef5);
        double palk5 = Math.round(palk4 * koef5);
        double palk5geomeetrilisekoefiga = Math.round(palk4geomeetrilisekoefiga*geomeetrilinekoef);
        pw.println("Teise aasta palk "+ palk5 + " eurot!   Teise aasta palk geomeetrilisekoefiga " + palk5geomeetrilisekoefiga + " euro!");
        pw.close();
        System.out.println("Faili kirjutatud!");

    }
}
