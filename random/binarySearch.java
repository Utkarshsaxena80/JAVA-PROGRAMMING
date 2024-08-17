
 public class binarySearch{
 int  bs(int arr[],int x){
int n=arr.length;
int low=0,high=n-1;
int mid= low+(high-low)/2;
while(low<= high){

if(arr[mid]==x) return mid;

if(arr[mid]>x) high=mid-1;

else low=mid+1;
}
return -1; } 

public static void main(String[]args){
 binarySearch ob= new binarySearch ();
int [] arr={1,2,3,4,5,6,7,8,9};
int x=9;
int result = ob.bs(arr, x);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at "
                               + "index " + result);
    }
} 