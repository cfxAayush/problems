class binary{
    public static void main(String[] args) {
        int[] arr = {11,9,7,5,3,1,0};
        int target = 5;
        int ans = order(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid -1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }



    //order agnostic search
    static int order(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        boolean isAsc; // initialised a boolean variable
        if(arr[start]<arr[end]){  // checking the array is sirted in which form 
            isAsc = true;
        }else{
            isAsc = false;
        }

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

           if(isAsc){
             if(target<arr[mid]){
                end = mid -1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
           }else{
             if(target>arr[mid]){
                end = mid -1;
            }
            else if(target<arr[mid]){
                start = mid+1;
            }
           }
          
           
        }
        return -1;
    }

}