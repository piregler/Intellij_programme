public class Test {

    public static void main(String[] args) {
        double a = 3.141;
        System.out.println(test(a));
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
    }
    static double test(double p){
        return p + p *0.16;
    }

}
