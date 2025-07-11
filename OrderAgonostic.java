package Com.BinarySearch;

public class OrderAgonostic {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,21};
        int target = 9;
        int ans = orderagonstic(arr,target);
        System.out.println(ans);
    }

    static int orderagonstic(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc =arr[start] < arr[end];

        while (start<=end){
            int mid= start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
               if(target>arr[mid]){
                   start=mid+1;
               }
               else{
                   end=mid-1;
               }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;

                }
            }


        }
        return -1;
    }
}
