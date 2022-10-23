import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    int arr1[] = {5,4,3,2,1,0};
    int expectArray1[] = {0,1,2,3,4,5};

    @Test
    void sort() {
        QuickSort quickSort = new QuickSort();

        int[] resultArray = quickSort.sort(arr1);

        Arrays.stream(resultArray).forEach(System.out::println);
        assertThat(resultArray).isSorted();
    }
}