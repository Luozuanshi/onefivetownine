/**
 * 
 */
package com.atguigu.day12OOP.ktWork;

/**
   * 项目名称：domo
   *类名称：Order
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月14日上午11:34:57
   * 类描述
 */
public class Order {
	private int orderId;
	private String OrderName;

	public Order(int orderId, String orderName) {
		super();
		this.orderId = orderId;
		OrderName = orderName;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Order)) {
			return false;
		}
		
		Order order = (Order)obj;
		
		return this.orderId==order.orderId && this.OrderName.equals(order.OrderName);
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return OrderName;
	}
	public void setOrderName(String orderName) {
		OrderName = orderName;
	}
	
	public static void main(String[] args) {
		Order order = new Order(123456, "123");
		Order order1 = new Order(123455, "123");
		
		System.out.println(order.equals(order));
	}
	
}
