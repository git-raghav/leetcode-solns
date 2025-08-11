// Last updated: 8/12/2025, 12:40:47 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = 0;
        for (int i = 0; i < piles.length; i++) maxSpeed = Math.max(maxSpeed, piles[i]);

        while (minSpeed < maxSpeed) {
            int time = 0;
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;

            for (int i = 0; i < piles.length; i++) {
                time += (piles[i] + mid - 1) / mid;
                if (time > h) break;
            }
            if (time <= h)
                maxSpeed = mid;
            else
                minSpeed = mid + 1;
        }
        return minSpeed;
    }
}