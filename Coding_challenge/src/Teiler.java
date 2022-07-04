public class Teiler {
    public static void main(String[] args) {
        int x = 15;
        smartMaggie(x);

    }

    static void smartMaggie(int zahl){
            for(int i = 1; i < zahl; i++ ){
                if (zahl % i == 0){
                    System.out.println(i);
                }
        }
    }
}
