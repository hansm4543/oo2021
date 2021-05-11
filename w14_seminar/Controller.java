import java.util.*;
public class Controller {
    public static void main(String args []) {


        System.out.print("Mitu numbrit tahad masiivi panna: ");
        Scanner N = new Scanner(System.in);
        int C = N.nextInt();


        int[] mas = new int[C]; // loome massiivi ning anname talle mitu kohta tal on
        for (int i = 0; i < C; i++) {
            Scanner b = new Scanner(System.in);
            System.out.print("Sisesta number tahad masiivi panna: ");
            mas[i] = b.nextInt();  // sisestame masiivi kohale i numbri
        }
        String masString = Arrays.toString(mas);  // teeme arrayst stringi et saaks teda printida
        System.out.println(masString);
    }
}