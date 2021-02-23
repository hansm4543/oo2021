public class Kaivitus {
    public static void main(String[] arg){

        Andmed konto2=new Andmed ("Matu", 200);
        Andmed pank=new Andmed ("Bank", 0);
        System.out.println(konto2.x + " " +  konto2.y);
        System.out.println(pank.x + " " +  pank.y);

        //teeme tehinguid
        Tehing tehing1=new Tehing ("Tavakonto", 400 , "Investeerimiskonto", 300);

        
        System.out.println(tehing1);
        tehing1.rahaliigub();
        System.out.println(tehing1.toString());
        
        
    }
}