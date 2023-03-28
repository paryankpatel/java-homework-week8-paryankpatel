package week_8_homework.Pool;

public class Rectangle {

    double length;
    double width;

    Rectangle(double w, double l){

        this.length = l > 0? l: 0;
        this.width = w > 0? w: 0;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return this.length * this.width;
    }
}
