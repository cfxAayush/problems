class linear{
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 20, 30, 40, 50, 60};
        int target = 20;
        
        System.out.println(occur(arr, target));
    }
// check array if sorted

    static boolean sort(int[] arr){
        if(arr.length==0){
            return false;
        }
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]<arr[i-1]){
                return false;
            }
            
        }
        return true;
    }

// check count occurance

    static int occur(int[] arr, int target){
        int count = 0;

        for(int num : arr){
            if(num==target){
                count++;
            }
        }
        return count;
    }

// search for even numbers 

    static int even(int[] arr, int target){
        if(arr.length==0){
            return 0;
        }
        
        for (int num : arr){
            if(num%2==0){
                return num;
            }
        } 
        return 0;
            
        
    }
}