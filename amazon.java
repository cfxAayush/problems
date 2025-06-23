

class amazon{
    public static void main(String[] args) {
        int[] arr = {9,7,5,3,2,1,0};
        int ans = missing_numbers(arr);
        System.out.println(ans);
    }
// find the mmissing numbers in given array ---->
    static int missing_numbers(int[] arr){
    int i = 0;
    while(i<arr.length){
        int correct = arr[i];
        if(arr[i]< arr.length && arr[i] != arr[correct]){
            swap(arr, i, correct);
        }
        else{
            i++;
        }
    }
     
    for(int index = 0; index< arr.length; index++){
        if(arr[index] != index){
            return index;
        }
    }
     return arr.length;
   }


   static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

 
}