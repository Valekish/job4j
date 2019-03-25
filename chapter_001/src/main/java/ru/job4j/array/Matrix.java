package ru.job4j.array;

/**
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version 0.1
 * @since 25.03.19
 */
public class Matrix {

    /**
     * Таблица умножения через матрицу.
     * @param size размер таблицы.
     * @return таблица со значениями.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int index = 0; index < table.length; index++) {
            for (int index2 = 0; index2 < table.length; index2++) {
                table[index][index2] = (index + 1) * (index2 + 1);
            }
        }
        return table;
    }
}