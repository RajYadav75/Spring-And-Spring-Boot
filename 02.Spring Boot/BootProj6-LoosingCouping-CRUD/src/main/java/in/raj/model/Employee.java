package in.raj.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component("emp")
@Data
public class Employee {
    private Integer empno;
    private String  ename;
    private   String  desg;
    private  Double  salary;
    private   Integer  deptno;

}
