package 二十三种设计模式.十一大行为模式.中介者模式;

import java.util.Arrays;
import java.util.List;

/**
 * 中介者模式通过在互相依赖的对象中间加了一层，让原本强依赖的对象变成弱依赖
 * 代码案例：租房
 * 典型案例：MVC 框架，也称三层架构
 * 通过 Controller (控制层) 将 Model (业务逻辑层) 和 View (视图层) 的依赖给分离开
 * @author 时间
 *
 */
public class 中介者模式 {
	public static void main(String[] args) {
		System.out.println("小明想看民房和公寓");
		User user = new User("小明", Arrays.asList("farmersHouse","apartment"));
		user.findHouse();
	}
}

class User{
	String name;
	List<String> types;
	private Mediator mediator = new Mediator();
	
	public User(String name,List<String> types){
		this.name = name;
		this.types = types;
	}
	
	public void findHouse() {
		mediator.provide(types);
	}
}

/**
 * 中介
 * @author 时间
 *
 */
class Mediator extends Middle{
	private FarmersHouse farmersHouse ;
	private Apartment apartment;
	public Mediator() {
		farmersHouse = new FarmersHouse();
		apartment = new Apartment();
	}
	
	@Override
	void provide(List<String> types) {
		System.out.println("中介者提供如下房源：");
		if(types.contains("farmersHouse")) {
			farmersHouse.rent();
		}
		if(types.contains("apartment")) {
			apartment.rent();
		}
	}
	
}

class FarmersHouse extends Landlord{
	@Override
	void rent() {
		System.out.println("民房一套");
	}
}

class Apartment extends Landlord{
	@Override
	void rent() {
		System.out.println("公寓一套");
	}
}