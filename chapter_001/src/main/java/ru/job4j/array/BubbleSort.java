package ru.job4j.array;

/**
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version 0.1
 * @since 23.03.19
 */
public class BubbleSort {

    /**
     * Bubble sort.
     * @param array массив.
     * @return отсортированный массив.
     */
    public int[] sort(int[] array) {
        for (int index = 0; index < array.length; index++) {
            for (int index2 = 1; index2 < array.length - index; index2++) {
                if (array[index2 - 1] > array[index2]) {
                    int temp = array[index2 - 1];
                    array[index2 - 1] = array[index2];
                    array[index2] = temp;
                }
            }
        }
        return array;
    }
}
