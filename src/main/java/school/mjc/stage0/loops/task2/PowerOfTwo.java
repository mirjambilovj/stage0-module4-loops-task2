package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int pow = 1;
        //int sum = 1;
        if (power > 0) {
            while (pow <= (power * power)){
            System.out.println(pow);
            pow=pow * 2;}
            //sum = sum * pow;
        } else if (power == 0){
            System.out.println("1");
        } else {
            System.out.println("too much power");
        }
    }
}
