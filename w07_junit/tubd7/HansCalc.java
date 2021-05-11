public class HansCalc implements KalkulaatoriLiides {
    String vaartus, memory;
    int liitmine = 0;
    int liidetav = 0;
    
    public void vajutus(String nupp){
        String sisestus = nupp;
        if(nupp.equals("C")){
            this.vaartus = "0";
        }else if(nupp == null){
            this.vaartus = "0";
        }else{
            if(memory == null){
                this.vaartus = sisestus;
                this.memory = sisestus;
            }else if(sisestus.equals("+")){
                liidetav = Integer.parseInt(memory);
                liitmine = 1;
            }else if(liitmine == 1){
                int arvutus = Integer.parseInt(sisestus) + liidetav;
                this.vaartus = sisestus;
                this.memory = String.valueOf(arvutus);
                liitmine = 0;
            }else if(sisestus.equals("=")){
                this.vaartus = this.memory;
            }else{
                this.memory += sisestus;
                this.vaartus = memory;
            }
        }

    }
    
    public String kuvatav(){
        if (vaartus != "0"){return vaartus;}
        return "0";
    }
}
