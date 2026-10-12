
class Bill {

    public void generateBill(int quantity, double price) {
        double total = quantity * price;

        System.out.println("Quantity = " + quantity);
        System.out.println("Price = " + price);
        System.out.println("Total Bill = " + total);
    }

    public static void main(String[] args) {
        Bill b = new Bill();

        b.generateBill(5, 100);
    }
}
