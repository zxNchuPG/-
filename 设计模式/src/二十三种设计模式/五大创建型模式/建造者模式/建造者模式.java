package 二十三种设计模式.五大创建型模式.建造者模式;

/**
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * 
 * 案例：冬瓜汤、玉米排骨汤
 * 
 * @author 时间
 *
 */
public class 建造者模式 {
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.dongGuaSoup();
		System.out.println("==================================");
		builder.yuMiSoup();
	}
}

//煲汤者
class Builder {
	private DongGuaBuild dongGuaBuild = new DongGuaBuild();
	private YuMiBuild yuMiBuild = new YuMiBuild();

	void dongGuaSoup() {
		dongGuaBuild.buildSoup();
	}

	void yuMiSoup() {
		yuMiBuild.buildSoup();
	}
}

/**
 * 冬瓜汤的建造流程
 * 
 * @author 时间
 *
 */
class DongGuaBuild implements ISoupBuild {
	private DongGuaSoup dongGuaSoup = new DongGuaSoup();

	@Override
	public ISoup getSoup() {
		return dongGuaSoup;
	}

	@Override
	public void buildSoup() {
		dongGuaSoup.addMeat();
		dongGuaSoup.waitMinute(30);
		dongGuaSoup.addVegetables();
		dongGuaSoup.waitMinute(10);
		dongGuaSoup.addIngredients();
	}

}

/**
 * 玉米排骨汤的建造流程
 * 
 * @author 时间
 *
 */
class YuMiBuild implements ISoupBuild {
	private YuMiSoup yuMiSoup = new YuMiSoup();

	@Override
	public void buildSoup() {
		yuMiSoup.addMeat();
		yuMiSoup.addVegetables();
		yuMiSoup.waitMinute(10);
		yuMiSoup.addIngredients();
	}

	@Override
	public ISoup getSoup() {
		return yuMiSoup;
	}

}

class DongGuaSoup implements ISoup {
	@Override
	public void addMeat() {
		System.out.println("加排骨");
	}

	@Override
	public void addVegetables() {
		System.out.println("加冬瓜");
	}

	@Override
	public void addIngredients() {
		System.out.println("加调味品");
	}

	@Override
	public void waitMinute(int minute) {
		System.out.println("等待 " + minute + "分钟");
	}
}

/**
 * 玉米排骨汤建造流程
 * 
 * @author 时间
 *
 */
class YuMiSoup implements ISoup {
	@Override
	public void addMeat() {
		System.out.println("加排骨");
	}

	@Override
	public void addVegetables() {
		System.out.println("加玉米");
	}

	@Override
	public void addIngredients() {
		System.out.println("加调味品");
	}

	@Override
	public void waitMinute(int minute) {
		System.out.println("等待 " + minute + " 分钟");
	}
}