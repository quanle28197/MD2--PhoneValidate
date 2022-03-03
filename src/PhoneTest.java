public class PhoneTest {
    private static Phone phone;
    public static final String[] validClass = new String[]{"(+84)-(0974610370)"};
    public static final String[] invalidClass = new String[]{"(+84) 0974610370"};

    public static void main(String[] args) {
        phone = new Phone();
        for (String phoneEx : validClass) {
            boolean isvalid = phone.validate(phoneEx);
            System.out.println("Phone is" + phoneEx + "is" + isvalid);
        }

        for (String phoneEx : invalidClass) {
            boolean isvalid = phone.validate(phoneEx);
            System.out.println("Phone is" + phoneEx + "is" + isvalid);
        }
    }
}
