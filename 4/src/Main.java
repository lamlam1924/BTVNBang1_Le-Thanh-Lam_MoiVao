
public class Main implements IString {

    public boolean checkPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int f1(String str) {
        if (!checkPalindrome(str)) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count >= 3 ? count : 0;
    }

    @Override
    public String f2(String str) {
        // Đảo ngược chuỗi
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Main mt = new Main();
        System.out.println(mt.checkPalindrome("c121c")); // true
        System.out.println(mt.checkPalindrome("c1212c")); // false

        System.out.println(mt.f1("c121c")); // 3 (vì đây là chuỗi palindrome và có 3 chữ số)
        System.out.println(mt.f1("c1234c")); // 4 (vì đây là chuỗi palindrome và có 4 chữ số)
        System.out.println(mt.f1("c12345")); // 0 (vì đây không phải là chuỗi palindrome)

        System.out.println(mt.f2("hello")); // "olleh"
    }
}
