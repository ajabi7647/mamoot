package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.Asset;
import ir.arcademy.mamoot.entity.AssetAssignment;
import ir.arcademy.mamoot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssetAssignmentRepository extends JpaRepository<AssetAssignment, Long> {

    List<AssetAssignment> findByEmployee(Employee employee);
    List<AssetAssignment> findByAsset(Asset asset);
}
