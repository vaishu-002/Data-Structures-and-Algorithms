import java.util.Scanner;

class LinearSearch{
public static void main(String[] args) {
    System.out.println("Hello World");
		int arr[]={2,3,1,4,9,6,0};
		System.out.println("Enter the Number you want to Search : ");
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();

        
	    
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==n){
	            System.out.println("You number found on index : "+ i);
	            return;
	        }
	        
	    }
	    System.out.println("Your number not found");
}
}