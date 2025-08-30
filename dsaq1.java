
public class dsaq1 {

    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,5,5};
        int n = arr.length;
        int temp=0;
        for (int i = 0; i<n; i++) {
            for(int j=i+1; j<n; j++){
                //if duplicates are present
                if(arr[i]==arr[j]){
                    //pop the duplicate element and shring the array size
                    arr[j] = arr[n-1];
                    n--;
                    j--;
                    continue;
                }
                //Comparing elements of the array
                if(arr[i]<arr[j]){
                    //Swap Elements
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } 
            }
        }
        System.out.println("The second largest element is: " + arr[1]);
    }
}
