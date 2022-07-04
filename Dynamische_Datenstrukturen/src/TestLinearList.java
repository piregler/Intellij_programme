public class TestLinearList {
    public static void main(String[] args) {
        LinearList test = new LinearList();
        System.out.println("Empty? " + test.isEmpty());
        System.out.println("Size: " + test.size());
        System.out.println("add first: 3");
        test.addFirst(3);
        System.out.println("Size: " + test.size());
        System.out.println("add first: 2");
        test.addFirst(2);
        System.out.println("add last: 3");
        test.addLast(34);
        System.out.println("Size: " + test.size());
        System.out.println("add first: 1");
        test.addFirst(1);
        System.out.println("add last: 3");
        test.addLast(35);
        test.output();
        System.out.println("Size: " + test.size());
        System.out.println("first: " + test.getFirst());
        System.out.println("last:  "+ test.getLast());
        System.out.println("remove last");
        test.removeLast();
        test.output();
        System.out.println("last:  "+ test.getLast());
        System.out.println("Size: " + test.size());
        System.out.println("remove last");
        test.removeLast();
        test.output();
        System.out.println("Size: " + test.size());
        System.out.println("last:  "+ test.getLast());
        System.out.println("remove last");
        test.removeLast();
        System.out.println("Size: " + test.size());
        System.out.println("last:  "+ test.getLast());
        test.output();

    }
}
