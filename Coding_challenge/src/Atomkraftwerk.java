import java.util.ArrayList;

public class Atomkraftwerk {
    public static void main(String[] args) {

        int gesamtLaenge =225;
        int [] teilLaenge = {111, 3, 2, 1};
         ArrayList output = (revenge(gesamtLaenge, teilLaenge));
        for(Object ding : output){
            System.out.println(ding);
        }
        
    }
    static ArrayList revenge(int gesamt, int [] teil){
        ArrayList <Integer> ausgabe = new ArrayList<>();
//        int [] ausgabe = new int[10];
        while(gesamt >= 0){
            int i = 0;
            if(gesamt >= teil[i]  ){
                gesamt = gesamt - teil[i];
                ausgabe.add(teil[i]);
//                ausgabe[i] = teil[i];
            }
            i++;
        }
        return ausgabe;
    }
}
