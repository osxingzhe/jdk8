package pub.ants.jdk8.lambda;

/**
 * @author: magaowei
 * @version: 1.0
 * @date: 2020/11/2 10:24 上午
 * @description:
 */
@FunctionalInterface
public interface FunctionalInterfaceTest1 {

    /**
     * 接口中抽象方法
     */
    void test();

    /**
     * 重写了Object里方法，不作为抽象函数个数
     *
     * @param obj
     * @return
     */
    @Override
    boolean equals(Object obj);

    /**
     * 打印接口名
     */
    default void printInterfaceName() {
        System.out.println(this.getClass().getName());
    }

}
