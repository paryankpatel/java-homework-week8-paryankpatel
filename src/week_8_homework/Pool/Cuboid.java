package week_8_homework.Pool;

public class Cuboid extends Rectangle{

    double height;

    Cuboid(double w, double l, double h){
        super(w, l);
        this.height = h > 0? h: 0;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return this.getArea() * this.height;
    }
}
