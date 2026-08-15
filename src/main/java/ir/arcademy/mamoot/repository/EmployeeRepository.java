package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.DepartmentEntity;
import ir.arcademy.mamoot.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, UUID> {

    Optional<EmployeeEntity> findByPersonnelNumber(String personnelNumber); //search by personelnumber

    Optional<EmployeeEntity> findByFirstName(String firstName);  //search by firstname

    List<EmployeeEntity> findByDepartment(DepartmentEntity department);//search personel per department

    boolean existsByPersonnelNumber(String personnelNumber); //check for not diplicatr personelnumber

}
