// Last updated: 8/12/2025, 12:40:36 AM
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        // Step 1: Find the Peak Index using Binary Search
        int peak = findPeak(mountainArr);
        
        // Step 2: Binary Search on Ascending Part
        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) {
            return index;
        }
        
        // Step 3: Binary Search on Descending Part
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }
    
    // Find Peak Index using Binary Search
    private int findPeak(MountainArray mountainArr) {
        int left = 0, right = mountainArr.length() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1; // Move right if increasing
            } else {
                right = mid; // Move left if decreasing
            }
        }
        return left; // Peak index
    }
    
    // Binary Search on Ascending/Descending Part
    private int binarySearch(MountainArray mountainArr, int target, int left, int right, boolean isAscending) {
        while (left <= right) {
            int mid = (left + right) / 2;
            int value = mountainArr.get(mid);
            
            if (value == target) {
                return mid;
            }
            
            if (isAscending) {
                if (value < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else { // Descending
                if (value > target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1; // Target not found
    }
}
