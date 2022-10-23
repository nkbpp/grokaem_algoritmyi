public class QuickSort {

    public int[] sort(int[] arr) {

        return sort(arr, 0, arr.length - 1);
    }

    private int[] sort(int[] arr, int start, int end) {
        if (start < end) {
            int left = start;
            int right = end;
            int middle = arr[(left + right) / 2];
            do {
                while (arr[left] < middle) {
                    left++;
                }
                while (arr[right] > middle) {
                    right--;
                }
                if (left <= right) {
                    int tmp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = tmp;
                    left++;
                    right--;
                }
            } while (left < right);
            sort(arr,start,right);
            sort(arr,left,end);
        }
            return arr;
    }
}