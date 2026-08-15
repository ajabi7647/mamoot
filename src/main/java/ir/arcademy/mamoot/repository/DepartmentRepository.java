package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, UUID> {

    Optional<DepartmentEntity> findByName(String name); //search by name

    boolean existsByName(String Name);  // Checking for not duplicates department Name
    boolean existsByCode(String Code);// Checking for not duplicates department code
}
