package UppgiftEtt;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("username: ");
		String username = input.nextLine();
		System.out.print("password: ");
		String password = input.nextLine();
		if (username.equals(username)) {
			if (password.equals("asd123")) {
				System.out.println("succeeessss...");
			} else {
				System.out.println("wrong password or username :(");
			}
		}
	}
}