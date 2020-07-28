package 二十三种设计模式.十一大行为模式.命令模式;

/**
 * 开发人员
 * @author 时间
 * @version 创建时间：2020年7月28日 下午9:47:24 
 *
 */
public class Developer {
	private String name;

	public Developer(String name) {
		this.name = name;
	}

	public void develop(Requirement requirement) {
		System.out.println(this.name + " 开始开发需求：" + requirement.getName());
	}

	public void suspend(Requirement requirement) {
		System.out.println(this.name + " 停止开发需求：" + requirement.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
