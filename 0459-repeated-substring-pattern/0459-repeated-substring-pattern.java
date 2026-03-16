class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        // Remove first and last char to avoid matching the original s at indices 0 and s.length()
        String sub = doubled.substring(1, doubled.length() - 1);
        return sub.contains(s);
    }
}