package example;

/**
 * 参数 null
 *
 * @author xuchao
 * @description 递归
 * @date 2021/1/20 10:49:01
 * @Version 1.0
 */
public class Factorial {

    public static void main(String args[]) {
        System.out.println(fibonacci(4));
    }

    //递归
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //斐波那契数列   0 1 1 2 3 5 8 13 21 34 55
    public static long fibonacci(long index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return fibonacci(index - 1) + fibonacci(index - 2);
        }
    }
}
