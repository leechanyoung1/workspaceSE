package dao.guest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Dao(Data[DataBase] Access Object)객체(클래스)
 *   - guest테이블에 CRUD(Create,Read,Update,Delet)작업을 하는 
 *     단위메쏘드를 가지고있는 객체(클래스)
 */
public class GuestDao {
	public GuestDao() {
	}
	
		public int insert(Guest newGuest) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper07";
		String password="jdeveloper07";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		
		String insertSql = "insert into Guest(guest_no,guest_name,guest_email,guest_homepage,guest_title,guest_content) values(?,?,?,?,?,?)"; 
		PreparedStatement pstmt1 = con.prepareStatement(insertSql);
		int guest_no=newGuest.getGuest_no();
		String guest_name=newGuest.getGuest_name();
		String guest_email=newGuest.getGuest_email();
		String guest_homepage =newGuest.getGuest_homepage();
		String guest_title = newGuest.getGuest_title();
		String guest_content=newGuest.getGuest_content();
		
		pstmt1.setInt(1, guest_no);
		pstmt1.setString(2, guest_name);
		pstmt1.setString(3, guest_email);
		pstmt1.setString(4, guest_homepage);
		pstmt1.setString(5, guest_title);
		pstmt1.setString(6, guest_content);
		
		int rowCount = pstmt1.executeUpdate(); 
		
		
		return rowCount;
		}
		
		
		
	}
	

