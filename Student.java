
class Student {

    void average(double a, double b) {
        double avg = (a + b) / 2;
        System.out.println("Average of 2 subjects: " + avg);
    }


    void average(double a, double b, double c) {
        double avg = (a + b + c) / 3;
        System.out.println("Average of 3 subjects: " + avg);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.average(80, 90);
        s.average(80, 90, 70);
    }
}
