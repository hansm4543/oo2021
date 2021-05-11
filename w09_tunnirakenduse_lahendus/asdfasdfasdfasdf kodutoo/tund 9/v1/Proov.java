public class Proov {

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
        kuvaOlek(l1);
    }
}
