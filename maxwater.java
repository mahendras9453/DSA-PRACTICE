 // leetcode problem (11) max water container
 class maxwater{
public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max_area=0;
        int current_area=0;
        while(left<right) {
            current_area =(int) (Math.min(height[left],height[right])*(right-left));
            max_area=Math.max(current_area,max_area);
            if(height[left]<=height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return max_area;
    }
}