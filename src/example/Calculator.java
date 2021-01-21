package example;

/**
 * 参数 null
 *
 * @author xuchao
 * @description 计算测试
 * @date 2021/1/20 10:48:13
 * @Version 1.0
 */
public class Calculator {
    public static void main(String[] args) {
        int i = 0, total = 0;
        do {
            i = i + 2;
            System.out.println("i=" + i);
            total = total + (i++) * 2;
            System.out.println("t=" + total);
        } while (i < 12);
        System.out.println("count:" + total);
    }
}
