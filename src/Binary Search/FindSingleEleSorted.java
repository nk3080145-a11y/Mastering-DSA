import java.util.Scanner;

public class FindSingleEleSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all Element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // logic start
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (n == 1){
                ans = arr[0];
                break;
            }
            if (mid == 0) {
                if (arr[mid] != arr[mid + 1]) {
                    ans = arr[mid];
                    break;
                } else
                    low = mid + 1;
                continue;
            }
            if (mid == arr.length - 1) {
                if (arr[mid] != arr[mid - 1]) {
                    ans = arr[mid];
                    break;
                }
                else
                    high = mid - 1;
                continue;
            }
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                ans = arr[mid];
                break;
            }
            if (mid % 2 != 0) {
                if (arr[mid] == arr[mid - 1])
                    low = mid + 1;
                else if (arr[mid] == arr[mid + 1])
                    high = mid - 1;
            } else {
                if (arr[mid] == arr[mid - 1])
                    high = mid - 1;
                else if (arr[mid] == arr[mid + 1])
                    low = mid + 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}