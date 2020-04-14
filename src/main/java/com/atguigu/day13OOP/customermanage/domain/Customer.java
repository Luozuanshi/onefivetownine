package src.main.java.com.atguigu.day13OOP.customermanage.domain;

//类
//叫法： pojo [简单java对象], javabean , 实体类, domain类
// 
//编号  姓名       性别    年龄   电话            邮箱

public class Customer {

	//属性.
	private int id;
	private String name;
	private char gender;
	private short age;
	private String tel;
	private String email;
	
	
	//框架，使用反射, 往往需要重新声明(定义)无参构造器
	
	
	public Customer(int id, String name, char gender, short age, String tel, String email) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.tel = tel;
		this.email = email;
	}
	
	public Customer(String name, char gender, short age, String tel, String email) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.tel = tel;
		this.email = email;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public short getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + "\t" + name + "\t"
				  + gender+ "\t" + age + "\t" + tel + "\t" + email;
	} 
}
