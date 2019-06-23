package 二十三种设计模式.五大创建型模式.原型模式;

/**
 * 通过原型模式，绕过构造方法创建对象，利用内存直接拷贝对象，提高对象的创建性效率。
 * 
 * @author 时间
 *
 */
public class 原型模式 {
	public static void main(String[] args) {
		Book book = new Book("软件工程");
		System.out.println("复印" + book.getName() + " 第" + 1 + "册");
		for (int i = 2; i <= 5; i++) {
			Book booki = (Book) book.clone();
			System.out.println("复印" + book.getName() + " 第 " + i + "册");
		}
	}
}

class Book implements Cloneable {
	String name;

	public Book(String name) {
		this.name = name;
		System.out.println("实例化书籍");
	}

	@Override
	protected Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}