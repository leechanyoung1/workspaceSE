package test;

import com.itwill.shop.user.User;
import com.itwill.shop.user.UserDao;

public class UserDaoTestMain {

	public static void main(String[] args) throws Exception {
		UserDao userDao = new UserDao();
		int result =userDao.insert(new User("bbb", "bbb", "bbbb", "bbbbb"));
		System.out.println("insert:"+result);
	}

}
