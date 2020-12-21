package ru.example.patterns.interpreter;

import java.util.Map;

/**
 * Class Expr
 * основной интерфейс для интерпретации
 *
 * @author Kaleganov Alexander
 * @since 21 дек. 20
 */
public interface Expr {
    /**
     * основной метод, который будет интерпретировать
     * данные и превращать их в результат
     *
     * @param context - мапа с данными
     * @return результат
     */
    int interpret(Map<String, Integer> context);

    /**
     * интерпретация плюса
     * @param left левое значение
     * @param right правое значение
     * @return результат сложения
     */
    public static Expr plus(Expr left, Expr right) {
        return context -> left.interpret(context) + right.interpret(context);
    }

    public static Expr variable(String command) {
        return context -> context.getOrDefault(command, 0);
    }
}
