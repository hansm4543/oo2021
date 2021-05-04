public class sona implements liides {
  //Loo realiseeriv klass sõna tarbeks. Koosta automaattestid töö kontrolliks näitamaks a, p ja e-tähtede arvu sõnas pere.
    
  String sona;

  public sona(String sona){
  this.sona=sona;
  }

  public String t2heesinemisearv(char t2ht){
    int kordused = 0;
    for(int i=0; i<sona.length(); i++){

      if(sona.charAt(i)==t2ht){
        kordused++;
      }
    }
    return "t2hte "+ t2ht +" leidub: "+ kordused;
  }
}
