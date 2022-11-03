package renewed_project_by_oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private static ProductDAO dao = new ProductDAO();
	
	private ProductDAO() {}
	
	public static ProductDAO getInstance() {
		return dao;
	}
	
	private Connection init() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		return DriverManager.getConnection(url, username, password);	
	}
	
	private void exit() throws SQLException {
		if(rs!=null)
			rs.close();
		
		if(stmt!=null)
			stmt.close();
		
		if(pstmt!=null)
			pstmt.close();
		
		if(conn!=null)
			conn.close();
	}
	
	public List<ProductDTO> checkProduct() {
		List<ProductDTO> aList = new ArrayList<ProductDTO>();
		try {
			conn = init();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			String sql = "SELECT * FROM product ORDER BY num";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				ProductDTO dto = new ProductDTO();
				dto.setNum(rs.getInt("num"));
				dto.setCategory(rs.getString("category"));
				dto.setName(rs.getString("name"));
				dto.setPrice(rs.getInt("price"));
				dto.setExpireDate(rs.getString("expiredate"));
				aList.add(dto);
			}
			
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return aList;		
	}//end checkProduct()
	
	public int registerProduct(ProductDTO dto) {
		int chk = -1;
		try {
			conn = init();
			conn.setAutoCommit(false);
			String sql = "INSERT INTO product(num,category,name,price,expiredate) ";
					sql += "VALUES(product_num_seq.nextval,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getCategory());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getPrice());
			pstmt.setString(4, dto.getExpireDate());
			
			chk = pstmt.executeUpdate();
			
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
		return chk;
	}//end registerProduct()
	
	public int deleteProduct(String name) {
		int chk = -1;
		try {
			conn = init();
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement("DELETE FROM product WHERE name = ?");
			pstmt.setString(1, name);
			
			chk = pstmt.executeUpdate();
			
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return chk;
	}
}//end class
