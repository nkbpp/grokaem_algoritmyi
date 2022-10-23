public class Recursio {

    public int factorial(int num){
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        if (num < 0) {
            return -1;
        }
        return num * factorial(num - 1);
    }

    private int sum(int[] arr, int i){
        if(i == arr.length - 1) {
            return arr[i];
        }
        return arr[i] + sum(arr,i + 1);
    }

    public int sum(int[] arr){
        return sum(arr, 0);
    }

    private int max(int[] arr, int i){
        if(i == arr.length - 1) {
            return arr[i];
        }
        int maxR = max(arr,i + 1);
        return arr[i] > maxR ? arr[i]: maxR;
    }

    public int max(int[] arr){
        return max(arr, 0);
    }

    private int col(int[] arr, int num, int i){
        if(i == arr.length) {
            return 0;
        }
        int col = col(arr, num, i+1);
        if(arr[i] == num){
            return col+1;
        }else{
            return col;
        }
    }

    public int col(int[] arr, int num){
        return col(arr, num, 0);
    }

}
