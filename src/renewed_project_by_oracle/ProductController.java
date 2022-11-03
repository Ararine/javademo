package renewed_project_by_oracle;

import java.util.List;

public class ProductController {
	private ProductDAO dao;
	
	public ProductController() {
		dao = ProductDAO.getInstance();
	}
	
	public List<ProductDTO> checkProcess() {
		return dao.checkProduct();
	}
	
	public int registerProcess(ProductDTO dto) {
		return dao.registerProduct(dto);
	}
	
	public int deleteProcess(String name) {
		return dao.deleteProduct(name);
	}
}
