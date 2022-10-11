package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 1;
        int sum = 1;
        if (printToInclusive != 0) {
            while (counter <= printToInclusive+1) {
                System.out.println(sum);
                sum = sum * counter;
                counter++;
            }
        } else {
            System.out.println("1");
        }
    }
}
