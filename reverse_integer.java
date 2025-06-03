public class reverse_integer {
    public static void main(String[] args){
        int a,b=0;
        a=1234;
        int temp=a;

        while (temp!=0){
            int rem = temp%10;
            b= b*10+rem;
            temp=temp/10;
        }
        System.out.print(b);    }
}
