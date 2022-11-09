package cycle_practice;
//Имеется число.Посчитать сумму цифр этого числа


public class Task2 {
    public static void main(String[] args) {
        System.out.println(getSum(5555515));
    }

    public static int getSum(int value){
        int result = 0;
        while (value>=10){
            result+=value%10;
            value /=10;
        }
        return result+value;
    }
}
