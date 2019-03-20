package ru.job4j.array;

/**
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version 0.1
 * @since 20.03.19
 */
public class Square {

    /**
     * Заполняет массив степенями чисел.
     * @param bound массив.
     * @return число в степени 2.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int a = 0; a != bound; a++) {
            rst[a] = (a + 1) * (a + 1);
        }
        return rst;
    }
}