package big_work;

import java.util.Scanner;

public class User {

	public static int isExistence(Userbasic[] all, String input) {
		for (int i = 0; i < all.length; i++) {
			if (input.equals(all[i].Name)) {
				return all[i].Number;
			}
		}
		return -1;
	}

	public static boolean isPassWord(Userbasic[] all, String input) {
		for (int i = 0; i < all.length; i++) {
			if (input.equals(all[i].PassWord)) {
				return true;
			}
		}
		return false;
	}

	public static void addPersonnel(Userbasic[] all) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		for (int j = 0; j < all.length; j++) {
			if (all[j].Existence) {
				i++;
			} else {
				break;
			}
		}

		System.out.println("Please enter the name of the person you want to add Less than or equal to 10 characters");
		String name = input.nextLine();
		all[i].setName(name);

		System.out.println("Please enter the password of the person you want to add Less than or equal to 10 characters");
		String password = input.nextLine();
		all[i].setPassWord(password);

		System.out.println("Please enter the phonenumber of the person you want to add Less than or equal to 11 characters");
		String phonenumber = input.nextLine();
		all[i].setPhoneNumber(phonenumber);

		System.out.println("Please enter the information of the person you want to add Less than or equal to 12 characters");
		String information = input.nextLine();
		all[i].setInformation(information);

		System.out.println("Please enter the achievement of the person you want to add Less than or equal to 13 characters");
		String achievement = input.nextLine();
		all[i].setAchievement(achievement);

		System.out.println("Please enter the power of the person you want to add Only enter admin to set as Administrator");
		String power = input.nextLine();
		if (power.equals("admin")) {
			all[i].setPower(true);
		} else {
			all[i].setPower(false);
		}

		all[i].setExistence(true);

	}

	public static void deletePersonnel(Userbasic[] all) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of the person you want to delete ");
		int i = input.nextInt();
		all[i].clearOne();

	}

	public static void editPersonnel(Userbasic[] all) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of the person you want to edit ");
		int i = input.nextInt();
		System.out.println("Select the object you want to edit");
		System.out.println("1.name 2.password 3.phonenumber 4.information 5.achievement 6.power ");
		String j = input.next();
		j += input.nextLine();
		if (j.equals("1")) {
			System.out.println("Please enter the name of the person you want to edit Less than or equal to 10 characters");
			String name = input.nextLine();
			all[i].setName(name);
		} else if (j.equals("2")) {
			System.out.println("Please enter the password of the person you want to edit Less than or equal to 10 characters");
			String password = input.nextLine();
			all[i].setPassWord(password);
		} else if (j.equals("3")) {
			System.out.println("Please enter the phonenumber of the person you want to edit Less than or equal to 11 characters");
			String phonenumber = input.nextLine();
			all[i].setPhoneNumber(phonenumber);
		} else if (j.equals("4")) {
			System.out.println("Please enter the information of the person you want to edit Less than or equal to 12 characters");
			String information = input.nextLine();
			all[i].setInformation(information);
		} else if (j.equals("5")) {
			System.out.println("Please enter the achievement of the person you want to edit Less than or equal to 13 characters");
			String achievement = input.nextLine();
			all[i].setAchievement(achievement);
		} else if (j.equals("6")) {
			System.out.println("Please enter the power of the person you want to edit Only enter admin to set as Administrator");
			String power = input.nextLine();
			if (power.equals("admin")) {
				all[i].setPower(true);
			} else {
				all[i].setPower(false);
			}
		} else {
			System.out.println("ERROR INPUT");
		}
	}

	public static void editSelf(Userbasic[] all, int i) {
		Scanner input = new Scanner(System.in);
		System.out.println("Select the object you want to edit");
		System.out.println("1.password 2.phonenumber 3.information");
		String j = input.nextLine();
		if (j.equals("1")) {
			System.out.println("Please enter the password of the person you want to edit Less than or equal to 10 characters");
			String password = input.nextLine();
			all[i].setPassWord(password);
		} else if (j.equals("2")) {
			System.out.println("Please enter the phonenumber of the person you want to edit Less than or equal to 11 characters");
			String phonenumber = input.nextLine();
			all[i].setPhoneNumber(phonenumber);
		} else if (j.equals("3")) {
			System.out.println("Please enter the information of the person you want to edit Less than or equal to 12 characters");
			String information = input.nextLine();
			all[i].setInformation(information);
		} else {
			// 返回 选择界面
			System.out.println("ERROR INPUT");
		}
	}

	public static void showAll(Userbasic[] allUsers) {
		System.out.println("number\tusername  \tpassword  \tphonenumber\tinformation \tachievement  \tpower\texist");
		for (int i = 0; i < allUsers.length; i++) {
			if (allUsers[i].Existence) {
				String j, h;
				if (allUsers[i].Power) {
					j = "true";
				} else {
					j = "false";
				}

				if (allUsers[i].Existence) {
					h = "true";
				} else {
					h = "false";
				}
				System.out.printf("%-6s\t%-10s\t%-10s\t%-11s\t%-12s\t%-13s\t%-5s\t%-5s\n", allUsers[i].Number,
						allUsers[i].Name, allUsers[i].PassWord, allUsers[i].PhoneNumber, allUsers[i].Information,
						allUsers[i].Achievement, j, h);
			}
		}

	}

	public static void showSelf(Userbasic[] allUsers, int i) {
		System.out.println("number\tusername  \tphonenumber\tinformation \tachievement");
		System.out.printf("%-6s\t%-10s\t%-11s\t%-12s\t%-13s\n", allUsers[i].Number, allUsers[i].Name,
				allUsers[i].PhoneNumber, allUsers[i].Information, allUsers[i].Achievement);

	}

}

class Userbasic {
	public String Name;
	public String PassWord;
	public String PhoneNumber;
	public String Information;
	public String Achievement;
	public boolean Power;
	public int Number;
	public boolean Existence;

	public Userbasic() {
	}

	public void setName(String name) {
		this.Name = name;
	}

	public void setPassWord(String passWord) {
		this.PassWord = passWord;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}

	public void setInformation(String information) {
		this.Information = information;
	}

	public void setAchievement(String achievement) {
		this.Achievement = achievement;
	}

	public void setPower(boolean power) {
		this.Power = power;
	}

	public void setNumber(int number) {
		this.Number = number;
	}

	public void setExistence(boolean existence) {
		this.Existence = existence;
	}

	public void clearOne() {
		this.Name = "";
		this.PassWord = "";
		this.PhoneNumber = "";
		this.Information = "";
		this.Achievement = "";
		this.Power = false;
		this.Existence = false;
	}
}
