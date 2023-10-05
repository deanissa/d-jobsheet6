import java.util.Scanner;
public class Pemilihan2Percobaan306 {
public static void main (String[]args){
 Scanner input06 = new Scanner (System.in);

 String kategori;
 int penghasilan;
 double pajak= 0;
 int gajiBersih;

 System.out.print("Masukkan Kategori ");
 kategori = input06.nextLine();
System.out.print("Masukkan Besaran Penghasilan ");
penghasilan = input06.nextInt();

if (kategori.equalsIgnoreCase("perkerja")) {
    if (penghasilan <= 2000000)
    pajak = 0.1;
    else if (penghasilan <= 3000000)
    pajak = 0.15;
    else 
    pajak = 0.2;
    gajiBersih = (int) (penghasilan- (pajak * penghasilan));
    System.out.println("Penghasilan Bersih : " +gajiBersih);
}else if (kategori.equalsIgnoreCase("pebisnis")){
    if (penghasilan <=2500000)
    pajak = 0.15;
    else if (penghasilan <= 350000)
    pajak = 0.2;
    else
    pajak = 0.25;
    gajiBersih = (int) (penghasilan - (pajak * penghasilan));
    System.out.print ("Penghasilan Bersih : " + gajiBersih);
}else
System.out.println("Masukan Kategori Salah");

}
}


