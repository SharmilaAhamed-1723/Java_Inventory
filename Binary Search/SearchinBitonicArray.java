package binarysearch;
public class SearchinBitonicArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,8,9,8,7,4,3,2,1};
        int target=4;
        int result= targetinBitonicArr(arr, target);
        System.out.println(result);
    }
    static int targetinBitonicArr(int[] arr, int target){
        int peak=searchPeakIndex(arr);
        int SearchinAscOrder=OrderAgnosticSearch(arr, target, 0, peak);
        if(SearchinAscOrder!=-1){
            return SearchinAscOrder;       
        }
        else{
            return OrderAgnosticSearch(arr, target, peak+1, arr.length-1);
        }    
    }     

    static int searchPeakIndex(int[] arr) {
    int start=0;
    int end= arr.length-1;
    while(start< end){
        int mid=start+(end- start)/ 2;
        if(arr[mid]>arr[mid+1])
            end=mid;
        else
            start = mid+1;
    }
    return start;
    }

    static int OrderAgnosticSearch(int[] arr, int target, int start, int end) {
        boolean isAscOrder = arr[start] < arr[end];
        while(start<=end){
            int mid= start + (end - start)/2;
            if(arr[mid]== target){
                 return mid;
            }
            if(isAscOrder){
                if(arr[mid]<target)
                    start=mid+1; 
                else
                    end=mid-1;
            }
            else{
                if(arr[mid]<target)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return -1;
    }
}
