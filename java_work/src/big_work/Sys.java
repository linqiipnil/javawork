package big_work;

import java.util.Scanner;

public class Sys {

	public static void main(String[] args) {
		// ��������
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
		// ��ӡ��ӭ ˵��
		System.out.println("welcome to this system");
		// �����û���
		// �����û����Ƿ����
		while (true) {
			System.out.printf("Please input your username such as liming: ");
			String username = input.nextLine();
			// ȷ�ϴ��� isexistence
			// ���������û��������д��ڵ��û�
			// ������ ��һ��
			// �������� �ص���һ��
			num = User.isExistence(allUsers, username);
			if (num == -1) {
				// ����ظ�
				System.out.println("No this name ");
			} else {
				break;
			}
		}
		while (true) {
			System.out.printf("Please input your password such as 123321: ");
			String password = input.nextLine();
			// ȷ��������ȷ isPassWord
			// ��������
			// ��ȡ���û����±�
			// �ж� ����
			// ����ȷ ��һ��
			// ������ ������������
			isNext = User.isPassWord(allUsers, password);
			if (isNext) {
				System.out.println("Login successfully");
				break;
			} else {
				System.out.println("Login failed");
			}
		}
		// ��½�ɹ�,ȷ��Ȩ��
		// ���ݲ�ͬ��Ȩ�� ��ʾ��ͬ�Ľ���
		if (allUsers[num].Power) {
			// ����Ա
			// ��ӡ���д��ڵ���Ա��Ϣ
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
					// �˳�ϵͳ ��������
					break;
				} else {
					// ������� ���� ����ѡ��
					System.out.println("ERROR INPUT");
				}
			}
			// ��ʾ���ܽ���
			// �����Ա
			// ɾ����Ա
			// �༭��Ա��Ϣ
			// �鿴��Ա
			// �˳�ϵͳ
		} else {
			// ��ͨ ��ӡ�Լ�����Ա��Ϣ
			User.showSelf(allUsers, num);
			// �༭�Լ�����Ա��Ϣ
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
			// �˳�ϵͳ
		}
	}
}
