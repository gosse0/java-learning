package extendsTest;

/**
 * className: Cylinder
 * Package: extendsTest
 * Description:
 *
 * @Author: 史传正
 * @Create: 2024-10-09 - 11:13
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return findArea() * getLength();
    }
}
