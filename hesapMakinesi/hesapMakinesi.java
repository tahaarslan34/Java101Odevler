import java.util.Scanner;

public class fiyatHesabi {
    /*
     Kullanıcıdan 2 sayı alarak 4 işlem yapan
     hesap makinesi
     */
    public static void main(String[] args) {
        int n1,n2,secim;
        Scanner input=new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz...:");
        n1=input.nextInt();
        System.out.println("İkinci sayiyi giriniz...:");
        n2=input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        secim=input.nextInt();
        switch(secim){
            case 1 :
            System.out.println(n1+n2);
            break;

            case 2 :
            System.out.println(n1-n2);
            break;

            case 3:
            System.out.println(n1*n2);
            break;
            
            case 4 :
            if (n2!=0)
            System.out.println(n1/n2);
            else
            System.out.println("Bölünen sayı 0 olamaz.");
            break;

            default:
            System.out.println("Farklı bir durum seçtiniz. Lütfen tekrar deneyiniz.");
        
        }
    }
}
