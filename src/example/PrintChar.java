package example;

/**
 * 参数 null
 *
 * @author xuchao
 * @description 继承
 * @date 2021/1/20 10:51:50
 * @Version 1.0
 */
public class PrintChar extends Thread {
    //常用的继承Thread   因为java单继承多实现
    private char c;
    private int times;

    public PrintChar() {
    }

    public PrintChar(char c, int times) {
        this.c = c;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(c);
        }
    }
}
