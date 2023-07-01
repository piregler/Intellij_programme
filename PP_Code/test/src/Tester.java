final class Tester {
    private int x = 0;
    private int y = 0;
    public void step1(final int n) {
        this.y += n * n;
        this.x++; }
    public int step2(final int n) { return n * n;
    }
    public int step3(final int n) {
        this.y += n;
        return n*2; }
    public int getX() { return this.x; }

    public int getY() {
        return this.y; }
}
