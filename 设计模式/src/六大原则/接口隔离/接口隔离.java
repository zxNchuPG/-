package 六大原则.接口隔离;

/**
 * 类间的依赖关系应该建立在最小的接口上
 *  如果很多类实现了同一个接口，并且都只实现了接口的极少部分方法，
 * 这时候很有可能就是接口隔离性不好，就要去分析能不能把方法拆分到不同的接口。
 * 
 * 案例：娃娃生产工厂，流水线上不同工人只负责自己的职责
 * 
 * @author 时间
 *
 */
public class 接口隔离 {
	public static void main(String args[]) {
		WorkerA a = new WorkerA();
		WorkerB b = new WorkerB();
		WorkerC c = new WorkerC();
		WorkerD d = new WorkerD();
		a.boxing();
		b.dressing();
		c.hairing();
		d.taging();
	}
}

/**
 * 每个工人都实现各自的职责接口
 * 
 * @author 时间
 *
 */
class WorkerA implements IBox {
	@Override
	public void boxing() {
		System.out.println("A 负责装箱");
	}
}

class WorkerB implements IDress {
	@Override
	public void dressing() {
		System.out.println("B 负责穿衣");
	}
}

class WorkerC implements IHair {
	@Override
	public void hairing() {
		System.out.println("C 负责绑辫子");
	}
}

class WorkerD implements ITag {
	@Override
	public void taging() {
		System.out.println("D 负责打标签");
	}
}