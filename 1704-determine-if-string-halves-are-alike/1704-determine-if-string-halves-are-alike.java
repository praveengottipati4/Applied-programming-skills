class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        String a = s.substring(0, mid);
        String b = s.substring(mid);

        return countVowels(a) == countVowels(b);
    }

    private int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}