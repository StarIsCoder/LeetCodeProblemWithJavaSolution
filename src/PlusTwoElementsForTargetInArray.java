public class PlusTwoElementsForTargetInArray {
    public static void main(String[] args) {
        int in[] = {2, 7, 11, 15};
        int out[] = twoSum(in, 9);
        for (int i : out) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int index[] = new int[2];
        //Brute force
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (numbers[i] + numbers[j] == target) {
//                    index[0] = Math.min(i, j) + 1;
//                    index[1] = Math.max(i, j) + 1;
//                }
//            }
//        }
        //use two pointers and sorted feature
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int tmp = numbers[left] + numbers[right];
            if (tmp == target) {
                index[0] = left + 1;
                index[1] = right + 1;
                break;
            } else if (tmp > target) {
                right--;
            } else if (tmp < target) {
                left++;
            }
        }
        return index;
    }
}
