
class Maximum {

    void max(int a, int b) {
        if (a > b)
            System.out.println("Maximum of 2 numbers: " + a);
        else
            System.out.println("Maximum of 2 numbers: " + b);
    }

    void max(int a, int b, int c) {
        if (a >= b && a >= c)
            System.out.println("Maximum of 3 numbers: " + a);
        else if (b >= a && b >= c)
            System.out.println("Maximum of 3 numbers: " + b);
        else
            System.out.println("Maximum of 3 numbers: " + c);
    }

    public static void main(String[] args) {
        Maximum m = new Maximum();

        m.max(10, 20);
        m.max(10, 30, 20);
    }
}
