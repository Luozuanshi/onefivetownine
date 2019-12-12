package com.atguigu.day10OOP.Work6;
/**
 * 
   * 项目名称：domo
   *类名称：Account
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月12日下午1:44:49
   * 类描述 八： 创建程序,在其中定义两个类：Account和AccountTest类体会Java的封装性。
	Account类要求具有属性：姓名(String长度2-4)、余额(至少10)、密码(六位)
	通过setXxx的方法给Account 的属性赋值。
	在AccountTest中测试 
 */
public class Account {
	private String name;
	private String cardNumber;
	private double balance;
	private String pwd;
	
	public Account(String name,String cardNumber,double balance,String pwd) {
		 this.name = name;
		 this.cardNumber = cardNumber;
		 this.balance = balance;
		 this.pwd = pwd;
	}
	//查询
	public void query (String pwd) {
		if(this.pwd.equals(pwd)) {
			System.out.println(name+"查询 余额:" + this.balance);
		}else {
			System.out.println("密码错误");
		}
		
	}
	//充值
	public void recharge(String pwd,double rechargeMoney) {
		if(this.pwd.equals(pwd)) {
			if(rechargeMoney>0){
				this.balance += rechargeMoney;
				System.out.println(name+" "+rechargeMoney+" 充值 成功");
			}else {
				System.out.println("非法金额");
			}
			
		}else {
			System.out.println("密码错误");
		}
		
	}
	//取款
	public void withdraw(String pwd,double withdrawMoney) {
		if(pwd==this.pwd) {
			if(withdrawMoney<this.balance && withdrawMoney >0) {
				this.balance -= withdrawMoney;
				System.out.println(name+"转账"+withdrawMoney+" 取现成功");
			}else {
				System.out.println("余额不足或者输入金额违法取现失败");
			}
		}else{
			System.out.println("密码错误");
		}
	}
	//转账
	public void transfer(Account a,String cradNumber, double transferMoney) {
		if(a.cardNumber.equals(cradNumber)) {
			if(transferMoney>0) {
				if(this.balance >transferMoney) {
					this.balance -= transferMoney;
					a.balance += transferMoney;
					System.out.println("给"+ a.name +"转账成功");
				}else {
					System.out.println("余额不足");
				}
			}else {
				System.out.println("转账金额非法");
			}
		}else {
			System.out.println("卡号不匹配");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	 
	
}
