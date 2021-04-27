public class Programm {
    public static void main(String[] args) {
        Jook j1 = new Jook("DrPepper", 5.5, 3);
        Joogipudel p1 = new Joogipudel(10.0, "purk", 0.5, 0.1);


        System.out.println(j1.nimetus);
        System.out.println(p1.pudelityyp);


        p1.lisaJook(j1);
        System.out.println(p1.massKoosJoogiga());
        System.out.println(p1.hindKoosJoogiga());
    }
}
