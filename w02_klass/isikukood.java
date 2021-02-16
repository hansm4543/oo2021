import java.time.LocalDate;
import java.util.ArrayList;

public class isikukood {
    String sisu;
    public isikukood(String uusSisu){
        sisu=uusSisu;
        if(sisu.length()!=11){
            throw new RuntimeException("vigane pikkus");

        }
    }
    public String kirjutaisikukood(){
        String isikukoodinumber = sisu;
        if(isikukoodinumber != ""){return "Sisestati isikukood: " + isikukoodinumber;}
        
        return "Isikukoodi ei leitud";
    }

    
    public String kontrollSumma(){
        ArrayList<Integer> kordaja1 = new ArrayList<Integer>();
        kordaja1.add(1); 
        kordaja1.add(2);
        kordaja1.add(3);
        kordaja1.add(4);
        kordaja1.add(5);
        kordaja1.add(6);
        kordaja1.add(7);
        kordaja1.add(8);
        kordaja1.add(9);
        kordaja1.add(1);
        ArrayList<Integer> kordaja2 = new ArrayList<Integer>();
        kordaja2.add(3); 
        kordaja2.add(4);
        kordaja2.add(5);
        kordaja2.add(6);
        kordaja2.add(7);
        kordaja2.add(8);
        kordaja2.add(9);
        kordaja2.add(1);
        kordaja2.add(2);
        kordaja2.add(3);

        //ArrayList kordaja2 = (3,4,5,6,7,8,9,1,2,3);

        int summa = 0;
        for (int i = 0; i < 10; i++) {

            int teine = i + 1;
            summa = summa + (kordaja1.get(i) * Integer.parseInt(sisu.substring(i, teine)));
        }
        int j22k = summa % 11;
        //System.out.println(summa);
        //System.out.println(j22k);

        System.out.println("1. kordajad annavad kontrollnumbri " + j22k);
        if(j22k == 10){ //Kasutada tuleb teist kordajate komplekti.
            summa = 0;
            for (int i = 0; i < 10; i++) {

                int teineasendus = i + 1;
                summa = summa + (kordaja2.get(i) * Integer.parseInt(sisu.substring(i, teineasendus)));
            }
            j22k = summa % 11;
            System.out.println("2. kordajad annavad kontrollnumbri "+ j22k);
            if(j22k == 10){
                j22k = 0;
                System.out.println("Kontrollnumber on lihtsalt 0 " + j22k);
            }
        }



        if(j22k == Integer.parseInt(sisu.substring(10))){
            return "Kontrollsumma sobib, seega isikukood on 6ige.";
        }else{
            return "Sisestatud isikukoodis on viga, kontrollsumma ei ole sama.";
        }

    }


    public String vanuseLeidmine(){

        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int date = localDate.getDayOfMonth();
        System.out.println("T2na on " + date +  "." + month + "." + year);

        int paev = kuuPaev();
        int kuu = kuuNumber();
        int synniaasta = aastaArv();
        int vanus = year - synniaasta;

        if(month < kuu){
            vanus = vanus - 1;
        }else if(month == kuu && date < paev){
            vanus = vanus - 1;
        }else if(month == kuu && date == paev){
            System.out.println("Palju onne synnipaevaks");
        }
        return "Isiku vanus on " + vanus;
    }

    public String synnipaev(){

        int paev = kuuPaev();
        int kuu = kuuNumber();
        int synniaasta = aastaArv();

        return "Sünnipäevaks on: "+ paev + "."+ kuu + "." +  synniaasta;
    }

    //ALLA SELLE OLI Tunnis tehtud, veidike pidin muutma
    public int kuuNumber(){
        return Integer.parseInt(sisu.substring(3, 5));
        //return sisu.substring(3, 5);
    }
    public int kuuPaev(){
        return Integer.parseInt(sisu.substring(5, 7));
        //return sisu.substring(5, 7);
    }
    public String sugu(){
        int nr=Integer.parseInt(sisu.substring(0, 1));
        //System.out.println(nr);
        if(nr % 2 == 0){return "Sisestatud isikukood kuulub naisele";}
        return "Sisestatud isikukood kuulub mehele";
    }
    public int aastaArv(){
        int lopp=Integer.parseInt(sisu.substring(1,3));
        int algus=Integer.parseInt(sisu.substring(0, 1));
        int synniaasta;
        synniaasta = 0;

        if(algus == 1){
            synniaasta = 1800;
        }
        if(algus == 2){
            synniaasta = 1800;
        }
            
        if(algus == 3){
            synniaasta = 1900;
        }
        if(algus == 4){
            synniaasta = 1900;
        }
            
        if(algus == 5){
            synniaasta = 2000;
        }
        if(algus == 6){
            synniaasta = 2000;
        }
          
        
        synniaasta = synniaasta + lopp;
        return synniaasta;

    }



}
