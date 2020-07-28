package 二十三种设计模式.十一大行为模式.命令模式;

/**
 * 经理
 * @author 时间
 * @version 创建时间：2020年7月28日 下午10:08:10 
 *
 */
public class Manager {
	private String name;
	private Command command;

	public Manager(String name) {
		this.name = name;
	}

	public void action(Requirement requirement) {
		this.command.execute(requirement);
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Command getCommand() {
		return command;
	}

}
