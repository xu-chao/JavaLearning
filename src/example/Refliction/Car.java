package example.Refliction;
/**
 * @ProjectName: JavaLearning
 * @Package: Example.Refliction
 * @ClassName: Car
 * @Author: xucha
 * @Description: 实体
 * @Date: 2021/1/20 14:47:41
 * @Version: 1.0
 */

/**
 * @description
 * @updateRemark
 * @author xuchao
 * @updateUser
 * @createDate 2021/1/20 14:47:41
 * @updateDate 2021/1/20 14:47:41
 * @version 1.0
 **/

public class Car {

    private String brand;
    private String color;
    private int maxSpeed;

    public Car() {
        System.out.println("init car!!");
    }

    public Car(String brand, String color, int maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void introduce() {
        System.out.println("brand:" + brand + ";color:" + color + ";maxSpeed:" + maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
