package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int num = 2;
        while (num <= printTillInclusive) {
            System.out.println(num);
            num=num+2;
        }
    }
}
