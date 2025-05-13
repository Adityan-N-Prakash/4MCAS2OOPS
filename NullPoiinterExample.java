public class NullPointerExample {
    public static void main(String[] args) {
        String text = null;

        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Cannot call method on a null object.");
        }
    }
}

