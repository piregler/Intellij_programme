import java.util.Scanner;
public class Halbwertszeit {
    int halfLife;
    int years = 0;

    public Halbwertszeit(int theHalfLive){
        this.halfLife = theHalfLive;
    }

     public int calculateYears(double materialAmount){
        if(materialAmount <= 100){
            return years;
        }
//        return  (int) (halfLife * (Math.log(( 100 / materialAmount)) / Math.log((double) 1/2)));
        materialAmount = materialAmount / 2;
        years += 20;
        calculateYears(materialAmount);
        return years;
    }
}

