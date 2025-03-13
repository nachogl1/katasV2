public class StringChecker {
    public boolean check(String str1, String str2) {
        String subString = str1.substring(str1.length() - str2.length());
        return subString.equals(str2);
    }
}
