import java.util.Scanner;
public class PrintOnlyNegNumArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Enter size of array : ");
        n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all the element in Array : ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                System.out.print(arr[i] + " ");
            }
        }
        s.close();
    }
}
