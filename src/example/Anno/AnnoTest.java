package example.Anno;
/**
 * @ProjectName: JavaLearning
 * @Package: Example.Anno
 * @ClassName: anno
 * @Author: xucha
 * @Description: 代理
 * @Date: 2021/1/20 11:42:15
 * @Version: 1.0
 */

import java.lang.annotation.*;

/**
 * @description
 * @updateRemark
 * @author xuchao
 * @updateUser
 * @createDate 2021/1/20 11:42:15
 * @updateDate 2021/1/20 11:42:15
 * @version 1.0
 **/
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnnoTest {
    String value() default "xuchao";
    boolean isDelete();
}
