import java.util.ArrayList;
import java.util.Scanner;

public class MoveAllEleToEnd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all the element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> arrl = new ArrayList<>();
        int zero = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arrl.add(arr[i]);
            }
            else{
                zero++;
            }
        }
        for(int i=0;i<zero;i++){
            arrl.add(0);
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = arrl.get(i);
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}