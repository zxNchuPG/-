package 二十三种设计模式.十一大行为模式.命令模式;

/**
  * 抽象任务
 * @author 时间
 * @version 创建时间：2020年7月28日 下午9:46:17 
 *
 */
public abstract class Command {
	protected Developer developer;

	public Command(Developer developer) {
		this.developer = developer;
	}

	public abstract void execute(Requirement requirement);
}
