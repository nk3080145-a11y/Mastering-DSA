public class towerOfHanoi {
    public static void hanoi(int n,char sour,char helper,char desti){
        if(n==0) return;
        hanoi(n-1,sour,desti,helper);
        System.out.println(sour+"->"+desti);
        hanoi(n-1,helper,sour,desti);
    }
    public static void main(String[] args) {
        hanoi(6,'A','B','C');
    }
}
