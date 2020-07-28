package 二十三种设计模式.十一大行为模式.命令模式;

/**
 * 中断任务
 * @author 时间
 * @version 创建时间：2020年7月28日 下午10:06:50 
 *
 */
public class SuspendCommand extends Command {
	public SuspendCommand(Developer developer) {
		super(developer);
	}

	@Override
	public void execute(Requirement requirement) {
		this.developer.suspend(requirement);
	}
}
