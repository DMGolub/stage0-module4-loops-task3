package school.mjc.stage0.loops.task3;

public class NinesSum {

    public void calculateSum(int lengthOfLastNumber) {
        int counter = 1;
        int sum = 0;
        int currNumber = 0;
        while (counter <= lengthOfLastNumber) {
            currNumber = currNumber * 10 + 9;
            sum += currNumber;
            counter++;
        }
        System.out.println(sum);
    }
}