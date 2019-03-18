package ru.job4j.condition;

/**
 * @author Valentin Kirjan (valekishwork@mail.ru)
 * @version 0.1
 * @since 18.03.19
 */
public class Max {

    /**
     * Выводит максимум из двух чисел.
     * @param left первое число.
     * @param right второе число.
     * @return ответ.
     */
    public int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }
}