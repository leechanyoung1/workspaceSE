package dao.address.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class AddressDao1 {
	public AddressDao1() {
	}
	public void insert () throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		String insertSQL="insert into address values(address_no_seq.nextval,'너구리','123-4568','경기도 시흥시')";
		
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(insertSQL);
		System.out.println(">>insert row count:"+rowCount+"행 insert");
		stmt.close();
		con.close();
		
	}
	
	public void update() throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		String selectSql ="update address set name='제임스',phone='333-3333',address='제주시 애월읍' where no=1";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(selectSql);
		System.out.println(">>"+rowCount+"행 update");
		
		stmt.close();
		con.close();
	}
	
	public void delete() throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		String deleteSQL="delete address where no=11";
		
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		int rowCount =stmt.executeUpdate(deleteSQL);
		System.out.println(">>"+rowCount+"행 delete");
		stmt.close();
		con.close();	
	}
	
	public void findByPrimaryKey() throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		String selectSQL="select no,name,phone,address from address where no=3";

		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		ResultSet rs =  stmt.executeQuery(selectSQL);
		if(rs.next()) {
			
			
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
	
	public void findAll() throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		String selectSQL="select no,name,phone,address from address";

		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
	
		ResultSet rs =  stmt.executeQuery(selectSQL);
		if(rs.next()) {
			
			do{
				int no =rs.getInt("no");
				String name =rs.getString("name");
				String phone =rs.getString("phone");
				String address=rs.getString("address");
				System.out.println(no+"\t"+name+"\t"+phone+"\t"+address);
			}while(rs.next());
		}else {
			System.out.println("조건에 만족하는 주소록 존재안함");
		}
		rs.close();
		stmt.close();
		con.close();
	}
}
