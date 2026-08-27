public class BuildInMethods {
    public static void main(String[] args) {
        String s = "harshitam";
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        if(s.contains("man")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        String s2 = "harsh";
        System.out.println(s.compareTo(s2));
    }
}