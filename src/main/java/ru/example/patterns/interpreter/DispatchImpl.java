package ru.example.patterns.interpreter;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Class Dispatch
 *
 * @author Kaleganov Alexander
 * @since 21 дек. 20
 */
public class DispatchImpl implements Dispatch {

    public int calculate(String function, Map<String, Integer> context) {
        Expr parse = parse(function);
        return parse.interpret(context);
    }

    /**
     *
     * @param function функция
     * @return вернёт имплементацию распарсиную
     */
    private Expr parse(String function) {
        ArrayDeque<Expr> stack = new ArrayDeque<>();
        this.setPredicate(stack, function, e -> Character.isLetter(e.charAt(0)));
        this.setPredicate(stack, function, e -> !Character.isLetter(e.charAt(0)));
        return stack.pop();
    }

    /**
     * устанавливает предикат по которому парсим значения
     * @param stack очередь с нашими элементами
     * @param function функция которую парсим
     * @param predicate условие отбора
     */
    private void setPredicate(ArrayDeque<Expr> stack, String function, Predicate<String> predicate) {
        Arrays.stream(function.split(" "))
                .filter(predicate)
                .forEach(e -> {
                    stack.push(parseToken(e, stack));
                });
    }

    /**
     * разбор каждого значения
     * @param token некое значение (переменная или команда)
     * @param stack очередь
     * @return вернёт функцию которая будет выполнять действие над переменными
     */
    private Expr parseToken(String token, ArrayDeque<Expr> stack) {
        Expr right, left;
        if ("+".equals(token)) {
            right = stack.pop();
            left = stack.pop();
            return Expr.plus(right, left);
        }
        return Expr.variable(token);
    }


}
