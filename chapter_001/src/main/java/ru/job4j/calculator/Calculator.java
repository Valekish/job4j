package ru.job4j.calculator;

/**
 * Calculator.
 * Выполняет базовые математические действия.
 * @author Valentin Kirjan (valekishwork@mail.ru).
 */
public class Calculator {

	/**
	 * Add (addition).
	 * @param first number.
	 * @param second number.
	 * @return result of operation.
	 */
	public double add(double first, double second) {
		return first + second;
	}

	/**
	 * Subtract (subtraction).
	 * @param first number.
	 * @param second number.
	 * @return result of operation.
	 */
	public double subtract(double first, double second) {
		return first - second;
	}

	/**
	 * Multiple (multiplication).
	 * @param first number.
	 * @param second number.
	 * @return result of operation.
	 */
	public double multiple(double first, double second) {
		return first * second;
	}

	/**
	 * Div (division).
	 * @param first number.
	 * @param second number.
	 * @return result of operation.
	 */
	public double div(double first, double second) {
		return first / second;
	}
}