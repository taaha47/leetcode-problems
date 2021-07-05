class Solution {
    
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = -10;
        
        while (i != j && j >= 0 && i < height.length) {
            int area = (j - i) * (height[i] > height[j] ? height[j] : height[i]);
            if (area > maxArea) maxArea = area;
            
            if (height[i] > height[j]) j--;
            else if (height[j] > height[i]) i++;
            else if (height[i] == height[j]) {
                i++;
                j--;
            }
        }
                
        return maxArea;           
    }
}