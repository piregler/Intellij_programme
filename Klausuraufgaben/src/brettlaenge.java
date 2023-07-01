public class brettlaenge {

    public static void main(String[] args) {
        brettlaengen(42);
    }
    static void brettlaengen (int laenge) {
        brettrekursiv("", laenge);
    }

    private static void brettrekursiv(String platz, int laenge){
        if (laenge == 0){
            System.out.println(platz);
        }
        else if (laenge>0) {
            brettrekursiv(platz + " 2", laenge-2);
            brettrekursiv(platz + " 1", laenge-1);
        }
    }
}
