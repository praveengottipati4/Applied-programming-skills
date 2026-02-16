class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {

            // remove duplicates from left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // add current character
            set.add(s.charAt(right));

            // update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}