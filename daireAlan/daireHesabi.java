import java.util.Scanner;

public class daireHesabi {
    public static void main(String[] args) {
        /*
         Dairenin yaricapini kullanicidan alip dairenin alanini
         ve çevresini bulan program yazilacaktir
         pi=3.14 olarak alinacaktir. Alan=pi*r*r*açı/360 çevre=2*pi*r
         */
        int yaricap,aciDerecesi;
        double pi=3.14;
         Scanner input= new Scanner(System.in);
         System.out.println("Dairenin yaricapini giriniz..:");
         yaricap=input.nextInt();
         System.out.println("Merkez açisinin olcusunu giriniz...:");
         aciDerecesi=input.nextInt();

         double Alan=pi*yaricap*yaricap*aciDerecesi/360;
         System.err.println("Dairenin alani....:"+ Alan);

         double Cevre=2*pi*yaricap;
         System.out.println("Dairenin cevresi....:"+ Cevre);

}
}