import java.util.*;
public class Day03Work3{
    public static void main(String[] args){
        //5、保存用户名和密码，判断用户名是否为“张三”，密码是否为1234，如果是，提示登录成功，否则提示登录失败  ★
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String password = in.next();
        if(name.equals("张三") && password.equals("1234")){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}