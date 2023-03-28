package week_8_homework.CarpetCostCalculator;

public class Floor {

    double width;
    double length;

    Floor(double w, double l){
        this.width = this.length = 0;
        if (w > 0){
            this.width = w;
        }
        if (l > 0) {
            this.length = l;
        }
    }

    public double getArea(){

        return (this.width * this.length);
    }
}
