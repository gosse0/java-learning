package extendsTest;

/**
 * className: Circle
 * Package: extendsTest
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-09 - 11:10
 */
public class Circle {
    public double radius;

    public Circle() {
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea() {
        return 3.14 * radius * radius;
    }

}
