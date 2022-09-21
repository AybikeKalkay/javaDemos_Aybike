public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

      /*  char harf = 'A';
        boolean kalınUnlu = true;

        //1.Kalın ünlüler: a, ı, o, u
        //2.İnce ünlüler: e, i, ö, ü

        char kalınUnluler [] = new char[4];
        kalınUnluler[0]="A";
        kalınUnluler[1]="I";
        kalınUnluler[2]="O";
        kalınUnluler[3]="U";

        for(int i = 0; i<kalınUnluler.length;i++) {
            if(kalınUnlu) {
                System.out.println("İnce ünlüdür.");
            }
            else {
                System.out.println("Kalın ünlüdür.");
        }

        }*/

        char harf = 'E';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.print("İnce sesli harf");
        }


    }
}