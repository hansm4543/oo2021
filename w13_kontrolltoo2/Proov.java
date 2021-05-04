import java.util.*;
public class Proov{
    public static void main(String[] args) {

        String s = "abdsd3asdaasasddsadas";
        int counta = s.length()-s.replaceAll("a","").length();
        System.out.println(counta);


        String a = "pere";
        sona sonake= new sona(a);

        System.out.println(sonake.t2heesinemisearv('p'));
        System.out.println(sonake.t2heesinemisearv('e'));
        System.out.println(sonake.t2heesinemisearv('r'));
        System.out.println("-----------------");
        
        String l = "pere on masenduses";
        Lause lauseke= new Lause(l);

        System.out.println(lauseke.t2heesinemisearv('s'));
        System.out.println(lauseke.t2heesinemisearv('e'));
        System.out.println(lauseke.t2heesinemisearv('o'));


        System.out.println(lauseke.mitusonaon());
        
        System.out.println(Arrays.toString(lauseke.sonademasiivid()));
        System.out.println("-----------------");
        String l2 = "Jaagup on tore";
        Lause lauseke2= new Lause(l2);

        System.out.println(lauseke2.igassonaseraldi('a'));

    }
}
