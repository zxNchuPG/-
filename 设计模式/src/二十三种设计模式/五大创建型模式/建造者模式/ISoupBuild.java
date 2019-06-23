package 二十三种设计模式.五大创建型模式.建造者模式;

/**
 * 煲汤建造厂
 * 
 * @author 时间
 *
 */
public interface ISoupBuild {
	void buildSoup();

	ISoup getSoup();
}

/**
 * 汤
 * 
 * @author 时间
 *
 */
interface ISoup {
	void addMeat();

	void addVegetables();

	void addIngredients();

	void waitMinute(int minute);
}
