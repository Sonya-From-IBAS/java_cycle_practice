package cycle_practice;

import java.util.Date;

//Написать скрипт для вычисления суммы, которую получил бы человек, положивший N-ую сумму денег под 5% в банк.
//Вклад должен совершиться с начала открытия банка(1626 год) по сегодняшний год.
public class Task3 {
    public static void main(String[] args) {
        System.out.println(getPercents(100));

    }

    public static double getPercents(double initMoney) {
        double result = initMoney;
        for(int year = 1627; year < 2022; year++) {
            result = result +        result * 0.05;
        }
        return result;
    }

}
