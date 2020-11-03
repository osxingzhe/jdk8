package pub.ants.jdk8.lambda;

/**
 * @author: magaowei
 * @version: 1.0
 * @date: 2020/11/2 5:16 下午
 * @description:
 */
public class LambdaTest1 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread t1");
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {System.out.println("thread t2");});
        t2.start();

        Thread t3 = new Thread(() -> System.out.println("thread t3"));
        t3.start();
    }
}
