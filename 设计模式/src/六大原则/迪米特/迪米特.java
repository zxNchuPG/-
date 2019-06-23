package 六大原则.迪米特;

/**
 * 价值观：妈妈说不和陌生人说话 
 * 案例：用手机看电子书 
 * 手机和app 有关系、app和电子书有关系，手机与电子书不存在直接联系
 * 
 * @author 时间
 *
 */
public class 迪米特 {
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.readBook();
	}
}

class Phone {
	private App app = new App("小红书");

	public void readBook() {
		System.out.println("手机打开"+app.getName()+"App准备看书");
		app.read();
	}
}

class App {
	private String name ;
	
	private Book book = new Book("软件工程");

	public void read() {
		System.out.println("app打开" + book.getName()+"电子书");
	}

	public App(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Book {
	private String name;

	public Book(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}