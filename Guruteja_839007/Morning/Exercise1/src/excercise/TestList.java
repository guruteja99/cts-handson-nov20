package excercise;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User(1,"Guruteja","qwertyuiop"));
		users.add(new User(1,"Teja","qwertyuiop"));
		users.add(new User(1,"Kishore","qwertyuiop"));
		users.add(new User(1,"Joe","qwertyuiop"));
		users.add(new User(1,"JohnyD","qwertyuiop"));
		for (User user : users) {
			if(user.getName().length()>5)
				System.out.println(user.getName());
		}
	}

}
