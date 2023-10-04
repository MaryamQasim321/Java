package BookPractice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("12345", "Widget", -5, 9.99);
        System.out.println(invoice1.getQuantity());
    }
}
