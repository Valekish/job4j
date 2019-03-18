package ru.job4j.loop;

/**
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version 0.1
 * @since 19.03.19
 */
public class Counter {

    /**
     * Подсчитывает четных сумму чисел в заданном диапозоне.
     * @param start начало диапозона.
     * @param finish конец диапозона.
     * @return сумма четных чисел.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int a = start; a <= finish; a++) {
            if (a % 2 == 0) {
                sum = sum + a;
            }
        }
        return sum;
    }
}