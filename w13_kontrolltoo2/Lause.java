import java.util.*;
import java.io.*;

public class Lause implements liides {

    // Loo liidest realiseeriv klass Lause. 
    //Lauselt saab lisaks küsida sõnade arvu ning Sõna-klassi eksemplaride massiivi. 
    //Koosta rakendus, kus saab ette anda lause ning väljastatakse a-tähtede arv 
    //Koostaterves lauses ning igas sõnas eraldi. Koosta automaattest lause a-tähtede arvu kontrolli õigsuse kohta.

    String lause;

    public Lause(String lause){
    this.lause=lause;
    }
    public String mitusonaon(){
      int mitu = 0;
      String[] arrOfStr = this.lause.split(" ");
      if(this.lause != null){
        mitu=arrOfStr.length;
      }
        
      return "Sonu on kokku: " + mitu;
    }

    public String[] sonademasiivid()  {  
      String[] arrOfStr=this.lause.split(" ");  
      return arrOfStr;
    }

    public String igassonaseraldi(char a){
      String[] arrOfStr=this.lause.split(" ");
      int kordusedkokku= 0;

      for(int i=0; i<arrOfStr.length; i++){
        int kordused = 0;
        for(int j=0; j<arrOfStr[i].length(); j++){
    
          if(arrOfStr[i].charAt(j)==a){
            kordused++;
            kordusedkokku++;
          }
        }
        System.out.println("t2hte "+ a +" leidub sonas "+ arrOfStr[i] +" "+ kordused);
        
      }
      return "Kokku on selles lauses: "+kordusedkokku;
    }

    public String t2heesinemisearv(char t2ht){
        int kordused = 0;
        for(int i=0; i<this.lause.length(); i++){
    
          if(this.lause.charAt(i)==t2ht){
            kordused++;
          }
        }
        return "t2hte "+ t2ht +" leidub lauses: "+ kordused;
    }
    public String kirjutafaili() throws IOException{

      PrintWriter pw=new PrintWriter(new FileWriter("vastus.txt"));
      String[] arrOfStr=this.lause.split(" ");
      //String[] jubakirjutatud = new String[] {};
      ArrayList<String> kirjutatud = new ArrayList<String>();

      List<String> all = new ArrayList<String>();
	    all = Arrays.asList(arrOfStr);

      for(int i=0; i<all.size(); i++){
        String sona = all.get(i);
        if(kirjutatud.contains(sona)){
          
        }else{
          pw.println(sona);
          kirjutatud.add(sona);
        }
        
      }
      pw.println("-----------------------"); 	
      pw.println("Fail kirjutatud!");
      pw.close();

      for (int i = 0; i < kirjutatud.size();i++) 
      { 		      
        System.out.println(kirjutatud.get(i)); 		
      } 
      System.out.println("-----------------------"); 	  
      return "Programm toimis!";
    }
}
