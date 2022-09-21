public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int number = 25;
        int remainder = number % 2;
        System.out.println(remainder);
        //ilk etapta sayıyı asal kabul ediyoruz.
        boolean isPrime = true;

//        if(number%2>0);
//        System.out.println(remainder);

        if(number==1) {
            System.out.println("Sayı asal değildir.");
            return;
        }

        if(number<1){
            System.out.print("Geçersiz sayı");
        }
        // 2'den 24'e kadar bütün sayıları 25'e bölmeye çalışacağız.
        for(int i =2; i<number; i++) {
            if(number % i == 0) {
                isPrime = false;
            }
        }

        if(isPrime) {
          System.out.println("Sayı asaldır.");
        } else {
            System.out.println("Sayı asal değildir.");
        }
    }
}