public class Proov1{
	public static void main(String[] arg){
		boolean korras=true;
		double vastus=Tehted.geomeetrilineKeskmine(4, 9);
        if(Math.abs(vastus-6)>0.001){
			System.out.println("Probleem geomeetrilise keskmisega");
			korras=false;
		}		
		vastus=Tehted.geomeetrilineKeskmine(5, 20);
        if(Math.abs(vastus-10)>0.001){
			System.out.println("Probleem geomeetrilise keskmisega: 5 ja 20");
			korras=false;
		}		
		if(korras){
			System.out.println("Testid läbitud edukalt");
		}
	}
}