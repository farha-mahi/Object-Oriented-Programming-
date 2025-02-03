//sum and average of elements in an array
public class element{
    public static void main(String[] args){
        int[] arr= {10,15,20,25,30,7};
        int sum=0;
        for (int = 0; i < arr.length;i++){
            sum=sum+arr[i];
        }
        float avg=sum/arr.length;
        System.out.println("Array Addition" +sum);
        System.out.println("Average" +avg);
    }
}