import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target;
        System.out.print("Enter target : ");
        target = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            if(target == arr[i]){
                count = i;
            }
        }
        if(count==0){
            System.out.println("Target Element is not found!!!");
        }else{
            System.out.println("Target Element is found on index : " + count);
        }
        sc.close();
    }
}
