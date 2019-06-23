package 二十三种设计模式.五大创建型模式.抽象工厂;

/**
 * 工厂方法是在解决一个产品多个层级方面的事情；而抽象工厂致力于解决多个产品多个层级方面的事情
 * 案例：不同的工厂生产不同的轮胎和方向盘
 */
public class 抽象工厂{
	public static void main(String[] args) {
		BWMFactory bwm = new BWMFactory();
		bwm.productTire();
		bwm.productWheel();
		
		BanzFactory banz = new BanzFactory();
		banz.productTire();
		banz.productWheel();
	}
}

class BWMFactory implements IFactory{
	@Override
	public void productTire() {
		ITireFactory bwm = new BMWTireFactory();
		String tire = bwm.createTire();
		System.out.println("宝马工厂安装"+tire);
	}

	@Override
	public void productWheel() {
		IWheelFactory bwm = new BMWWHeelFactory();
		String wheel = bwm.createWheel();
		System.out.println("宝马工厂安装"+wheel);
	}
}

class BanzFactory implements IFactory{
	@Override
	public void productTire() {
		ITireFactory banz = new BanzTireFactory();
		String tire = banz.createTire();
		System.out.println("奔驰工厂安装"+tire);
	}

	@Override
	public void productWheel() {
		IWheelFactory banz = new BanzWHeelFactory();
		String wheel = banz.createWheel();
		System.out.println("奔驰工厂安装"+wheel);
	}
}

//������̥��������
class BMWTireFactory implements ITireFactory{
	@Override
	public String createTire() {
		System.out.println("宝马轮胎工厂生产轮胎");
		return "宝马轮胎";
	}
}

//������̥��������
class BanzTireFactory implements ITireFactory{
	@Override
	public String createTire() {
		System.out.println("奔驰轮胎工厂生产轮胎");
		return "奔驰轮胎";
	}
}

//����������������
class BMWWHeelFactory implements IWheelFactory{
	@Override
	public String createWheel() {
		System.out.println("宝马方向盘工厂生产方向盘");
		return "宝马方向盘";
	}
}

//���۷�������������
class BanzWHeelFactory implements IWheelFactory{
	@Override
	public String createWheel() {
		System.out.println("奔驰方向盘工厂生产方向盘");
		return "奔驰方向盘";
	}
}