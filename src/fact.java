public class fact{
    public static int fac(int n){
        if(n==0){
            return 1;
        }
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        int arr=fac(7);
        System.out.println(arr);
    }
}