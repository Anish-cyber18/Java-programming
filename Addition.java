
class Addition {

    public void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }

    public void add(double a, double b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {
        Addition a = new Addition();

        a.add(5, 6);
        a.add(5, 6, 7);
        a.add(5.9, 6.6);
    }
}
