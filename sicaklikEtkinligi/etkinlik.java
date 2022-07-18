import java.util.Scanner;

public class etkinlik {
      /*
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. */
    public static void main(String[] args) {
      int heat;
      System.out.println("Sıcaklık değerini giriniz...:");
      Scanner input=new Scanner(System.in);
      heat=input.nextInt();

      if(heat<5){
        System.out.println("Kayak yapabilirsiniz");
      } else if (heat<15){
        System.out.println("Sinemaya gidebilirsin");
      } else if (heat==15){
        System.out.println("Hem sinemaya hem de pikniğe gidebilirsiniz.");
      } else if (heat<=25){
        System.out.println("Pikniğe gidebilirsiniz.");
      } else {
        System.out.println("Yüzmeye gidebilirsiniz.");
      }
    }
}











