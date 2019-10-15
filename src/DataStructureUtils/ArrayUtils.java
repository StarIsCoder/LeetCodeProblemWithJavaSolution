package DataStructureUtils;



public class ArrayUtils {
    public static int[] generateUnsortedPositiveArray(int length) {
        int array[] = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 100);

        }
        return array;
    }

    public static int[] generateUnsortedArray(int length) {
        int array[] = new int[length];
        for (int i = 0; i < length; i++) {
            boolean positive = Math.random() > 0.5;
            if (positive)
                array[i] = (int) (Math.random() * 100);
            else
                array[i] = (int) (Math.random() * -100);
        }
        return array;
    }
}
