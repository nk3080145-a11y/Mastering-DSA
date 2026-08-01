import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l;
        System.out.print("Enter length of rectangle : ");
        l = sc.nextInt();
        int b;
        System.out.print("Enter breadth of rectangle : ");
        b = sc.nextInt();
        int area = l * b;
        int para = 2 * (l + b);
        if(area>para){
            System.out.println("Yes Area is greater then Parimeter");
        }
        else{
            System.out.println("No Area is not greaterr then Parimeter");
        }
        sc.close();
    }
}
