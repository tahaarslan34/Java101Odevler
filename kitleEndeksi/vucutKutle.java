import java.util.Scanner;

public class vucutKutle {
    public static void main(String[] args) {
        /*
        Kullanicidan boy ve kilo degerlerini alarak vucut kitle 
        endeksine ulasacagiz. Vucut kutle endeksi=Kilo/(Boy*Boy)
         */
        Scanner girdi= new Scanner(System.in);
        System.out.println("Boyunuzu giriniz (m cinsinden)");
        float boy=girdi.nextFloat();
        System.out.println("Kilonuzu giriniz (kg cinsinden)");
        int kilo=girdi.nextInt();
        double kutleEndeksi=kilo/(boy*boy);
        System.out.println("Vucut kitle endeksiniz...:"+ kutleEndeksi);


    }  
}
