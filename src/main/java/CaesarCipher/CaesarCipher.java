package CaesarCipher;

public class CaesarCipher {

    public static void main(String[] args) {
        String str = "Can you imagine life WITHOUT the internet AND computers in your pocket?";
        StringBuilder result = new StringBuilder();
        int s1 = 21 , s2 = 8, num=0;

        char[] ch = str.toCharArray();
        for (char c : ch) {
            // apply transformation to each character
            // Encrypt Uppercase letters
            if (num%2 ==0){
                if (c >= 'A' && c <= 'Z') {
                    result.append((char) ((c + s1 - 65) % 26 + 65));
                }
                // Encrypt Lowercase letters
                else if (c >= 'a' && c <= 'z') {
                    result.append((char) ((c + s1 - 97) % 26 + 97));
                } else
                    result.append(c);
            } else {
                if (c >= 'A' && c <= 'Z') {
                    result.append((char) ((c + s2 - 65) % 26 + 65));
                }
                // Encrypt Lowercase letters
                else if (c >= 'a' && c <= 'z') {
                    result.append((char) ((c + s2 - 97) % 26 + 97));
                } else
                    result.append(c);
            }
            num++;
        }

        System.out.println(result);
    }
}
