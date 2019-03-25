package ru.job4j.array;

/**
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version 0.1
 * @since 25.03.19
 */
public class MatrixCheck {

    /**
     * Проверка true/false по диагоналям в матрице.
     * @param data двухмерный массив.
     * @return значение массива.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int index = 0; index < data.length - 1; index++) {
                if (data[index][index] != data[index + 1][index + 1]) {
                    result = false;
                    break;
                }
                if (data[index][data.length - index - 1] != data[index + 1][data.length - index - 2]) {
                    result = false;
                    break;
                }
        }
        return result;
    }
}