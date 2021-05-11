import java.util.*;
public class Jadayhendus extends Hulgiyhendus{
	public boolean kasJuhib(){
		for(Voolujuht v: hoidla){
			if(v.kasJuhib()==false){return false;}
			
		}
		return true;
	}  
}