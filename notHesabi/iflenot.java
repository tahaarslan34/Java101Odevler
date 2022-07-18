import java.util.Scanner;

public class iflenot {
    /*
     Verilen derslerin notlarını kullanıcıdan alıp ortalama 
     hesabı yapılıyor. Fakat özel istek üzerine girilen
     not 0'dan düşük ya da 100'den büyük olursa değeri
     0 olarak giriliyor.
     */
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner input=new Scanner(System.in);
        
        System.out.println("Matematik notunuz...:");
        mat=input.nextInt();
        System.out.println("Fizik notunuz...:");
        fizik=input.nextInt();
        System.out.println("Türkçe notunuz...:");
        turkce=input.nextInt();
        System.out.println("Kimya notunuz...:");
        kimya=input.nextInt();
        System.out.println("Müzik notunuz...:");
        muzik=input.nextInt();

        if(mat<0|| mat >100)
        mat=0;
        if(fizik<0|| fizik>100)
        fizik=0;
        if(turkce<0|| turkce>100)
        turkce=0;
        if(kimya<0|| kimya>100)
        kimya=0;
        if(muzik<0|| muzik>100)
        muzik=0;

        int average=(mat+fizik+turkce+kimya+muzik)/5;
         if(average>=55){
            System.out.println("Geçtin kardeş hadi gine iyisin");
        }else {
            System.out.println("Sene tekrarı");
        }
        System.out.println("Bu seneki ortalaman...:"+ average);
   
    }
}
