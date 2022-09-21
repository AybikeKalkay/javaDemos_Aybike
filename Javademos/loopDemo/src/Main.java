public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //For
        for (int i = 1; i <= 10; i++) {
            //İ++: i'yi birer artır demek
            System.out.println(i);
        }
        System.out.println("Döngü bitti.");

        for (int i = 2; i <= 10; i += 2) {
            //İ+=2: i'yi ikişer artır demek
            System.out.println(i);
        }
        System.out.println("Döngü bitti.");

        //While
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.print("While döngüsü bitti.");
        //Do-While
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.print("Do-While döngüsü bitti.");

        //Do-While ve While döngüsünün farkı: şart uymasa bile do-while bir kere çalışacakatır.

        int m = 100;
        do {

            System.out.print("Loglandı.");
            if (m < 10) {
                System.out.println(m);
            }
            m += 2;
        } while (m < 10);
        System.out.print("Do-While döngüsü bitti.");
    }

}