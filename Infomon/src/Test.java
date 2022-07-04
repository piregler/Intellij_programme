import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input trainer name: ");
        String input = in.nextLine();
        Infomon s = new Infomon("Schiggy", "water", 100, 100);
        Infomon b = new Infomon("Bisasam", "plant", 100, 100);
        Infomon g = new Infomon("Glumanda", "fire", 100, 100);
        Infomon k = new Infomon("Kapardor", "water", 100, 100);
        Trainer t = new Trainer(input);
//        System.out.println("Can "+ t.name + " catch " + b.name + "?\n"+  t.attemptToCatch(b));
//        System.out.println(g.name + " is stronger than "+ b.name + " ?");
//        System.out.println(g.isStronger(b));
        System.out.println(k.name + " is stronger than "+ s.name + " ?");
        System.out.println(k.isStronger(s));
        System.out.println(s.getDefenseStat());
        System.out.println(s.getAttackStat());
        System.out.println(k.getAttackStat());
    }
}
