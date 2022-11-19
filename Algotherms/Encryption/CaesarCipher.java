public class test {
    public static void main(String[] args) {
        String message = "Hello World";
        int key = 5;

        System.out.println("Text: " + message);
        System.out.print("Encrypted: ");
        String encrypted = encrypt(message, key);
    }

    private static String encrypt(String message, int key) {
        char[] chars = message.toCharArray();
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                c = (char)(((int)c + key - 65) % 26 + 65);
            } else {
                c = (char)(((int)c + key - 97) % 26 + 97);
            }

            System.out.print(c);
        }
        return message;
    }
}