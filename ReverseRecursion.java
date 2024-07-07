class ReverseRecursion {

    public static void fact(int n) {
        if(n==0)
        {
            return;
        }
            System.out.println(n);
            fact(n-1);
    }
    public static void main(String[] args) {
        fact(10);
    }
}