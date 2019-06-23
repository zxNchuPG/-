package 二十三种设计模式.五大创建型模式.工厂模式;

/**
 * 相比简单工厂，可以看作将工厂也抽象化
 * 
 * @author 时间
 *
 */
public class 工厂方法 {
	public static void main(String[] args) {
		People people = new People("Jason");

		IGarage motorImpl = new MotorImpl();
		ISimpleCar motor = motorImpl.getSimpleCar();
		people.shopping(motor);

		IGarage carImpl = new CarImpl();
		ISimpleCar car = carImpl.getSimpleCar();
		people.travel(car);
	}
}

class MotorImpl implements IGarage {
	@Override
	public ISimpleCar getSimpleCar() {
		return new Motor();
	}
}

class CarImpl implements IGarage {
	@Override
	public ISimpleCar getSimpleCar() {
		return new Car();
	}

}
