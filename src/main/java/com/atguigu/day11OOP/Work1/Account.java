/**
 * 
 */
package com.atguigu.day11OOP.Work1;

/**
 * 项目名称：domo 类名称：Account
 * 
 * @author Administrator
 * @version 1.0 创建时间2019年12月13日下午6:33:38 类描述
 *          1、扩展如下的BankAccount类，新类CheckingAccount对每次存款和取款都收取1美元的手续费 class
 *          BankAccount(double initialBalance){ private int balance =
 *          initialBalance public void deposit(double amount) = { balance +=
 *          amount; balance} public withdraw(double amount) = {balance -=
 *          amount; balance}
 * 
 *          2、
 *          扩展前一个练习的BankAccount类，新类SavingsAccount每个月都有利息产生(earnMonthlyInterest方法被调用)，
 *          并且有每月三次免手续费的存款或取款。在earnMonthlyInterest方法中重置交易计数。 }
 */
public class Account {
	public static void main(String[] args) {
		
//		1、扩展如下的BankAccount类，新类CheckingAccount对每次存款和取款都收取1美元的手续费
		BankAccount account = new CheckingAccount(5000);//子类对象用父类接收
		account.deposit(100); //调用的方法是子类的重写方法
		account.deposit(100); //调用的方法是子类的重写方法
		System.out.println(account.getBalance());//打印余额

		
//	 2.     扩展前一个练习的BankAccount类，新类SavingsAccount每个月都有利息产生(earnMonthlyInterest方法被调用)，
//		并且有每月三次免手续费的存款或取款。在earnMonthlyInterest方法中重置交易计数。 }
		SavingsAccount savingsAccount = new SavingsAccount(500, 0, 0.5);
		
		savingsAccount.deposit(100);
		System.out.println(savingsAccount.getBalance());
		savingsAccount.deposit(100);
		System.out.println(savingsAccount.getBalance());
		savingsAccount.deposit(100);
		System.out.println(savingsAccount.getBalance());
		savingsAccount.deposit(100);
		System.out.println(savingsAccount.getBalance());

		 
		savingsAccount.setBalance(savingsAccount.getBalance()+savingsAccount.earnMonthlyInterest());
		savingsAccount.deposit(100);
		System.out.println(savingsAccount.getBalance());
		savingsAccount.deposit(100);
		System.out.println(savingsAccount.getBalance());
		savingsAccount.deposit(100);
		System.out.println(savingsAccount.getBalance());
		
		System.out.println("共获得利息"+savingsAccount.earntotleInterest());
		
	}
}

class BankAccount {
	private double initialBalance;
	private double balance;
	
	//父类构造方法
	public BankAccount(double initialBalance) {
		super();
		this.initialBalance = initialBalance;
		this.balance = initialBalance;
	}
	//父类的无参构造
	public BankAccount() {
		
	}
	
	//存钱
	public void deposit(double amount) {
		balance += amount;
	}
	//取钱
	public void withdraw(double amount) {
		balance -= amount;
	}

	//getter setter 方法
	public double getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}

class CheckingAccount extends BankAccount{
	/**
	 * 	子类继承父类，父类有多个构造器无默认构造方法，子类需要显示声明
	 * @param initialBalance
	 */
	public CheckingAccount(double initialBalance) {
		super(initialBalance);
	}
	
	/**
	 * 	子类重写父类的方法
	 */
	@Override
	public void deposit(double amount) {
		super.deposit(amount);
		setBalance(getBalance()-1);
		System.out.println(getBalance());
	}
	/**
	 * 子类重写父类的方法
	 */
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		setBalance(getBalance()-1);
		System.out.println(getBalance());
	}
	
}

/**
 * 2、
    *          扩展前一个练习的BankAccount类，新类SavingsAccount每个月都有利息产生(earnMonthlyInterest方法被调用)，
    *          并且有每月三次免手续费的存款或取款。在earnMonthlyInterest方法中重置交易计数。 }
 */
class SavingsAccount extends BankAccount{
	private int transactionCount;//交易次数
	private double monthInterest;//利息
	private double rate;//月利率
	
	
	public SavingsAccount(double initialBalance, double monthInterest, double rate) {
		super(initialBalance);
		this.monthInterest = monthInterest;
		this.rate = rate;
	}

	//获取当月利息
	public double earnMonthlyInterest() {
		transactionCount =0;
		return monthInterest += getBalance()*rate;
	}
	
	//总计共获得利息
	public double earntotleInterest() {
		return monthInterest;
	}
	
	@Override
	public void deposit(double amount) {
		transactionCount++;
		if(transactionCount<=3) {
			setBalance(getBalance()+amount);
		}else {
			setBalance((getBalance()+amount)-1);
		}
	}

	@Override
	public void withdraw(double amount) {
		transactionCount++;
		if(transactionCount<=3) {
			setBalance(getBalance()+amount);
		}else {
			setBalance((getBalance()+amount)-1);
		}
		
	}
	
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
	
}