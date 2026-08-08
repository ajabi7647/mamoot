package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.Department;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.naming.Name;
import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Optional<Department> findByName(String name); //search by name

    boolean existsByName(String Name);  // Checking for not duplicates department Name
    boolean existsByCode(String Code);// Checking for not duplicates department code
}
