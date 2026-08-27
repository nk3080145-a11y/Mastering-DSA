import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all the element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target ;
        System.out.print("Enter the Target : ");
        target = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    flag = true;
                }
            }
        }
        if(flag==true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        sc.close();
    }
}
