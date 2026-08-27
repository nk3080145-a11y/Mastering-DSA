import java.util.Scanner;

public class SquareRoot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number : ");
        n = sc.nextInt();
        int low = 1 , high = n;
        while(low<=high){
            int mid = low + (high-low) / 2;
            if(mid==n/mid){
                high = mid;
                break;
            }
            else if(mid>n/mid) high = mid - 1;
            else low = mid + 1;
        }
        System.out.println(high);
        sc.close();
    }
}