
class Area {

    public void area(int side) {
        System.out.println("Area of Square = " + (side * side));
    }

    public void area(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    public void area(double radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        Area a = new Area();

        a.area(5);
        a.area(5, 10);
        a.area(7.0);
    }
}

