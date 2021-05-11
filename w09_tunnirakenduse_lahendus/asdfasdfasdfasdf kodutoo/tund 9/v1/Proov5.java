public class Proov5{
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
        Jadayhendus j1=new Jadayhendus();
        j1.lisa(l1); j1.lisa(l2);
        Jadayhendus j2=new Jadayhendus();
        j2.lisa(l3); j2.lisa(l4);
        Roopyhendus r=new Roopyhendus();
        r.lisa(j1);
        r.lisa(j2);
        Pooraja p3=new Pooraja(l3);
        Pooraja p4=new Pooraja(l4);
        Sisend a=new Sisend();
        a.lisa(l1); a.lisa(p3);
        Sisend b=new Sisend();
        b.lisa(l2); b.lisa(p4);
        a.seisund(false); b.seisund(false);
        kuvaOlek(r);
        Jadayhendus j3=new Jadayhendus();
        j3.lisa(r);
        j3.lisa(l3);
        kuvaOlek(j3);
        
    }
}