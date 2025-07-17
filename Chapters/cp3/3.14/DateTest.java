public class DateTest {
    public static void main(String[] args) {
        Date dateTest = new Date (7,16,2025);

        System.out.printf("%nDate: %s/%s/%s%n", dateTest.getMonth(),dateTest.getDay(),dateTest.getYear());
    }
}