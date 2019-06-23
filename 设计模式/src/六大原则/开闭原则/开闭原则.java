package 六大原则.开闭原则;

/**
 * 对于扩展是开放的，但是对于修改是封闭的
 * 案例：不同等级的会员购买同一件商品支付金额不同
 * 当需要添加一个新等级会员时，只需要实现接口，创建一个新的对象，而不需要通过if else来实现
 * @author 时间
 *
 */
public class 开闭原则 {
	public static void main(String[] args) {
		OneLv one = new OneLv("等级一");
		TwoLv two = new TwoLv("等级二");
		Supermarket supermarket = new Supermarket();
		supermarket.sell(one);
		supermarket.sell(two);
	}
}

class OneLv implements People {
	String name;

	public OneLv(String name) {
		this.name = name;
	}

	@Override
	public double pay(Goods goods) {
		return goods.getPrice() * 0.9;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class TwoLv implements People {
	String name;

	public TwoLv(String name) {
		this.name = name;
	}

	@Override
	public double pay(Goods goods) {
		return goods.getPrice() * 0.85;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Supermarket {
	private Goods goods = new Goods("泡面", 4);

	public void sell(People people) {
		double price = people.pay(goods);
		System.out.println(people.getName() + "购买" + goods.getName() + " 支付 " + price);
	}
}

//商品
class Goods {
	private String name;
	private double price;

	public Goods(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}