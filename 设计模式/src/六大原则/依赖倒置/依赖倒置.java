package 六大原则.依赖倒置;

/**
 * 高层模块不应该依赖低层模块，两者都应该依赖其抽象
 * 
 * 案例：两个老板,为节省人工费,共用员工
 * 
 * @author 时间
 *
 */
public class 依赖倒置 {
	public static void main(String args[]) {
		Employee employeeA = new EmployeeImpl("A 员工");
		Employee employeeB = new EmployeeImpl("B 员工");
		Boss bossA = new BossImpl(employeeA);
		Boss bossB = new BossImpl(employeeB);

		// A老板向B老板请求支援,向B老板借用员工
		bossA.askHelp(bossB);
		// B员工向A老板请求支援,借用A老板的员工
		employeeB.askHelp(bossA);

		//假设开除B老板的B员工，招了一个C员工
		Employee employeeC = new EmployeeImpl("C 员工");
		bossA.setEmployee(employeeC);
		employeeB.askHelp(bossA);
	}
}

class BossImpl extends Boss {
	public BossImpl(Employee employee) {
		super(employee);
	}

	@Override
	void support() {
		this.getEmployee().service();
	}

	@Override
	void askHelp(Boss boss) {
		boss.support();
	}
}

class EmployeeImpl extends Employee {
	public EmployeeImpl(String name) {
		this.setName(name);
	}

	@Override
	void service() {
		System.out.println(this.getName() + "提供服务");
	}

	@Override
	void askHelp(Boss boss) {
		boss.support();
	}
}
