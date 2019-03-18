package ru.job4j.condition;

/**
 * Point.
 * Вычисляет расстояние между точками в координатной плоскости.
 * @author Valentin Kirjan (valekishwork@mail.ru).
 */
public class Point {

    /**
     * Distance.
     * @param x1 - x1.
     * @param y1 - y1.
     * @param x2 - x2.
     * @param y2 - y2.
     * @return расстояние между x и y.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        return Math.sqrt(first + second);
    }
}