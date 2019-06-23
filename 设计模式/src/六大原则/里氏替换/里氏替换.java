package 六大原则.里氏替换;

/**
 * 在使用父类的地方、都能够替换成子类、并且效果是一样的
 * 案例：父亲会做红烧排骨,那么儿子也要会做红烧排骨
 * 儿子想做红烧糖醋排骨,那么需要重新定义一个实现类
 * 
 * 缺点：继承是侵入性的。只要继承，就必须拥有父类的所有属性和方法；
*  降低代码的灵活性。子类必须拥有父类的属性和方法，让子类自由的世界中多了些约束
 * @author 时间
 *
 */
public class 里氏替换 {
	public static void main(String args[]) {
		Father father = new Father();
		father.cook();

		Son son = new Son();
		//子类替换父类
		son.cook();
		son.sonCook();
	}
}

class Father{
	public void cook(){
		System.out.println("father:"+"红烧排骨");
	}
}

class Son extends Father{
	public void sonCook() {
		System.out.println("son:"+"红烧糖醋排骨");
	}
}