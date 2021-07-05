class Solution {
    public int lengthOfLongestSubstring(String s) {
        final char[] chars = s.toCharArray();
        
        Set<Character> track = new HashSet<Character>();
        
        int result = 0;
        int nextPos = 0;
        
        if (chars.length <= 1) return chars.length;
        
        for(int i = 0; i < chars.length; i++) {
            boolean isInserted = track.add(chars[i]);
            result = Math.max(result, track.size());
            
            if (!isInserted) {
                track.clear();
                i = nextPos++;
            }
        }
        
        return result;
    }
}