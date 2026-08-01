import java.util.Scanner;
public class Quadrant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x ;
        System.out.print("Enter x axis : ");
        x = sc.nextInt();
        int y ;
        System.out.print("Enter y axis : ");
        y = sc.nextInt();
        if(x>0 && y>0){
            System.out.println("1st Quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("2nd Quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("3rd Quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("4th Quadrant");
        }
        else if(x==0 && y==0){
            System.out.println("At the origin");
        }
        else if(x==0){
            System.out.println("Y Axis");
        }
        else if(y==0){
            System.out.println("X Axis");
        }
        sc.close();
    }
}
