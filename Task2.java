package HomeWork;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько будет чисел? ");
        int n = sc.nextInt();
        subsequence(n, sc);
    }

    /**
     * @param number целочисленное число, которое отвечает за размер последовательности чисел
     * @param in     сканер
     * @apiNote Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
     */
    public static void subsequence(int number, Scanner in) {
        System.out.println("Введите число: ");
        int firstNumber = in.nextInt();
        System.out.println("Введите число: ");
        int secondNumber = in.nextInt();
        int result = 0;
        for (int i = 0; i < number - 2; i++) {
            if (firstNumber < secondNumber) {
                firstNumber = secondNumber;
                System.out.println("Введите число: ");
                secondNumber = in.nextInt();
            } else {
                result = 1;
            }
        }
        if (firstNumber > secondNumber) {
            result = 1;
        }
        if (result == 1) {
            System.out.println("Последовательность НЕ возрастает! ");
        } else {
            System.out.println("Последовательность возрастает! ");
        }
    }
}
