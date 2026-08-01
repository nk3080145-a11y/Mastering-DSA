import java.util.Scanner;
public class SecondMaxEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all the element : ");
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(secmax<arr[i]){
                secmax = arr[i];
            }
            if(max==secmax){
                secmax = arr[i+1];
            }
        }
        System.out.println(max);
        System.out.println(secmax);
        sc.close();
    }
}
