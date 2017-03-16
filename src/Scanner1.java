/**
 * Created by 娟 on 2017/3/9.
 */
import java.util.*;
class UseScanner {
    public static void main(String args[]){
        //输入创建对象
        Scanner kl=new Scanner(System.in);
        System.out.print("输入姓名：");
        String name = kl.nextLine();
        System.out.print("输入年龄：");
        int age =kl.nextInt();
        System.out.print("输入身高（米）：");
        double height=kl.nextDouble();
        System.out.print("姓名:"+name+"年龄："+age+"身高："+height);
        kl.close();
    }
}
