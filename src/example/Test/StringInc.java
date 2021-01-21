package example.Test;

/**
 * 参数 null
 *
 * @author xuchao
 * @description 字符串
 * @date 2021/1/20 10:59:36
 * @Version 1.0
 */
public class StringInc {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("k:" + k);
    }
}
