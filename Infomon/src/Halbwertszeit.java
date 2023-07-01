import java.util.Scanner;
public class Halbwertszeit {
    int halfLife;
    int years = 0;

    public Halbwertszeit(int theHalfLive){
        this.halfLife = theHalfLive;
    }

    public int calculateYears(double materialAmount){
        years = 0;
        return help(materialAmount);
    }
    public int help(double materialAmount){
        if(materialAmount <= 100){
            return years;
        }
//        return  (int) (halfLife * (Math.log(( 100 / materialAmount)) / Math.log((double) 1/2)));
        materialAmount = materialAmount / 2;
        years += halfLife;
        help(materialAmount);
        return years;
    }
}

