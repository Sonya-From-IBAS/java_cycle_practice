package cycle_practice;
//Написать программу высчитывающую факторил целого числа

public class Task1 {
    public static void main(String[] args) {
        System.out.println(getFactorial(6));
        System.out.println(getFactorialRec(6));
    }

    public static int getFactorial(int value){
        int result = 1;
        for(int i = 1; i < value+1 ; i++) {
            result*=i;
        }
        return result;
    }
    public static int getFactorialRec(int value){
        if(value==1) return 1;
        return value*getFactorialRec(value-1);
    }
}
