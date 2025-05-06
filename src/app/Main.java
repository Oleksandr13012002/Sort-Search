package app;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static final int ARRAY_BOUND = 100;
    public static final int ARRAY_SIZE = 20;

    public static void main(String... args){
        int[] array = new int[ARRAY_SIZE];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(ARRAY_BOUND);
        }

        System.out.println("Початковий масив: " + Arrays.toString(array));

        ArrayUtils.mergeSort(array);
        System.out.println("Відсортований масив: " + Arrays.toString(array));

        int existingTarget = array[random.nextInt(array.length)];
        int nonExistingTarget = ARRAY_BOUND + 1;

        showBinarySearchResult(array, existingTarget);
        showBinarySearchResult(array, nonExistingTarget);
    }

    public static void showBinarySearchResult(int[] array, int value){
        int index = ArrayUtils.binarySearch(array, value);

        if(index == -1)
            System.out.println("Значення " + value + " відсутнє в масиві");
        else
            System.out.println("Шукаємо число " + value + ", знайдено на індексі: " + index);
    }
}
