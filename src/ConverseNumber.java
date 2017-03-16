/**
 * Created by 娟 on 2017/3/16.
 */
import java.util.*;
public class ConverseNumber {
    public static void main(String arga[]){
        Scanner in=new Scanner(System.in);
        System.out.print("输入一个正整数");
        int m=in.nextInt();
        int t,a;
        do{
            a=m/10;
            t=m%10;
            System.out.print(t);
            m=a;
        }while (m!=0);
        in.close();
    };

}
