import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BinaryFindTest {

    int arr[] = new int[100];

    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    @Test
    void search67() {
        BinaryFind binaryFind = new BinaryFind();

        int actualSolution = binaryFind.search(arr, 67);

        assertThat(actualSolution).isEqualTo(66);
    }

    @Test
    void search0() {
        BinaryFind binaryFind = new BinaryFind();

        int actualSolution = binaryFind.search(arr, arr[0]);

        assertThat(actualSolution).isEqualTo(0);
    }

    @Test
    void searchMax() {
        BinaryFind binaryFind = new BinaryFind();

        int actualSolution = binaryFind.search(arr, arr[99]);

        assertThat(actualSolution).isEqualTo(99);
    }

    @Test
    void searchMaxXx() {
        BinaryFind binaryFind = new BinaryFind();

        int actualSolution = binaryFind.search(arr, 1000);

        assertThat(actualSolution).isEqualTo(-1);
    }
}