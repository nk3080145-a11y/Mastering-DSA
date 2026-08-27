public class ReverseNum{
    public static int reverse(int n , int sum){
        if(n<1) return sum;
        sum = sum * 10 + n%10;
        return reverse(n/10 , sum);
    }
    public static void main(String[] args) {
        System.out.println(reverse(12345, 0));
    }
}