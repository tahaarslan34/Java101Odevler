import java.util.Scanner;

public class kdvhesapla {
    public static void main(String[] args) {
double fiyat,kdvOrani,kdvTutari;
        Scanner inp = new Scanner(System.in);
         fiyat=inp.nextDouble();

        boolean kosul= fiyat>1000;
         kdvOrani =  kosul ? 0.08d : 0.18d;

        System.out.println("Kdv orani...:"+kdvOrani);

         kdvTutari= fiyat*kdvOrani;

        System.out.println("Kdv'siz fiyat...:"+ fiyat );
        System.out.println("Kdv'li fiyat....:"+ fiyat*(1+kdvOrani));
        System.out.println("Kdv tutari....:" + kdvTutari);
    }
}
