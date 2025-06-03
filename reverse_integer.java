class RevInt {
    public int Revfuns(int a) {
        int rev = 0;
        int temp = a;

        while (temp != 0) {
            int rim = temp % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10){
                System.out.print(0);
                return 0;
            }
            rev = rev * 10+rim;
            temp = temp / 10;
        }
        System.out.print("Reverse Integer is:"+rev);
        return rev;
    }
}

public class reverse_integer {
    public static void main(String[] args) {
        int a = 1534236469;
        RevInt rv = new RevInt();
        rv.Revfuns(a);
    }
}
