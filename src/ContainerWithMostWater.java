public class ContainerWithMostWater {

    public static void main(String[] args) {
        int input[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(input));
    }

    public static int maxArea(int[] height) {
        int max = 0;
//        # Solution Brute force
//        for (int i = 0; i < height.length; i++) {
//            for (int j = i + 2; j < height.length; j++) {
//                max = Math.max(max, (j - i) * Math.min(height[j], height[i]));
//            }
//        }
//      # Solution Two pointer
        int l = 0, r = height.length - 1;
        while (l < r) {
            max = Math.max(max, (r - l) * Math.min(height[l], height[r]));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return max;
    }
}
