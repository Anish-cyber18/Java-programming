
class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double a = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + a);
    }

    void circumference() {
        double c = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle: " + c);
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);

        c.area();
        c.circumference();
    }
}

