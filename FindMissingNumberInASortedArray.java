// Time Complexity : O(logN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

class Solution {
	public int search(int[] nums) {
		if (nums == null || nums.length == 0) return -1;
		
		if (nums[0] != 1) return 1;
		
		if (nums[nums.length-1] != nums.length + 1) return nums.length + 1;
		
		int low = 0, high = nums.length-1;
		
		while (low <= high) {
			int mid = low + (high-low)/2;
			
			if (nums[mid] != mid + 1) high = mid - 1;
			else low = mid + 1;
		}
		
		return nums[low] - 1;
	}
}