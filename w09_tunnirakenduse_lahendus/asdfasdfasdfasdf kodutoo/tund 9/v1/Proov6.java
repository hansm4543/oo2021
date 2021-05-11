public class Proov6{
    public static void kuvaOlek(Voolujuht v){
        if(v.kasJuhib()){
            System.out.println("Juhib");
        } else {
            System.out.println("Ei juhi");
        }
    }
    public static void main(String[] arg){
        Lyliti l1=new Lyliti();
        Lyliti l2=new Lyliti();
        Lyliti l3=new Lyliti();
        Lyliti l4=new Lyliti();
        Lyliti l5=new Lyliti();
        Lyliti l6=new Lyliti();
        Lyliti l7=new Lyliti();
        Lyliti l8=new Lyliti();
        Lyliti l9=new Lyliti();
        Lyliti l10=new Lyliti();
        Lyliti l11=new Lyliti();
        Lyliti l12=new Lyliti();


        Roopyhendus r1=new Roopyhendus();
        r1.lisa(l10); r1.lisa(l11);

        Roopyhendus r2=new Roopyhendus();
        r2.lisa(l8); r2.lisa(l9);

        Jadayhendus j1=new Jadayhendus();
        j1.lisa(r1); j1.lisa(l7);

        Roopyhendus r3=new Roopyhendus();
        r3.lisa(j1); r3.lisa(l6);

        Jadayhendus j2=new Jadayhendus();
        j2.lisa(r3); j2.lisa(l4); j2.lisa(l2);

        Jadayhendus j3=new Jadayhendus();
        j3.lisa(l3); j3.lisa(l5); j3.lisa(r2);

        Roopyhendus r4=new Roopyhendus();
        r4.lisa(j2); r4.lisa(j3);

        Jadayhendus j4=new Jadayhendus();
        j4.lisa(l1); j4.lisa(r4); j4.lisa(l12);

        

        Pooraja p1=new Pooraja(l3); // B
        Pooraja p2=new Pooraja(l7); // D
        Pooraja p3=new Pooraja(l10); // E

        Pooraja p4=new Pooraja(l12); // F


        Sisend a=new Sisend();
        a.lisa(l1);
        Sisend b=new Sisend();
        b.lisa(l2); b.lisa(p1);
        Sisend c=new Sisend();
        c.lisa(l4); c.lisa(l5);
        Sisend d=new Sisend();
        d.lisa(l6); d.lisa(p2); d.lisa(l8); d.lisa(l9);
        Sisend e=new Sisend();
        e.lisa(l11); e.lisa(p3);
        Sisend f=new Sisend();
        f.lisa(p4);

        a.seisund(true); b.seisund(true);
        c.seisund(true); d.seisund(false);
        e.seisund(true); f.seisund(false);
        kuvaOlek(j4);
    }
}