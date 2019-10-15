import DataStructureUtils.ArrayUtils;

// Find max sub int in array
public class MaxSubInt {
    public int maxSubInt(int array[]) {
        return maxSubInt(array, 0, array.length - 1);
    }

    public int maxSubInt(int array[], int left, int right) {
        if (left == right) {
            return array[left];
        }
        int mid = (left + right) / 2;
        int maxLeft = maxSubInt(array, left, mid);
        int maxRight = maxSubInt(array, mid + 1, right);

        int maxLeftBoarder = Integer.MIN_VALUE;
        int sumLeftBoarder = 0;
        for (int i = mid; i >= left; i--) {
            sumLeftBoarder += array[i];
            if (sumLeftBoarder > maxLeftBoarder)
                maxLeftBoarder = sumLeftBoarder;
        }

        int maxRightBoarder = Integer.MIN_VALUE;
        int sumRightBoarder = 0;
        for (int i = mid + 1; i <= right; i++) {
            sumRightBoarder += array[i];
            if (sumRightBoarder > maxRightBoarder)
                maxRightBoarder = sumRightBoarder;
        }
        return Math.max(Math.max(maxLeft, maxRight), (maxLeftBoarder + maxRightBoarder));
    }

    public static void main(String[] args) {
        int array[] = ArrayUtils.generateUnsortedArray(10);
        MaxSubInt maxSubInt = new MaxSubInt();
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(maxSubInt.maxSubInt(array));
    }
}
