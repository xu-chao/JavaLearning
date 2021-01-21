package example.Anno;
/**
 * @ProjectName: JavaLearning
 * @Package: Example.Anno
 * @ClassName: AnnoMainTest
 * @Author: xucha
 * @Description: 自定义注解测试类
 * @Date: 2021/1/20 14:06:10
 * @Version: 1.0
 */

/**
 * @author xuchao
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/20 14:06:10
 * @updateDate 2021/1/20 14:06:10
 **/

public class AnnoMainTest {

    public static void main(String[] args) {
        try {
            //获取Person的Class对象
            Person person = new Person();
            Class clazz = person.getClass();
            //判断person对象上是否有Info注解
            if (clazz.isAnnotationPresent(AnnoTest.class)) {
                System.out.println("Person类上配置了注解！");
                //获取该对象上Info类型的注解
                AnnoTest annotation = (AnnoTest) clazz.getAnnotation(AnnoTest.class);
                System.out.println("person.name:" + annotation.value() + ",person.isDelete:" + annotation.isDelete());
            } else {
                System.out.println("Person类上没有配置注解！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
