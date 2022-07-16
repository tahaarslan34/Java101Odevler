import java.util.Scanner;

public class giris {
    public static void main(String[] args) {
        /*
         Basit bir siteye giriş uygulaması. Kullanıcı adı doğru şifre yanlışsa
         şifreyi değiştirmeli bir uygulama yapmam istendi.
         */
        String userName,password,newPassword;
        Scanner input=new Scanner(System.in);

        System.out.println("Kullanici adinizi giriniz...:");
        userName=input.nextLine();

        System.out.println("Şifrenizi giriniz...:");
        password=input.nextLine();

        if(userName.equals("Patika")){
            if(password.equals("java123")){
                System.out.println("Başarılı bir şekilde giriş yaptınız.");
            }else  {
                System.out.println("Şifreniz yanlış. Şifrenizi yeniden sıfırlayabilirsiniz.\nYeni şifrenizi giriniz.");
                newPassword=input.nextLine();
                if(newPassword.equals("java123"))
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    else{
                        System.out.println("Şifre oluşturuldu.");
                    }
                

            }
        } else {
            System.out.println("Bilgileriniz yanlış.");
        }
    }
}
