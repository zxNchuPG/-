package 二十三种设计模式.十一大行为模式.命令模式;

/**
 * Encapsulate a request as an object,
 * thereby letting you parameterize clients with different requests,
 * queue or log requests,and support undoable operations.
  *  将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，
  *  对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能  
  *  案例：开发人员接受上级指派任务
  *  
  *  利用命令模式能够进行类的解耦，让调用者和接受者没有任何关系，
  *  也通过对行为的抽象，让新增其他行为变得清晰容易，也就是可扩展性大大增加
 * @author 时间
 * @version 创建时间：2020年7月28日 下午9:41:29 
 *
 */
public class 命令模式 {
	public static void main(String[] args) {
		Developer xiaoMing = new Developer("小明");
		Command developCommand = new DevelopCommand(xiaoMing);
		Command suspendCommand = new SuspendCommand(xiaoMing);
		Requirement requirement = new Requirement("新增黑名单");
		Manager technicalManager = new Manager("大明");
		technicalManager.setCommand(developCommand);
		technicalManager.action(requirement);
		System.out.println("开发了 2 天，需求变故，需要暂停。。。");
		technicalManager.setCommand(suspendCommand);
		technicalManager.action(requirement);
	}
}
