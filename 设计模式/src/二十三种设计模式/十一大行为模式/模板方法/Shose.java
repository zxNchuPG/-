package 二十三种设计模式.十一大行为模式.模板方法;


public abstract class Shose {
	/**
	 * 组装鞋底
	 */
	public abstract void installSole();

	/**
	 * 组装鞋垫
	 */
	public abstract void installInsole();

	/**
	 * 组装鞋面
	 */
	public abstract void installVamp();

	/**
	 * 组装鞋带
	 */
	public abstract void installShoelace();

	public void install() {
		System.out.println("组装鞋步骤如下:");
		installSole();
		installInsole();
		installVamp();
		installShoelace();
		System.out.println("=======================");
	}
}
