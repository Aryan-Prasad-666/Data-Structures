
public class binarysearch {
    static int binsearch(int [] arr, int key){
        //requires sorted arr
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = left + (right - left)/2;

            if(arr[mid]==key){
                return mid;
            }

            if(arr[mid]>key){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        //key not found
        return -1;
    }

    static int floor(int [] arr, int key){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = left + (right - left)/2;

            if(arr[mid]==key){
                return mid;
            }

            if(arr[mid] > key){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        // key not found
        if(left-1 > 0){
        return left -1 ;

        }else{
            return -1;
        }
    }

    static int ceil(int [] arr, int key){
        int left = 0;
        int right = arr.length-1;
        int ceil = -1;

        while(left<=right){
            int mid = left + (right - left)/2;

            if(arr[mid]==key){
                return mid;
            }

            if(arr[mid] > key){
                ceil = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return ceil;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(binsearch(arr, 10));
    }    
}
