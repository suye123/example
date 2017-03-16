/**
 * Created by 娟 on 2017/3/2.
 */
public class IsPrime_2 {
    public static void main(String args[]) {

        int number = (int) (Math.random() * 100) + 2;
        int sqrt = (int) Math.sqrt(number);
        int i;
        //标记FOR语音
        for (i = 2; i <= sqrt; i++)
            if (number % i == 0)
                break;
        if (i > sqrt)
            System.out.println(number + "是素数");
        else
            System.out.println(number+"不是素数");
    }
}
