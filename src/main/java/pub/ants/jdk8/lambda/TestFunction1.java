package pub.ants.jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author: magaowei
 * @version: 1.0
 * @date: 2020/11/3 2:19 下午
 * @description:
 */
public class TestFunction1 {

    public static void main(String[] args) {
        Function<Integer, Integer> function = (x) -> x += 2;
        System.out.println(function.apply(2));

        // compose
        Function<Integer, Integer> function1 = (x) -> x * x;
        // 11
        System.out.println(function.compose(function1).apply(3));

        // andThen 25
        System.out.println(function.andThen(function1).apply(3));

        // identity
        List<String> list = Arrays.asList("1", "233", "1");
        Map<String, Integer> collect = list.stream()
            .collect(Collectors.toMap(Function.identity(), String::length, (o1, o2) -> o2));
        for (Map.Entry<String, Integer> entry : collect.entrySet()) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }
    }
}
