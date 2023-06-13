package HomeWork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько будет чисел? ");
        int n = sc.nextInt();
        System.out.println("Сумма просытх чисел: " + sumPrimeNum(n, sc));
    }

    /**
     * @param number целочисленное число, которое отвечает за размер последовательности чисел
     * @param in     сканер
     * @return сумма простых чисел в последовательности
     * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел.
     */
    public static int sumPrimeNum(int number, Scanner in) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            System.out.println("Введите число: ");
            int num = in.nextInt();
            int count = 0;
            if (num != 1) {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    sum += num;
                }
            }
        }
        return sum;
    }
}
