package com.mycompany;

import com.mycompany.model.Employee;
import com.mycompany.repository.EmployeeRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@Rollback(false)
@SpringBootTest
class ApplicationTests {
//    @Autowired
//    private EmployeeRepository repo;

//    @Test
//    void testAddNew() {
//        Employee employee = new Employee();
//        employee.setEmail("abc@gmail.com");
//        employee.setFirstName("aaa");
//        employee.setLastName("bbb");
//        employee.setMobile("1234567890");
//        employee.setDob("01/01/2000");
//        employee.setAddress("3, ABC Street, XYZ City");
//        Employee savedUser = repo.save(employee);
//        Assertions.assertThat(savedUser).isNotNull();
//    }
//
//    @Test
//    void testUpdate(){
//        Integer userId = 1;
//        Optional<Employee> optionalUser = repo.findById(userId.longValue());
//        Employee employee= optionalUser.get();
//        employee.setLastName("ccc");
//        repo.save(employee);
//
//        Employee updateUser = repo.findById(Long.valueOf(userId)).get();
//       Assertions.assertThat(updateUser.getLastName().isEmpty());
//    }

}
