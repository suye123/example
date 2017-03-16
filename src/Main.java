import static java.lang.Math.random;

class IsPrime{
    public static void main(String args[]) {
        int number=(int)(random()*1000)+2;
        int sqrt=(int)Math.sqrt(number);
        int i;
        for (i=2;i<=sqrt;i++)
            if (number%i==0)
                break;
        if (i>sqrt)
            System.out.println(number+"是素数");
        else
            System.out.println(number+"不是素数");
    }
}
