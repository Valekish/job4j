package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version 0.1
 * @since 26.03.19
 */
public class ArrayDuplicate {

    /**
     * Удаление дубликатов из массива.
     * @param array массив.
     * @return массив без дубликатов.
     */
    public String[] remove(String[] array) {
        int length = array.length;
        for (int index = 0; index < length; index++) {
            for (int index2 = index + 1; index2 < length; index2++) {
                if (array[index].equals(array[index2])) {
                    array[index2] = array[length - 1];
                    length--;
                    index2--;
                }
            }
        }
        return Arrays.copyOf(array, length);
    }
}
