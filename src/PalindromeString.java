public class PalindromeString {
    public static void main(String[] args) {
        String str = "MalAyaLam";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        String s = str.toLowerCase();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }
}
