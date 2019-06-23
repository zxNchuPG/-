package 六大原则.依赖倒置;

public abstract class Boss {
	private Employee employee;

	public Boss(Employee employee) {
		this.employee = employee;
	}

	public void setEmployee(Employee Employee) {
		this.employee = Employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	abstract void support();

	abstract void askHelp(Boss boss);
}
