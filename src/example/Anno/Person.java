package example.Anno;
/**
 * @ProjectName: JavaLearning
 * @Package: Example.Anno
 * @ClassName: Person
 * @Author: xucha
 * @Description: 实体类
 * @Date: 2021/1/20 14:03:38
 * @Version: 1.0
 */

/**
 * @author xuchao
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/20 14:03:38
 * @updateDate 2021/1/20 14:03:38
 **/

@AnnoTest(isDelete = false)
public class Person {

    private String name;

    private int age;

    private boolean isDelete;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isDelete=" + isDelete +
                '}';
    }
}
