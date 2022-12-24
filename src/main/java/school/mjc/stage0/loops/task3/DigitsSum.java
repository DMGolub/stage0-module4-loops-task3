package school.mjc.stage0.loops.task3;

public class DigitsSum {

    public void printDigitsSum(int t) {
        int sum = 0;
        if (t < 0) {
            t *= -1;
        }
        while (t != 0) {
            sum += t % 10;
            t /= 10;
        }
        System.out.println(sum);
    }
}