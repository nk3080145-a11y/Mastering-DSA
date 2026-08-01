import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all the Element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target;
        System.out.print("Enter target");
        target = sc.nextInt();
        int firstIdx = -1 , secondIdx = -1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    firstIdx = i;
                    secondIdx = j;
                    break;
                }
            }
        }
        if(firstIdx==-1){
            System.out.print("Two sum not found");
        }else{
            System.out.println("Two sum is found " + arr[firstIdx]+" , " + arr[secondIdx]+ " and these index is " + firstIdx+" " + secondIdx); 
        }
        sc.close();
    }
}
