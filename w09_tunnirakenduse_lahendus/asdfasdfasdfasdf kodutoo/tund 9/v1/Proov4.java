public class Proov4 {

    public static void kuvaOlek(Voolujuht v){
        if(v.kasJuhib()){
            System.out.println("Juhib");
        }else{
            System.out.println("ei Juhi");
        }
    }
    public static void main(String[] args){
        
        Lyliti l1 = new Lyliti();
        l1.seisund(true);
        Lyliti l2 = new Lyliti();
        Pooraja p1 = new Pooraja(l2);
        p1.seisund(false);


        Jadayhendus j1 = new Jadayhendus();
        j1.lisa(l1);
        j1.lisa(l2); // valesti


        

        Lyliti l3 = new Lyliti();
        l3.seisund(false);
        Lyliti l4 = new Lyliti();
        l4.seisund(true);

        Jadayhendus j2 = new Jadayhendus();
        j2.lisa(l3);
        j2.lisa(l4);



        Roopyhendus r1 = new Roopyhendus();
        r1.lisa(j1);
        r1.lisa(j2);
        kuvaOlek(r1);

        System.out.println("-------------------------");
        kuvaOlek(j1);
        kuvaOlek(j2);


    }
}