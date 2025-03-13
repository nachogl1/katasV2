public class StringMerge {
    public String merge(String s1, String s2, String letter) {

        StringBuilder result = new StringBuilder();
        int firstIndex = s1.indexOf(letter);
        int secondIndex = s2.indexOf(letter);

        result.append(s1, 0, firstIndex);
        result.append(s2.substring(secondIndex));


        return result.toString();
    }
}
