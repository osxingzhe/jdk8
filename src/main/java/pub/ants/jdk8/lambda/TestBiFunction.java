package pub.ants.jdk8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author: magaowei
 * @version: 1.0
 * @date: 2020/11/3 3:22 下午
 * @description:
 */
public class TestBiFunction {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        BiFunction<Integer, Integer, Integer> subtract = (x, y) -> x - y;
        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x + y;
        BiFunction<Integer, Integer, Integer> divide = (x, y) -> x + y;

        Function<Integer, Integer> square = x -> x * x;
        Integer result = add.andThen(square).apply(1, 2);
        System.out.println(result);
    }
}
