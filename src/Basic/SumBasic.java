void main() {
    Scanner sc = new Scanner(System.in);
    int a;
    int b;
    int c;
    IO.print("Enter three number : ");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    int sum = a + b + c;
    IO.print("The sum of three number is : " + sum);
    sc.close();
}
