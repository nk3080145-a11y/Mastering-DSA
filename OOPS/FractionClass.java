package OOPS;
class Fraction{
    int nem;
    int den;
    Fraction(int nem,int den){
        this.nem = nem;
        this.den = den;
        simplify();
    }
    void add(Fraction a){
        this.nem = (this.nem*a.den + this.den*a.nem);
        this.den = this.den * a.den;
        simplify();
    }
    void simplify(){
        int var = hcf(nem,den);
        nem = nem/var;
        den = den/var;
    }
    int hcf(int a,int b){
        if(b==0) return a;
        return hcf(b,a%b);
    }
    void multiply(Fraction a){
        this.nem *= a.nem;
        this.den *= a.den;
        simplify();
    }
    void print(){
        System.out.println(nem+"/"+den);
    }
    void division(Fraction a){
        this.nem *= a.den;
        this.den *= a.nem;
        simplify();
    }
}
public class FractionClass{
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 7);
        Fraction f2 = new Fraction(7,3);
        f1.print(); f2.print();
        f1.add(f2);
        f1.print();
        Fraction f3 = new Fraction(49, 100);
        f3.print();
    }
}