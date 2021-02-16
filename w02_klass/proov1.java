import java.time.LocalDate;

public class proov1 {
    public static void main(String [] arg){
        isikukood hans=new isikukood("50010150834");
        System.out.println("--------------------------------------------------------");
        System.out.println(hans.kirjutaisikukood());
        //System.out.println(hans.kuuNumber());
        //System.out.println(hans.kuuPaev());
        System.out.println(hans.sugu());
        //System.out.println(hans.aastaArv());

        //System.out.println(year);
        //System.out.println(month);
        //System.out.println(date);
        System.out.println(hans.synnipaev());
        System.out.println(hans.vanuseLeidmine());
        System.out.println(hans.kontrollSumma());

        System.out.println("--------------------------------------------------------");
        isikukood paula=new isikukood("47808090434"); //randomilt kirjutatud numbrid
        System.out.println(paula.kirjutaisikukood());

        System.out.println(paula.sugu());

        System.out.println(paula.synnipaev());
        System.out.println(paula.vanuseLeidmine());
        System.out.println(paula.kontrollSumma());
    }
}
