package example;

import java.util.Arrays;
import java.util.List;

/**
 * 参数 null
 *
 * @author xuchao
 * @description lambda 表达式
 * @date 2021/1/20 10:51:25
 * @Version 1.0
 */
public class Java8Array {
    //test  lambda 表达式
    public static void main(String[] args) {
        String[] te = {"1231", "123"};
        List<String> pals = Arrays.asList(te);
        pals.forEach((pal) -> System.out.println(pals));
    }
}
