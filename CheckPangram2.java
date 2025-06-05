public class CheckPangram2 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        boolean[] alphabet = new boolean[26]; // To track all letters
        int index = 0;

        // Convert all characters to lowercase and check
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Fixed typo: toCharAt -> charAt

            if (ch >= 'A' && ch <= 'Z') {
                index = ch - 'A';
            } else if (ch >= 'a' && ch <= 'z') {
                index = ch - 'a';
            } else {
                continue; // Ignore all other characters
            }

            alphabet[index] = true;
        }

        // Check if all 26 characters are present
        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) { // Fixed: alphabet(i) -> alphabet[i]
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The String is a pangram");
        } else {
            System.out.println("The String is not a pangram");
        }
    }
}
