package 二十三种设计模式.十一大行为模式.命令模式;

/**
 * 开发命令
 * @author 时间
 * @version 创建时间：2020年7月28日 下午10:04:59 
 *
 */
public class DevelopCommand extends Command {

	public DevelopCommand(Developer developer) {
		super(developer);
	}

	@Override
	public void execute(Requirement requirement) {
		this.developer.develop(requirement);
	}

}
