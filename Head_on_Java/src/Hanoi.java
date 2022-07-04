public class Hanoi {
    public static void main(String[] args) {
        hanoi(4,"start","ziel","temp");
    }
    static void hanoi ( int n, String von, String nach, String tmp ) {
        if(n==1)
            System.out.println( "Schaffe Scheibe " + n +" von " + von + " nach " + nach );
        else{
            hanoi( n-1, von, tmp, nach );
            System.out.println( "Schaffe Scheibe " + n +" von " + von + " nach " + nach);
                    hanoi( n-1, tmp, nach, von );
        }
    }
}

