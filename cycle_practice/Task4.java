package cycle_practice;

//Написать скрипт, определяющий, является ли число простым
public class Task4 {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(0));
    }

    public static boolean isPrimeNumber(int number) {
        int delimeter = number - 1;
        while (delimeter > 1) {
            if (number % delimeter-- == 0) return false;
        }
        return true;
    }
}
