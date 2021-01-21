package example.Refliction;
/**
 * @ProjectName: JavaLearning
 * @Package: Example.Refliction
 * @ClassName: ReflictionTest
 * @Author: xucha
 * @Description: 反射测试
 * @Date: 2021/1/20 14:49:29
 * @Version: 1.0
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @description
 * @updateRemark
 * @author xuchao
 * @updateUser
 * @createDate 2021/1/20 14:49:29
 * @updateDate 2021/1/20 14:49:29
 * @version 1.0
 **/

public class ReflictionTest {
    public static Car initByDefaultConst() throws Throwable {

        //1.通过类装载器获取Car类对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("example.Refliction.Car");

        //2.获取类的默认构造器对象并通过它实例化Car
        Constructor cons = clazz.getDeclaredConstructor((Class[]) null);
        Car car = (Car) cons.newInstance();

        //3.通过反射方法设置属性
        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "星瑞");
        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "黑色");
        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 250);
        return car;
    }

    public static void main(String[] args) throws Throwable {
        Car car = initByDefaultConst();
        car.introduce();
    }
}
