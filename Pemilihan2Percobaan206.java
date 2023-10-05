/**
 * Pemilihan2Percobaan206
 */
import java.util.Scanner;
public class Pemilihan2Percobaan206 {
    public static void main (String[]args){
        Scanner input06 = new Scanner (System.in);
       int sudut1, sudut2, sudut3;
       double totalSudut;

        System.out.println ("Masukkan sudut 1 ");
        sudut1 = input06.nextInt();
        System.out.println ("Masukkan sudut 2 ");
        sudut2 = input06.nextInt();
        System.out.println ("Masukkan sudut 3 ");
        sudut3 = input06.nextInt();

        totalSudut= sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
            System.out.println ("Segitiga tersebut adalah segitiga siku-siku");
            if ((sudut1 == 60) || (sudut2 == 60) || (sudut3 == 60))
            System.out.println ("Segitiga tersebut adalah segitiga sama sisi");
            if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut1 == sudut3)) 
            System.out.println ("Segitiga tersebut adalah segitiga Kaki");
        }else
        System.out.println ("Segitiga tersebut adalah segitiga Sembarang");
        }

    }
    
    
