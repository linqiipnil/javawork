package big_work;

import java.util.Scanner;

public class Sys {

	public static void main(String[] args) {
		// 引入数组
		Userbasic[] allUsers = new Userbasic[100];

		for (int i = 0; i < allUsers.length; i++) {
			allUsers[i] = new Userbasic();
			allUsers[i].setNumber(i);
			allUsers[i].setExistence(false);
		}

		allUsers[0].setName("admin");
		allUsers[0].setPassWord("admin");
		allUsers[0].setPhoneNumber("");
		allUsers[0].setInformation("");
		allUsers[0].setAchievement("");
		allUsers[0].setPower(true);
		allUsers[0].setExistence(true);

		allUsers[1].setName("fengtianrui");
		allUsers[1].setPassWord("123456");
		allUsers[1].setPhoneNumber("17896587895");
		allUsers[1].setInformation("");
		allUsers[1].setAchievement("");
		allUsers[1].setPower(false);
		allUsers[1].setExistence(true);
		
		Scanner input = new Scanner(System.in);
		int num = -1;
		boolean isNext = false;
		// 打印欢迎 说明
		System.out.println("welcome to this system");
		// 输入用户名
		// 检验用户名是否存在
		while (true) {
			System.out.printf("Please input your username such as liming: ");
			String username = input.nextLine();
			// 确认存在 isexistence
			// 遍历整个用户数组其中存在的用户
			// 若存在 下一步
			// 若不存在 回到第一步
			num = User.isExistence(allUsers, username);
			if (num == -1) {
				// 错误回复
				System.out.println("No this name ");
			} else {
				break;
			}
		}
		while (true) {
			System.out.printf("Please input your password such as 123321: ");
			String password = input.nextLine();
			// 确认密码正确 isPassWord
			// 输入密码
			// 获取该用户的下标
			// 判断 密码
			// 若正确 下一步
			// 若错误 返回输入密码
			isNext = User.isPassWord(allUsers, password);
			if (isNext) {
				System.out.println("Login successfully");
				break;
			} else {
				System.out.println("Login failed");
			}
		}
		// 登陆成功,确认权限
		// 根据不同的权限 显示不同的界面
		if (allUsers[num].Power) {
			// 管理员
			// 打印所有存在的人员信息
			User.showAll(allUsers);
			while (true) {
				System.out.println("Please select a function ");
				System.out.println("1.Add personnel ");
				System.out.println("2.Delete Personnel  ");
				System.out.println("3.Edit personnel   ");
				System.out.println("4.Show all personnel");
				System.out.println("5.Exit system ");
				String gongneng = input.nextLine();
				if (gongneng.equals("1")) {
					User.addPersonnel(allUsers);
				} else if (gongneng.equals("2")) {
					User.deletePersonnel(allUsers);
				} else if (gongneng.equals("3")) {
					User.editPersonnel(allUsers);
				} else if (gongneng.equals("4")) {
					User.showAll(allUsers);
				} else if (gongneng.equals("5")) {
					// 退出系统 结束程序
					break;
				} else {
					// 输入错误 返回 功能选择
					System.out.println("ERROR INPUT");
				}
			}
			// 显示功能界面
			// 添加人员
			// 删除人员
			// 编辑人员信息
			// 查看人员
			// 退出系统
		} else {
			// 普通 打印自己的人员信息
			User.showSelf(allUsers, num);
			// 编辑自己的人员信息
			while (true) {
				System.out.println("Please select a function ");
				System.out.println("1.Edit personnel");
				System.out.println("2.Show You ");
				System.out.println("3.Exit system ");
				String gongneng = input.nextLine();
				if (gongneng.equals("1")) {
					User.editSelf(allUsers, num);
				} else if (gongneng.equals("2")) {
					User.showSelf(allUsers, num);
				} else if (gongneng.equals("3")) {
					break;
				} else {
					System.out.println("ERROR INPUT");
				}
			}
			// 退出系统
		}
	}
}
