package in.raj.service;

import in.raj.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("empServ")
public interface IEmployeeService {
    public List<Employee> fetchEmployeesByDesgs(String desg1, String desg2, String desg3 )throws Exception;
}
