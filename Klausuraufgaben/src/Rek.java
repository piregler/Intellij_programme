public class Rek {

    public static void main(String[] args) {
        rek(4);
    }

    public static void rek(int z){
        z--;
        System.out.println(z);
        if (z!=0){
            rek(z);
        }
        System.out.println(z);
    }
}
