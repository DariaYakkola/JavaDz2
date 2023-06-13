package HomeWork;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 22, 33, 44, 5, -5, -3, 23, -7};
        System.out.println(Arrays.toString(replaceArray(array)));
    }

    /**
     * @param arr массив целых чисел
     * @return измененный массив целых чисел
     * @apiNote Дан массив целых чисел. Заменить отрицательные элементы на сумму
     * индексов двузначных элементов массива.
     */
    public static int[] replaceArray(int[] arr) {
        int sumIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 10 && arr[i] < 100) | (arr[i] <= -10 && arr[i] > -100)) {
                sumIndex += i;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                arr[j] = sumIndex;
            }
        }
        return arr;
    }
}
