
public class Tafel {
    public static void main(String[] args) {
        digitalTafel("HTML ist eine Programmiersprache.");
    }

    static void digitalTafel(String satz){
        while(true){
            System.out.print(satz);
            System.out.println(satz);
        }
    }
}
