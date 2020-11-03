package pub.ants.jdk8.lambda;

import java.util.function.Predicate;

/**
 * @author: magaowei
 * @version: 1.0
 * @date: 2020/11/3 4:13 下午
 * @description:
 */
public class TestPredicate1 {

    public static void main(String[] args) {
        Predicate<Integer> predicate1 = x -> x > 5;
        Predicate<Integer> predicate2 = x -> x < 10;
        System.out.println(predicate1.test(10));
        System.out.println(predicate1.and(predicate2).test(8));
        System.out.println(predicate1.negate().test(1));
        System.out.println(predicate1.or(predicate2).test(18));
        Predicate<String> predicate3 = Predicate.isEqual(null);
        System.out.println(predicate3.test(null));
    }
}
