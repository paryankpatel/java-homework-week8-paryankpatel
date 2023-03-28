package week_8_homework.CarpetCostCalculator;

public class Calculator {

    Floor floor;
    Carpet carpet;

    Calculator(Floor f, Carpet c){

        this.floor = f;
        this.carpet = c;
    }

    public double getTotalCost(){

        return this.floor.getArea() * this.carpet.getCost();
    }


}
