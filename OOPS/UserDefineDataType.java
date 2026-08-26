package OOPS;

import org.w3c.dom.ls.LSOutput;

public class UserDefineDataType {
    public static class ComplexNum{
        double x;
        double y;
        ComplexNum(double x ,double y){
            this.x = x;
            this.y = y;
        }
        void print(){
            System.out.println(x+" + i"+y);
        }
        void add(double x , double y){
            this.x += x;
            this.y += y;
            print();
        }
        void add(ComplexNum s){
            this.x += s.x;
            this.y += s.y;
            print();
        }
        void multiply(ComplexNum s){
            x = x*s.x - y*s.y;
            y = x*s.y + y*s.x;
        }
        // a1a2+b1b2     b1a2-a1b2
        // --------- + i ---------
        // a2^2+b2^2     a2^2+b2^2
        void division(ComplexNum s){
            double squr1 = s.x*s.x;
            double squr2 = s.y*s.y;
            double squr = squr1+squr2;
            this.x = (this.x*s.x + this.y*s.y) / squr;
            this.y = (this.y*s.x - this.x*s.y) / squr;
        }
    }
    public static void main(String[] args) {
        ComplexNum num1 = new ComplexNum(3, 20);
        num1.print();
        ComplexNum num2 = new ComplexNum(4, 32);
        num2.print();
        num1.add(num2);
        // num2.print();
        num2.multiply(num1);
        num1.add(2,2);
        num2.add(2,2);
    }
}
