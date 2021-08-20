import java.util.Scanner;

public class hey {
    public static void main(String[] args) {
        String a,b,c,d;
        Scanner input= new Scanner(System.in);
System.out.println("Kullanıcı adınız: ");
a= input.nextLine();
System.out.println("Şifreniz: ");
b= input.nextLine();
if(b.equals("senaa")) {
    System.out.println("Başarılı giriş yaptınız.");


}
else {
    System.out.println("Şifrenizi sıfırlamak ister misiniz?");
    c= input.nextLine();
    if(c.equals("evet")) {
        System.out.println("Yeni şifreniz: ");
        d= input.nextLine();
        if(d.equals("senaa")||d.equals(b)) {
            System.out.println("Şifre oluşturulamadı,lütfen yeni bir şifre giriniz.");

        } else {
            System.out.println("Yeni şifre oluşturuldu.");
        }


    }

        }
    }


}
