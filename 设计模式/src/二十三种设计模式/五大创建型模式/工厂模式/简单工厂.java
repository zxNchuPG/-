package 二十三种设计模式.五大创建型模式.工厂模式;

/**
 * 价值观：扩展是我的专属
 * 简单工厂也叫静态工厂模式，通过工厂if判断返回对象，扩展性较差
 * @author 时间
 *
 */
public class 简单工厂 {
	public static void main(String[] args) {
		People people = new People("Jason");
		ISimpleCar motor = CarFactory.getCar("Motor");
		ISimpleCar car = CarFactory.getCar("Car");
		people.shopping(motor);
		people.travel(car);
	}
}

class CarFactory{
	public static ISimpleCar getCar(String type) {
		if("Car".equals(type)) {
			return new Car();
		}else if("Motor".equals(type)){
			return new Motor();
		}else {
			return null;
		}
	}
}

class People{
	String name;
	
	public People(String name) {
		this.name = name;
	}
	
	public void shopping(ISimpleCar simpleCar) {
		System.out.println(name+" 出门购物");
		simpleCar.run();
	}
	
	public void travel(ISimpleCar simpleCar) {
		System.out.println(name+" 出门旅游");
		simpleCar.run();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

/**
 * 摩托车
 * @author 时间
 *
 */
class Motor implements ISimpleCar{
	@Override
	public void run() {
		System.out.println("摩托车.....");
	}
}

/**
 * 汽车
 * @author 时间
 *
 */
class Car implements ISimpleCar{
	@Override
	public void run() {
		System.out.println("汽车...");
	}
}