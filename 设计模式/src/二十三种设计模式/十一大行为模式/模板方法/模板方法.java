package 二十三种设计模式.十一大行为模式.模板方法;

/**
 * 定义一个操作中的算法的框架，而将一些步骤延迟到子类中。
 * 使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * 代码案例: aj 和 air 两个鞋厂
 * @author 时间
 *
 */
public class 模板方法{
	public static void main(String[] args) {
		Shose air = new Air();	
		air.install();
		
		Shose aj = new AJ();
		aj.install();
	}
}

class Air extends Shose{
	@Override
	public void installSole() {
		 System.out.println("air鞋底");
	}

	@Override
	public void installInsole() {
		 System.out.println("air鞋垫");
	}

	@Override
	public void installVamp() {
		 System.out.println("air鞋面");
	}

	@Override
	public void installShoelace() {
		 System.out.println("air鞋带");
	}
}

class AJ extends Shose{

	@Override
	public void installSole() {
		 System.out.println("aj鞋底");
	}

	@Override
	public void installInsole() {
		 System.out.println("aj鞋垫");
	}

	@Override
	public void installVamp() {
		 System.out.println("aj鞋面");
	}

	@Override
	public void installShoelace() {
		 System.out.println("aj鞋带");
	}
	
}

