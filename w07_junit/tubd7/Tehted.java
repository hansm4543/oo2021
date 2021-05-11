public class Tehted{
    /*	public static double geomeetrilineKeskmine(double a, double b){
            return Math.sqrt(a*nb);
        }*/
        public static double geomeetrilineKeskmine(double ... arvud){
            double puhver=1;
            for(double a: arvud){
                puhver*=a;
            }
            return Math.pow(puhver, 1.0/arvud.length);
        }

        public static double harmoonilineKeskmine(double a, double b){
            return 2.0/(1.0/a+1.0/b);
        }
}