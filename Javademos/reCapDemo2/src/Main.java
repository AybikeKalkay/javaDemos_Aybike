public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // double [] myList = new double[4]; Bu ve aşağıdaki yazım birbirinin aynısı

        double [] myList = {1.2,2.3,4.5};
        double total=0;
        double max = myList[0];

        for (double number:myList) {
            if(max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }

        System.out.println("Toplam = " + total);
        System.out.println("En büyük =" + max);
    }
}