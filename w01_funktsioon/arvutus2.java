public class arvutus2{
	public static void main(String[] arg){
		System.out.println("argumente:"+arg.length);
		//pead programmile saatma greenys käivitades nimed ja loeb kokku mitu argumenti
		if(arg.length==1){
		System.out.println("Ainuke: "+arg[0]);
		}
		if(arg.length==2){
			System.out.println("Loodetavasti kaks arvu");
			int arv1=Integer.parseInt(arg[0]);
			int arv2=Integer.parseInt(arg[1]);
			System.out.println(arv1*arv2);
		}
		//kui kolm arvu kuvage nende summa
		if(arg.length==3){
			System.out.println("Loodetavasti kolm arvu");
			int arv1=Integer.parseInt(arg[0]);
			int arv2=Integer.parseInt(arg[1]);
			int arv3=Integer.parseInt(arg[2]);
			System.out.println(arv1+arv2+arv3);
		}
		
		for(String a: arg){
			System.out.println(a);
		}
		for(int i=0; i<arg.length; i++){
		System.out.println("Kohal "+ i +" on "+ arg[i]);
		}
		//4 ja rohkema arvu puhul kuvage arvude summa tsükli abil
		//10.15 ja edasi
		if(arg.length>3){
			int summa=0;
			for(int i=0; i<arg.length; i++){
				int arv1=Integer.parseInt(arg[i]);
				summa=(int)(summa+(int)arv1);
				
				//System.out.println(summa);
				
			} 
			System.out.println(summa);
		}
		
		
	}
}
