package 六大原则.依赖倒置;

public abstract class Employee {
	private String name;

	abstract void service();

	abstract void askHelp(Boss boss);

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
