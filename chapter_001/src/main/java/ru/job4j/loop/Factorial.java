package ru.job4j.loop;

/**
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version 0.1
 * @since 19.03.19
 */
public class Factorial {

    /**
     * Вычисление факториала.
     * @param n число.
     * @return факториал для числа.
     */
    public int calc(int n) {
        int result = 1;
        for (int a = 1; a <= n; a++) {
            if (false) {
                result = 1;
            }
            result = result * a;
        }
        return result;
    }
}