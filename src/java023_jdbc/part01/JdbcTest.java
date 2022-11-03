package java023_jdbc.part01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
[JDBC 사용법]

		 JDBC (Java DataBase Connectivity)
		 
		1 JDBC는 대부분이 인터페이스로 되어 있으며 이 인터페이스를 구현한 클래스 파일들의 
		    묶음을 드라이버(driver)라고 한다.
		2 자바에서 서로 다른 데이터베이스를 접속하기 위한 일관된 방식을 위해서 인터페이스로 만들고 
		   각 벤더에서는  실제 접속방법을 구현한 클래스 파일을 제공하는 형태이다
		3 따라서 벤더에서 제공한 데이터베이스의 드라이버를 반드시 사용해야  한다.


		1. 데이터베이스와 연결하는 드라이버 파일을 찾아서 로딩한다.
		   ​Class.forName("드라이버 이름")
		2. 연결을 관리하는 Connection 객체 생성
		​   Connection conn = DriverManager.getConnection("URL", "아이디","비밀번호" );

		3. sql 구문을 처리할 Statement, PreparedStatement 객체 생성
		   ​Statement stmt = conn.createStatement();
		   PreparedStatement pstmt=conn.prepareStatement("SELECT * FROM mem order by num");
		4. 구문 실행 - select 구문 인 경우 ResultSet 객체를 통한 sql 결과 처리
		    DML :  ​int cnt = stmt.executeUpdate("INSERT INTO Person(num, name, age, loc) VALUES(mem_num_seq.nextval,'김훈',40,'부산')");
		   SELECT문 : ResultSet rs = stmt.executeQuery("SELECT * FROM mem order by num");
		   
		   ResultSet rs=pstmt.executeQuery();​​

		5. 접속 종료
		   stmt.close();
		   pstmt.close();   
		   conn.close();​
		​

		​[DB별 드라이버 사용법] 
		[Oracle]

		-드라이버 이름: oracle.jdbc.OracleDriver

		-데이터베이스 이름: jdbc:oracle:thin:@ip:포트번호:데이터베이스이름

		-ip는 로컬 컴퓨터이면: 127.0.0.1

		-포트번호 기본:  1521

		-데이터베이스 이름은 기본:  xe

		 [MySql]

		-드라이버 이름: com.mysql.jdbc.Driver

		-데이터베이스 이름: jdbc:mysql://ip:포트번호/데이터베이스이름

		-ip는 로컬 컴퓨터이면: 127.0.0.1

		-포트번호 기본: 3306


		[MsSql]

		-드라이버 이름: com.microsoft.jdbc.sqlserver.SQLServerDriver

		-데이터베이스 이름: jdbc:microsoft:sqlserver://ip:포트번호/데이터베이스이름

		-ip는 로컬 컴퓨터이면: 127.0.0.1

		-포트번호 기본: 1433

*/

public class JdbcTest {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public JdbcTest() {

	}
	
	public void process() {
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. 서버 연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";
			conn = DriverManager.getConnection(url, username, password);
			
//			System.out.println(conn);
			
			conn.setAutoCommit(false); // 자동 오토 커밋
			
			
			
			//3. 쿼리문을 실행하기 위한 Statement 타입의 객체를 가져옴
			stmt = conn.createStatement();
			
			//4. 쿼리문을 실행 : SELECT - executeQuery( ), INSERT, UPDATE, DELETE - executeUpdate( )
			String sql = "SELECT * FROM departments ORDER BY department_id";
			rs = stmt.executeQuery(sql); //결과를 rs가 받음
//			System.out.println(rs);
			
			//5. 쿼리문의 결과 출력
			while(rs.next()) {
				int departmentId = rs.getInt("department_id");
				String departName = rs.getString("department_name");
				int managerId = rs.getInt("manager_id");
				int locationId = rs.getInt("location_id");
				System.out.printf("%d %s %d %d\n", 
						departmentId, departName, managerId, locationId);			
			}
			
			conn.commit();
			
		} catch (ClassNotFoundException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			//6 JDBC 연결 종
			if(rs!=null)
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}//end class
