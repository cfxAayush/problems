
import java.util.Arrays;

class practice{
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,32,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    
   

    static void selection(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int Max = getMax(arr, 0 , last);
            swap(arr, last, Max);
        }
    }

    static int getMax(int[] arr,int start, int end){
        int max = start;
        for(int i = start; i<=end; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}