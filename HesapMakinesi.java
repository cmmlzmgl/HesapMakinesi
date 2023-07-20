import java.util.Scanner;

class HesapMakinesi
{
    public static void main(String []argh)
    {

        Scanner input = new Scanner(System.in);

        int number1, number2, choose;

        System.out.print("Lütfen İlk Sayıyı Giriniz: ");
        number1 = input.nextInt();
        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        number2 = input.nextInt();
        System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz (Toplama = 1, Çıkarma = 2, Çarpma = 3, Bölme = 4): ");
        choose = input.nextInt();

        switch (choose)
        {
            case 1:
                int toplam = number1 + number2;
                System.out.print("İşleminizin Sonucu: " + toplam);
                break;

            case 2:
                int fark = number1 - number2;
                System.out.print("İşleminizin Sonucu: " + fark);
                break;
            case 3:
                int carpim = number1 * number2;
                System.out.print("İşleminizin Sonucu: " + carpim);
                break;
            case 4:
                double bolum = number1 / number2;
                System.out.print("İşleminizin Sonucu: " + bolum);
                break;
        }

    }
}
