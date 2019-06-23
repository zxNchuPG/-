package 二十三种设计模式.五大创建型模式.单例模式;

/**
 * 确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例
 * 
 *  案例：小明家只有一辆车，去哪都需要用车，车属于单例
 * 
 * @author 时间
 *
 */
public class 单例模式 {
	public static void main(String[] args) {
		People people = new People("小明");
		Car car = people.shopping();
		Car car1 = people.travel();
		//判断下是否属于同一辆车
		System.out.println("car1 == car2 ? " + (car == car1));
	}
}

class People {
	String name;

	public People(String name) {
		this.name = name;
	}

	public Car shopping() {
		Car car = Car.getInstance();
		System.out.println(name + " 用车去购物");
		car.run();
		return car;
	}

	public Car travel() {
		Car car = Car.getInstance();
		System.out.println(name + " 用车去旅游");
		car.run();
		return car;
	}
}

class Car {
	private static Car car = new Car();// 饿汉式单例模式

	private static Car car1;//懒汉式单例模式

	public void run() {
		System.out.println("出发.....");
	}

	/**
	 * 饿汉式
	 * @return
	 */
	public static Car getInstance() {
		return car;
	}

	/**
	 * 懒汉式
	 * @return
	 */
	public static Car getInstance1() {
		if (null == car1) {
			car1 = new Car();
		}
		return car;
	}
}
