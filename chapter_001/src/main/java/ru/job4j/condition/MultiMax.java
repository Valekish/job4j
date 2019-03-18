package ru.job4j.condition;

/**
 * @author Valentin Kirjan (valekishwork@mail.ru)
 * @version 0.1
 * @since 18.03.19
 */
public class MultiMax {

    /**
     * Вычисляет максимум из 3 чисел.
     * @param first первое число.
     * @param second второе число.
     * @param third третье число.
     * @return ответ (максимум).
     */
    public int max(int first, int second, int third) {
        int result = first >= second ? first : second;
        int secondresult = result >= third ? result : third;
        return secondresult;
    }
}