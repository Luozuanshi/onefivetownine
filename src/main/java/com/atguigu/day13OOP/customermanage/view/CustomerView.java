package src.main.java.com.atguigu.day13OOP.customermanage.view;

import src.main.java.com.atguigu.day13OOP.customermanage.domain.Customer;
import src.main.java.com.atguigu.day13OOP.customermanage.service.CustomerServcie;
import src.main.java.com.atguigu.day13OOP.customermanage.util.CMUtility;

/*
 * -----------------客户信息管理软件-----------------

                            1 添 加 客 户
                            2 修 改客 户
                            3 删 除 客 户
                            4 客 户 列 表
                            5 退           出

                            请选择(1-5)：_

 */
public class CustomerView {

    private boolean loop = true;// 控制菜单是否显示
    private char key; // 接收用户的选择
    private CustomerServcie customerServcie = new CustomerServcie(100);
    // mainMenu ，显示主菜单

    public void mainMenu() {

        do {
            System.out.println("-----------------客户信息管理软件-----------------");
            System.out.println("                 1 添 加 客 户");
            System.out.println("                 2 修 改客 户");
            System.out.println("                 3 删 除 客 户");
            System.out.println("                 4 客 户 列 表");
            System.out.println("                 5 退         出");
            System.out.print("请选择(1-5)：");
            key = CMUtility.readChar();

            switch (key) {
                case '1':
                    addCustomer();
                    break;
                case '2':
                    System.out.println(" 修 改客 户");
                    break;
                case '3':
                    this.delCustomerById();
                    break;
                case '4':
                    this.showCustomerList();
                    break;
                case '5':
                    System.out.println("退出");
                    loop = false;
                    break;
                default:
                    System.out.println("你的输入有误~~");
                    break;
            }

        } while (loop);

        System.out.println("你退出的管理系统~~");
    }


    //删除客户
    public void delCustomerById() {
        System.out.println("---------------删除客户-------------");
        System.out.println("请输入待删除的客户id(-1表示退出)");
        int delId = CMUtility.readInt();
        if(delId == -1) {
            System.out.println("--------------删除失败------------");
            return; //表示退出当前方法
        }

        //下面这个方法，要求客户必须输入'Y', 'N'
        char choice = CMUtility.readConfirmSelection();

        if(choice == 'Y') {
            //删除
            if(customerServcie.delCustomerById(delId)){
                System.out.println("--------------删除成功------------");
            } else{
                System.out.println("该id不存在，不能删除");
                System.out.println("--------------删除失败------------");
            }
        } else {
            System.out.println("--------------你放弃了删除客户------------");
        }


    }

    //调用CustomerService的方法，获取要显示的客户，并显示
    public void showCustomerList() {

        Customer[] customers = customerServcie.showList();
        System.out.println("======================客户列表=====================");
        System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
        //显示
        for(int i = 0; i < customers.length; i++) {
            //取出一个一个的Customer
            Customer customer = customers[i];
            System.out.println(customer);
        }
        System.out.println("======================客户列表完成=====================");
    }

    //调用CustomerService的方法，addCustomer方法
	/*
	 * ---------------------添加客户---------------------
		姓名：张三
		性别：男
		年龄：30
		电话：010-56253825
		邮箱：zhang@abc.com
		---------------------添加完成---------------------

	 */
    public void addCustomer() {
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(10);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        short age = (short)CMUtility.readInt();
        System.out.print("电话：");
        String tel = CMUtility.readString(11);
        System.out.print("邮箱：");
        String email = CMUtility.readString(20);


        boolean b = customerServcie.addCustomer(name, gender, age, tel, email);
        if(b) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("---------------------添加没有完成---------------------");
        }
    }
}
