public class PangramCheck {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        boolean[] alphabet = new boolean[26];

        for (char c : str.toCharArray()) {
            alphabet[c - 'a'] = true;
        }

        boolean isPangram = true;
        for (boolean b : alphabet) {
            if (!b) {
                isPangram = false;
                break;
            }
        }
        System.out.println(isPangram ? "Pangram" : "Not a pangram");
    }
}
