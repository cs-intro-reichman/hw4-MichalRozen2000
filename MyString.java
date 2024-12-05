public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    public static String lowerCase(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++){
            
            int ch = (int) str.charAt(i);

            // if upper case
            if (ch >= 65 && ch <= 90){
                ch = ch + 32;
            }

            newStr += (char) ch;
        }

        return newStr;
    }

    public static boolean contains(String str1, String str2) {
        
        for (int i = 0; i <= str1.length() - str2.length(); i++){
            boolean contain = true;
            int index = i;

            for (int j = 0; j < str2.length(); j++){
                if (str1.charAt(index) != str2.charAt(j)){
                 contain = false;
                }
                else index += 1;
            }

            if (contain) return true;
        }

        return false;
    }
}
