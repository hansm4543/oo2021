
import java.util.*; 
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class Proovikt1 {

    public static Double akeskmine(Double x, Double y, Double z){
        /*
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        */
        Double tehe=(x+y+z);
        //System.out.println(tehe);
        Double vastus=tehe/3.0;
        
        return vastus;
    }
    public static Integer libisevkeskmine(){
        
        return -1;
    }
    public static String libisevkeskmine1(java.util.List<Double> list) {
        java.util.List<Double> list2 = new ArrayList<>();

        for (int i = 0; i < (list.size())-2; i++) {
            Double a=list.get(i);
            Double b=list.get(i+1);
            Double c=list.get(i+2);
            //System.out.println(list.get(i));
            /*System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            */
            Double arv =(akeskmine(a, b, c));
            list2.add(arv);

          
        

        }
        //System.out.println(list2.toString());
        return list2.toString();
    }
    public static void main(String [] arg) throws Exception{
        
        java.util.List<Double> list = new ArrayList<>();
        list.add(4.0); 
        list.add(8.0);
        list.add(16.0);
        list.add(32.0);
        list.add(64.0);
        list.add(128.0);

        System.out.println("Kõigepealt testime keskmise leidmis funktsiooni");
        System.out.println(akeskmine(4.0, 6.0, 8.0));
        //Väljundiks on massiiv, mis on sisendist kahe elemendi võrra lühem ning 
        //mille iga elemendi väärtuseks on sisendmassiivi vastava elemendi ning selle järgmise ja ülejärgmise elemendi keskmine.
        System.out.println("Saadame listi funktsiooni, et saada uus list");
        System.out.println(libisevkeskmine1(list));


		BufferedImage pilt=new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);
		Graphics g=pilt.createGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 300, 300);
		g.setColor(Color.RED);
		g.fillRect(50, 10, 20, 30); //x, y, laius, kأµrgus. y أ¼lalt alla
		g.fillRect(80, 10, 10, 30); 
		g.drawRect(10, 10, 30, 40);
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 30, 40);
        g.setColor(Color.RED);
        g.drawLine(45, 60, 90, 80);
        g.drawLine(45, 60, 10, 80); //joonistan MOOVING GOVERAGE
        g.setColor(Color.YELLOW);
        g.fillRect(10, 80, 80, 20); 
		g.drawLine(10, 80, 90, 80);
        g.setColor(Color.GREEN);
		//g.drawString("MAJA", 34, 80);
        //int muutuja=list2.get(0);
		//g.fillOval(10, 270-(muutuja), 15, 5);


		ImageIO.write(pilt, "png", new File("pilt1.png"));
	}
}

