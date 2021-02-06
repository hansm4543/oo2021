import java.util.Scanner;  // Import the Scanner class
import java.util.*; 
import java.util.function.Supplier; 



public class kodutoo{   
    

    
    //m4 ak, awp, p90, deagle
    //100hp + 100hp armor
    //palju dmg saab


    /*
	public static Float mituhitipeabsaama(float km){
		float summa=3;
		summa=summa+(km*(float)0.8);
		return summa;
	}
    */
    public static String mituhitipeabsaama(String relv, String armor){
        //if(relv.equals("ak")){return "5hiti!";}
       
        if(relv.equals("ak")){

            if(armor.equals("y")){
                return "Kuna vastasel armor siis peab ak-47 tegema 10 hiti, et vaenlast mõrvata!";
            }else{
                return "Kuna vastasel puudub armor siis peab ak-47 tegema ainult 5 hiti, et vaenlast mõrvata!";
            }
        }
        
        if(relv.equals("m4")){

            if(armor.equals("y")){
                return "Kuna vastasel armor siis peab m4 tegema 14 hiti, et vaenlast mõrvata!";
            }else{
                return "Kuna vastasel puudub armor siis peab m4 tegema ainult 7 hiti, et vaenlast mõrvata!";
            }
        }
        if(relv.equals("awp")){

            if(armor.equals("y")){
                return "Kuna vastasel armor siis peab awp tegema 1 hiti näkku, et vaenlast mõrvata! Mujale lastes peab 2 korda hittima.";
            }else{
                return "Kuna vastasel puudub armor siis peab awp tegema ainult 1 hiti, et vaenlast mõrvata!";
            }
        }
        if(relv.equals("deagle")){

            if(armor.equals("y")){
                return "Kuna vastasel armor siis peab deagle tegema 12 hiti, et vaenlast mõrvata!";
            }else{
                return "Kuna vastasel puudub armor siis peab dealge tegema ainult 6 hiti, et vaenlast mõrvata!";
            }
        }
        if(relv.equals("p90")){

            if(armor.equals("y")){
                return "Kuna vastasel armor siis peab p90 tegema 20 hiti, et vaenlast mõrvata!";
            }else{
                return "Kuna vastasel puudub armor siis peab awp tegema ainult 10 hiti, et vaenlast mõrvata!";
            }
        }
            
        
        return "Valisid relva, mida nimekirjas pole. Seekord said kahjuks KUULI! :(.";

	}
    //System.out.println(mituhitipeabsaama(String armor));
    //System.out.println(temperatuuriHinnang(Integer.parseInt(arg[0])));
	
    public static void main(String[] args){

        // For ArrayList 
        List<String> list = new ArrayList<String>(); 
        list.add("ak"); 
        list.add("m4");
        list.add("awp");
        list.add("deagle");
        list.add("p90");
        System.out.println("Relvade valik: " + list.toString()); 
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Vali relv nimekirjast");
        String relv = myObj.nextLine();  // Read user input
        System.out.println("Valisid relvaks: " + relv);  // Output user input
        

        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Kas vastasel on armor y/n?");
        String armor = myObj.nextLine();  // Read user input
        if(armor.equals("y")){
			System.out.println("Vastasel on armor");  // Output user input
		}
        System.out.println(mituhitipeabsaama(relv, armor));
        


	

		
	}
}
