package array;
// https://leetcode.com/problems/fair-candy-swap/

public class question_888 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0, sumBob = 0;

        // Step 1: calculate sums
        for (int a : aliceSizes) sumAlice += a;
        for (int b : bobSizes) sumBob += b;

        // Step 2: find the difference
        int diff = (sumAlice - sumBob) / 2;

        // Step 3: find valid pair
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (aliceSizes[i] - bobSizes[j] == diff) {
                    return new int[]{aliceSizes[i], bobSizes[j]};
                }
            }
        }
        return new int[0]; // fallback, though problem guarantees solution
    }
}
