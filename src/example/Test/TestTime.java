package example.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 参数 null
 *
 * @author xuchao
 * @description 时间转换
 * @date 2021/1/20 11:00:52
 * @Version 1.0
 */
public class TestTime {


    /**
     * 把long转成date 用calendar计算再换成string
     *
     * @param args
     */
    public static void main(String args[]) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        long longTime = new Date().getTime();
        System.out.println("long为：" + longTime);
        System.out.println("Long转换成日期:");
        System.out.println("longToDate：" + new SimpleDateFormat("yyyy-MM-dd ").format(new Date(longTime)));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(longTime));
        calendar.add(Calendar.DAY_OF_MONTH, +75);
        System.out.println("75天后：" + sdf.format(calendar.getTime().getTime()));
    }
}
