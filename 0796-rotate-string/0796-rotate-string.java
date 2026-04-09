class Solution {

    public boolean rotateString(String s, String goal) {
        // lengths must be equal
        if (s.length() != goal.length()) {
            return false;
        }

        // check rotation
        String doubled = s + s;
        return doubled.contains(goal);
    }
}