// Last updated: 6/27/2026, 3:50:22 PM
1class Solution {
2    public int[] searchRange(int[] arr, int key) {
3        int idx = findIdx(arr, key);
4        if(idx == -1){
5            return new int[]{-1, -1};
6        }
7        // expand to left and right till we have key
8        int first = idx;
9        int last = idx;
10        while(first > 0 && arr[first - 1] == key){
11            first--;
12        }
13        while(last < arr.length - 1 && arr[last + 1] == key){
14            last++;
15        }
16        return new int[]{first, last};
17    }
18
19    private static int findIdx(int[] arr, int key) {
20        int low = 0;
21        int high = arr.length - 1;
22        while (low <= high) {
23            int mid = low + (high - low) / 2; //no overflow
24            if (arr[mid] == key) {
25                return mid;
26            } else if (key < arr[mid]) {
27                high = mid - 1;
28            } else if (key > arr[mid]) {
29                low = mid + 1;
30            }
31        }
32        return -1;
33    }
34}