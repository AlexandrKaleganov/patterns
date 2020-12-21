package ru.example.patterns.interpreter;

import java.util.Map;

/**
 * Class Dispatch
 *
 * @author Kaleganov Alexander
 * @since 21 дек. 20
 */
public interface Dispatch {
    /**
     * выполняет подсчёт
     * @param function функция которую необходимо будет распарсить
     * @param context контекст со  значениями
     * @return результат вычислений
     */
    int calculate(String function, Map<String, Integer> context);

}
