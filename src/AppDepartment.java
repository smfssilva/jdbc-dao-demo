import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class AppDepartment {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department department = departmentDao.findById(6);
        System.out.println(department);


        
    }
    
}
