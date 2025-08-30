public class dsaq2{
    public static void main(String[] args) {
        String str="hello";
        char arr[]=str.toCharArray();
        int n= arr.length;
        int temp=0;
 
        for(int i=0; i<n; i++){
            char chl=arr[i];
            for(int j=i+1; j<n; j++){
                char chr=arr[j];
                if(chl==chr){
                    arr[j]=arr[n-1];
                    n--;
                    j--;
                    continue;
                }else if(chl<chr){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=(char)temp;
            }


        }
        for( i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }
}
}