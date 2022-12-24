package school.mjc.stage0.loops.task3;

public class FibonacciSeries {

    public void printFibonacci(int lastFibonacci) {
        int counter = 1;
        int prevNumber = 1;
        int currNumber = 1;
        while (counter <= lastFibonacci) {
            if (counter == 1) {
                System.out.println(0);
            } else if (counter <= 3) {
                System.out.println(1);
            } else {
                int temp = prevNumber;
                prevNumber = currNumber;
                currNumber += temp;
                System.out.println(currNumber);
            }
            counter++;
        }
    }
}