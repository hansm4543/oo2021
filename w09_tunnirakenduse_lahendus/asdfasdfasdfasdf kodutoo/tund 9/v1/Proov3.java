public class Proov3 {

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
        //kuvaOlek(l1);
        Lyliti l2 = new Lyliti();
        l2.seisund(false);
        Roopyhendus r1 = new Roopyhendus();
        r1.lisa(l1);
        r1.lisa(l2);
        kuvaOlek(r1);

        System.out.println("-------------------------");

        Lyliti l3 = new Lyliti();
        l3.seisund(true);

        Jadayhendus j1 = new Jadayhendus();
        j1.lisa(l3);
        j1.lisa(r1);

        kuvaOlek(j1);




    }
}