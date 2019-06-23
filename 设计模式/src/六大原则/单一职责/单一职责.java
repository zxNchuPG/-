package 六大原则.单一职责;
/**
 * 单一职责原则适用的范围有接口、方法、类。
 * 接口和方法必须保证单一职责，类就不必保证，只要符合业务就行
 * 
 * 案例：用户操作的接口,分别修改密码、修改用户信息
 * @author 时间
 *
 */
public class 单一职责 {
	public static void main(String arg[]) {
		User user = new User();
		Operate operate = new Operate();
		operate.updatePassWord(user, "123456");
		operate.updateUserInfo(user);
	}
}

class Operate implements Ioperate{
	
	@Override
	public boolean updatePassWord(User user,String passWord) {
		//只做密码修改
		System.out.println("修改 "+user.name+" 的密码 "+ user.passWord+"  为" + passWord);
		return false;
	}

	@Override
	public boolean updateUserInfo(User user) {
		//只做用户信息的修改
		System.out.println("修改 "+user.name+"用户信息");
		return false;
	}
	
}

class User{
	String name;
	String count;
	String passWord;
	
	User(){
		this.name = "Jason";
		this.count = "count";
		this.passWord = "passWord";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
