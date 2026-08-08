package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.Department;
import ir.arcademy.mamoot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByPersonnelNumber(String personnelNumber); //search by personelnumber

    Optional<Employee> findByFirstName(String firstName);  //search by firstname

    List<Employee> findByDepartment(Department department);//search personel per department

    boolean existsByPersonnelNumber(String personnelNumber); //check for not diplicatr personelnumber

}
