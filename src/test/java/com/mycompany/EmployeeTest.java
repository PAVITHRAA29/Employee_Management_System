package com.mycompany;


import com.mycompany.model.Employee;
import com.mycompany.repository.EmployeeRepository;
import com.mycompany.service.EmployeeServiceImpl;
import org.aspectj.lang.annotation.Before;
//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@SpringBootTest
class EmployeeTest {

    @Mock
    private EmployeeRepository repo;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddNew() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setEmail("abc@gmail.com");
        employee.setFirstName("aaa");
        employee.setLastName("bbb");
        employee.setMobile("1234567890");
        employee.setDob("01/01/2000");
        employee.setAddress("3, ABC Street, XYZ City");

        when(repo.findById(1L)).thenReturn(Optional.of(employee));

        Employee savedUser = employeeService.getEmployeeById(1L);
//        Assertions.assertThat(savedUser).isNotNull();
        assertEquals(employee,savedUser);

    }

    @Test
    void testGetEmployeeNull(){

        when(repo.findById(1L)).thenReturn(Optional.empty());
        Assertions.assertThrows(RuntimeException.class,()->employeeService.getEmployeeById(1L));

    }

    @Test
    void testSaveEmployee() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setEmail("abc@gmail.com");
        employee.setFirstName("aaa");
        employee.setLastName("bbb");
        employee.setMobile("1234567890");
        employee.setDob("01/01/2000");
        employee.setAddress("3, ABC Street, XYZ City");

        employeeService.saveEmployee(employee);

        verify(repo,times(1)).save(employee);

    }

    @Test
    void testDeleteEmployeeById_Success() {
        doNothing().when(repo).deleteById(1L);
        employeeService.deleteEmployeeById(1L);
        verify(repo, times(1)).deleteById(1L);

    }

    @Test
    void testGetAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee();
        employee1.setId(1L);
        employee1.setFirstName("aaa");
        employee1.setLastName("bbb");

        Employee employee2 = new Employee();
        employee2.setId(2L);
        employee2.setFirstName("ccc");
        employee2.setLastName("eee");
        employees.add(employee1);
        employees.add(employee2);
        when(repo.findAll(Sort.by("id").ascending())).thenReturn(employees);
        List<Employee> result = employeeService.getAllEmployees();
        assertEquals(2, result.size());
        assertEquals("aaa", result.get(0).getFirstName());
        assertEquals("bbb", result.get(0).getLastName());
        assertEquals("ccc", result.get(1).getFirstName());
        assertEquals("eee", result.get(1).getLastName());

    }

}
