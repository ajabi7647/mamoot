package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.AssetEntity;
import ir.arcademy.mamoot.entity.AssetAssignmentEntity;
import ir.arcademy.mamoot.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AssetAssignmentRepository extends JpaRepository<AssetAssignmentEntity, UUID> {

    List<AssetAssignmentEntity> findByEmployee(EmployeeEntity employee);
    List<AssetAssignmentEntity> findByAsset(AssetEntity asset);
}
