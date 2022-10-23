

public class SelectionSort {

    public int[] selectionSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            int maxValueIndex = 0;
            int maxValue = arr[maxValueIndex];
            for (int j = 1; j <= i; j++) {
                if (maxValue < arr[j]) {
                    maxValueIndex = j;
                    maxValue = arr[maxValueIndex];
                }
            }
            int tmp = arr[i];
            arr[i] = arr[maxValueIndex];
            arr[maxValueIndex] = tmp;
        }
        return arr;
    }
}
