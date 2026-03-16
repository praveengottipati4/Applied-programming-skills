class Solution {
    public boolean rotateString(String s, String goal) {
        // Step 1: Check if lengths are the same. 
        // If they aren't, one can't be a rotation of the other.
        if (s.length() != goal.length()) {
            return false;
        }

        // Step 2: Double the string s
        String doubled = s + s;

        // Step 3: Check if goal is a substring of the doubled string
        return doubled.contains(goal);
    }
}