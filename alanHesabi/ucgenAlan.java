import java.util.Scanner;

public class ucgenAlan {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("Ücgenin üç kenarını giriniz.");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        int u=(a+b+c)/2;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı...: "+ alan);
        System.out.println("Üçgenin çevresi...: "+ 2*u);


        
    }
}
