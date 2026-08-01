import java.util.Scanner;
public class SearchEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all the element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target ;
        System.out.print("Enter the Search element : ");
        target = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            if(target==arr[i]){
                count++;
                target = i;
            }
        }
        if(count==0){
            System.out.println("Not found");
        }
        else{
            System.out.println("Yes this element is founded " + " And the index is : "+ target);
        }
        sc.close();
    }
}
