package chapters.chap5.ex8;

public class InvoiceTest {
    public static void main(String[] args){
        Invoice invoice = new Invoice("MDX69K", "Good", 123, 6.98);
        System.out.println(invoice.getInvoiceAmount());
    }
}
