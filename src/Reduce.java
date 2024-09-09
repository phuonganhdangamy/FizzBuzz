public class Reduce {
    public static void main(String[] args) {
        //Goal: prints how many steps it takes to reach 0 if you start at 100
        int stepTaken = 0;
        int i = 100; // our original number
        while (i > 0) {
            boolean isEven = i % 2 == 0;
            if (isEven) {
                i = i / 2;
                stepTaken++;
            }
            else {
                i = i - 1;
                stepTaken++;
            }
        }
        System.out.println("To reduce 100 to 0, it takes " + stepTaken + " steps.");
    }
}
