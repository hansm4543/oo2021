public class Programm {
    public static void main(String[] args) {
        Kondimine k = new Kondimine(true, "Nike", 37);
        System.out.println(k.onvoiei);
        System.out.println(k.JalanouFirma());

        Jooksmine j = new Jooksmine(30, "Addidas", 25);
        System.out.println(j.weight);
        System.out.println(j.JalanouFirma());
        System.out.println(j.JalanouSuurus());

        System.out.println(k.Kasonkondimisejaoks());
    }
}
