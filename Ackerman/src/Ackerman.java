import static java.lang.System.nanoTime;

public class Ackerman {

    static long recursiveCount = 0;

    public static void main(String[] args) {
        for(int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println(ackTime(i, j) + "s" + "  |  Resursive executions: " + recursiveCount);
            }
        }
    }

    static double ackTime(int m, int n) {
        double start = nanoTime();
        System.out.print("Ackerman (" + m + "," + n + ") = " + ack(m,n) + "  | Time: ");
        double end = nanoTime();
        return (end - start) / 1000000000;
    }

    static int ack(int m, int n) {
        recursiveCount++;
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ack(m-1, 1);
        } else {
            return ack(m-1, ack(m, n - 1));
        }
    }
}
