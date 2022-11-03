package java023_jdbc.part02;

import java.util.ArrayList;
import java.util.List;

/*
 * MVC 패턴
 * Model : 데이터 관리 -DTO
 * View : 결과 화면에 출력
 * Controller : 클라이언트 요청과 응답처리, Model과 View 연결
 */
public class DepartmentsController {
	public DepartmentsController() {

	}
	
	public List<DepartmentsDTO> departmentsAllProcess() {
		DepartmentsDAO dao = DepartmentsDAO.getInstance();
//		List<DepartmentsDTO> aList = dao.listDepartments();
//		
//		for(DepartmentsDTO dto : aList) {
//			System.out.printf("%d %s %d %d\n", dto.getDepartment_id(), dto.getDepartment_name(),
//					dto.getManager_id(), dto.getLocation_id());
//		}
		return dao.listDepartments();
	}//end DepartmestsController()
	
	public List<DepartmentsDTO> departmentsSearchProcess(String data) {
		DepartmentsDAO dao = DepartmentsDAO.getInstance();
		return dao.searchDepartments(data);
	}
	
	
	
}//end class
