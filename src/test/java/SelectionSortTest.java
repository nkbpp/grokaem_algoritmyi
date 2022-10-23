import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SelectionSortTest {

    int arr1[] = {5,4,3,2,1,0};
    int expectArray1[] = {0,1,2,3,4,5};

    int arr2[] = {5,3,6,2,10};

    @Test
    void selectionSort() {
        SelectionSort selectionSort = new SelectionSort();

        int[] resultArray = selectionSort.selectionSort(arr1);

        assertThat(resultArray).isSorted();
    }

    @Test
    void selectionSort2() {
        SelectionSort selectionSort = new SelectionSort();

        int[] resultArray = selectionSort.selectionSort(arr2);

        assertThat(resultArray).containsExactly(new int[]{2,3,5,6,10});
        assertThat(resultArray).containsExactly(2,3,5,6,10);
        assertThat(resultArray).containsSequence(3,5,6);
    }

}