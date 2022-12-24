package school.mjc.stage0.loops.task3;

import org.w3c.dom.ls.LSOutput;

public class GreatestCommonDivisor {

    public void printGCD(int first, int second) {
        if (first < second) {
            int temp = first;
            first = second;
            second = temp;
        }
        while (first > 0 && second > 0) {
            int tmp = first;
            first = second;
            second = tmp % second;
        }
        System.out.println(first + second);
    }
}