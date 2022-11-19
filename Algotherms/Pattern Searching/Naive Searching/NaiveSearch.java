public class NaiveSearch {
    public static void main(String[] args) {
        String text = "THIS IS A TEST TEXT";
        String pattern = "TEST";
        naive(text, pattern);
    }

    public static void naive(String text, String pattern) {
        int text_size = text.length();
        int pattern_size = pattern.length();
        int j;

        for (int i = 0; i < text_size - pattern_size; i++) {
            for (j = 0; j < pattern_size; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == pattern_size) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }
}
