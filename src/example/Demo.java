package example;

/**
 * 参数 null
 *
 * @author xuchao
 * @description 选择排序
 * @date 2021/1/20 10:44:39
 * @Version 1.0
 */
public class Demo {
    //选择排序
    public static void main(String args[]) {
        int param[] = {1, 12, 23, 123, 12, 3, 12, 31, 23, 1, 3};
        for (int i = 0; i < param.length; i++) {
            for (int j = i + 1; j < param.length; j++) {
                if (param[i] > param[j]) {
                    int temp = param[j];
                    param[j] = param[i];
                    param[i] = temp;
                }
            }
        }
        for (int num : param) {
            System.out.println(num + "");
        }
    }

//    private static int getValue(int i){
//        int result =0;
//        switch (i){
//            case 1:
//                result = result+i;
//            case 2:
//                result = result+i*2;
//            case 3:
//                result= result +i*3;
//        }
//        System.out.println(result);
//        return result;
//    }
}


