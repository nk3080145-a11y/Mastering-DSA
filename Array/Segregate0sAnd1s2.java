import java.util.Scanner;

public class Segregate0sAnd1s2 {
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
        int Num0s = 0;
        int Num1s = 1;
        for(int val : arr){
            if(val==0) Num0s++;
            else Num1s++;
        }
        for(int i=0;i<Num0s;i++){
            arr[i] = 0;
        }
        for(int i=Num0s;i<Num1s;i++){
            arr[i] = 1;
        }
        for(int val : arr){
            System.out.print(val + " ");
        }
        sc.close();
    }
}
