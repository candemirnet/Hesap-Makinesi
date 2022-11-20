import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner imp = new Scanner(System.in);
        int n1, n2 , secim;

        System.out.print("Birinci Sayıyı Giriniz: ");
        n1 = imp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = imp.nextInt();

        System.out.println("1.Toplama \n2.Çıkarma \n3.Çarpma \n4.Bölme");

        System.out.print("Lütfen Yapmak istediğiniz işlemin numarasını giriniz: ");
        secim = imp.nextInt();

        switch (secim){
            case 1:
                System.out.println("Toplama: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.println("Sayı 0'a Bölünmez!");
                        break;
                    default:
                        System.out.println("Bölme: " + n1 / n2);
                }
                break;
            default:
                System.out.println("Yanlış Bir Tuşlama Yaptınız!");
        }
    }
}