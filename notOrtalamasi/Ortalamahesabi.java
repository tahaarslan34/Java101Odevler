import java.util.Scanner;

public class Ortalamahesabi {
public static void main(String[] args) {
 int mat ,fizik,kimya,biyoloji,turkce,tarih;
 Scanner inp= new Scanner(System.in);
 System.out.println("Matematik notunuz...: ");
 mat=inp.nextInt();

 System.out.println("Fizik notunuz...: ");
 fizik= inp.nextInt();

 System.out.println("Kimya notunuz...: ");
 kimya= inp.nextInt();

 System.out.println("Biyoloji notunuz...: ");
 biyoloji= inp.nextInt();

 System.out.println("Türkçe notunuz...: ");
 turkce= inp.nextInt();

 System.out.println("Tarih notunuz...: ");
 tarih= inp.nextInt();

 int toplam= (mat+fizik+kimya+biyoloji+turkce+tarih);
 double sonuc=toplam/6;

 boolean kosul=sonuc >=60;
 String sinifigecme = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
 System.out.println("Not ortalamanız...:"+ sonuc);
 System.out.println(sinifigecme);


}
    
}