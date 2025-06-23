
import java.util.Arrays;

class sortings{
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    // selection sort -------->
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item in remaining array and swap with correct index
            int last = arr.length -i-1;
            int maxIndex = getMax(arr, 0 , last);
            // you have to swap between 0 and last index you got previously 

            swap(arr, maxIndex, last);
        }

    }
    static int getMax(int[] arr, int start,int end){
        int max = start;
         for(int i = start; i<= end; i++){
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

    // bubble sort------------>

    static void bubble_sort(int[] arr){                                                                                         
        boolean swapped; // here we only initialized the boolean variable that names swapped                                                                                                                                        
        // run the steps (n-1)times                                                                                                         
        for (int i = 0 ; i <arr.length; i++) { 
            swapped = false;
            // for each step, max item will come at the last respective index
            for(int j = 1; j <arr.length - i; j++){
                // swap if the item is smaller than the previous item 
                if(arr[j]<arr[j-1]){
                    // swap the position 
                    int temp = arr[j]; // temp = a;
                    arr[j] = arr[j-1]; // a = b
                    arr[j-1] = temp;   // b = temp
                    swapped = true;
                }
            }
                    if(!swapped){ // !false = true
            break;
        }

        }
    
    }

    // insertion sort-------->
    static void insertion(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }

    // cyclic sort--------->
    static void cyclic(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!= arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
   
}