package CaesarCipher;

public class CaesarCipher {

    public static void main(String[] args) {
        String str = "Can you imagine life WITHOUT the internet AND computers in your pocket?";
        StringBuilder result = new StringBuilder();
        int s = 15;

        char[] ch = str.toCharArray();
        for (char c : ch) {
            // apply transformation to each character
            // Encrypt Uppercase letters
            if (c >= 'A' && c <= 'Z') {
                result.append((char) ((c + s - 65) % 26 + 65));
            }
            // Encrypt Lowercase letters
		    else if (c >= 'a' && c <= 'z') {
                result.append((char) ((c + s - 97) % 26 + 97));
            }
            else
                result.append(c);
        }

        System.out.println(result);
    }
}
