/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author arch
 */
public class Order {
	private Dish[] dishes;
	private String deliveryTime;
	private String deliveryPoint;
	private ORDER_STATUS orderStatus;
	private DeliveryMan deliveryMan;

	public Order(Dish[] dishes, String deliveryTime, String deliveryPoint, ORDER_STATUS orderStatus, DeliveryMan deliveryMan) {
		this.dishes = dishes;
		this.deliveryTime = deliveryTime;
		this.deliveryPoint = deliveryPoint;
		this.orderStatus = orderStatus;
		this.deliveryMan = deliveryMan;
	}

	public Dish[] getDishes() {
		return dishes;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public String getDeliveryPoint() {
		return deliveryPoint;
	}

	public ORDER_STATUS getOrderStatus() {
		return orderStatus;
	}

	public DeliveryMan getDeliveryMan() {
		return deliveryMan;
	}

	public void setDishes(Dish[] dishes) {
		this.dishes = dishes;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public void setDeliveryPoint(String deliveryPoint) {
		this.deliveryPoint = deliveryPoint;
	}

	public void setOrderStatus(ORDER_STATUS orderStatus) {
		this.orderStatus = orderStatus;
	}

	public void setDeliveryMan(DeliveryMan deliveryMan) {
		this.deliveryMan = deliveryMan;
	}

	public void appendDish(Dish dish) {

	}
}
