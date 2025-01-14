package in.raj.dao;

import in.raj.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("empDao")
public interface EmployeeDao {
    public  List<Employee>  getEmpsByDesgs(String desg1,String desg2,String desg3)throws  Exception;
}
