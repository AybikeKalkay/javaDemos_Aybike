public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        char grade = 'D';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel: Geçtiniz.");
                break;
            case 'B':
                System.out.println("Çok güzel: Geçtiniz.");
                break;
            case 'C':
            case 'D':
                System.out.println("Fena değil: Geçtiniz.");
                break;
            case 'F':
                System.out.println("Kaldınız.");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");

                //ctrl + shift + alt + L : Bozulan kodu düzeltme


        }
    }


}