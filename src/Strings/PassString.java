public class PassString {
    public static void change(String x){
        x = "Adnan";
    }
    public static void main(String[] args) {
        String s = "Noman Khan";
        change(s);
        System.out.println(s);
    }
}
