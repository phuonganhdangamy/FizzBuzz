public class Multiples {
    public static void main(String[] args) {
        int countMultiples = 0;
        int i = 1;
        while (i < 1000) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 || divisibleBy5) {
                System.out.println(i);
                countMultiples += 1;
            }
            i = i + 1;
        }
        System.out.println("There are " + countMultiples + " multiples of 3 and 5");
    }
}
