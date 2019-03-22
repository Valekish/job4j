package ru.job4j.array;

/**
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version 0.1
 * @since 22.03.19
 */
public class Turn {

    /**
     * Переворачивает массив.
     * @param array массив.
     * @return перевернутый массив.
     */
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }
}