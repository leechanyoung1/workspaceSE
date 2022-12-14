package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddressTableSelectByPrimaryKeyMain {

	public static void main(String[] args) throws Exception {
		/********************데이터베이스 접속정보**********************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		/***************************************************************/
		String selectSQL="select no,name,phone,address from address where no=3";

		/*
		 1.Driver class loading
	     2.Connection 객체생성
		 3.Statement객체생성
		 4.SQL문전송(select)
		 5.SQL문전송(select)결과 결과집합(ResultSet)반환
		 6.연결객체해지(resource해지) close
		 */
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		/*
		 * 
		 */
		ResultSet rs =  stmt.executeQuery(selectSQL);
		if(rs.next()) {
			/* --------------------------------
			 * DB타입       | 자바타입
			 * --------------------------------
			 * null         | int,double(float)
			 * varchar2,char  String
			 * Date         | Date
			 * --------------------------------
			 * 
			 */
			
			int no =rs.getInt("no");
			String name =rs.getString("name");
			String phone =rs.getString("phone");
			String address=rs.getString("address");
			System.out.println(no+"\t"+name+"\t"+phone+"\t"+address);
		}else {
			System.out.println("조건에 만족하는 주소록 존재안함");
		}
		rs.close();
		stmt.close();
		con.close();
		
		
		
	}

}
