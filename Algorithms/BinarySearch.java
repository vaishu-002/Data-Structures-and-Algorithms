

public class BinarySearch {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int start=0;
        int end=arr.length-1;
        int n=4;

        search(arr, start, end, n);

        

        
    }
    public static void search(int arr[],int start, int end, int n){
        int m=(start+end)/2;
        int  mid = arr[m];
        
        if(arr[mid]==n){
            System.out.println("Number found on index :"+mid);
            
            return;
        }
        else{
            if(arr[mid]>n){
                start=0;
                end=m;
                
            }
            else{
                start=m;
                end=arr.length-1;
            }
            System.out.println(arr[start]+" "+arr[end]+" "+n+" "+mid);
            search(arr,start,end,n);
        }
        

        
    }
    
    
}
