package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.AssetTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AssetTypeRepository extends JpaRepository<AssetTypeEntity, UUID> {

    Optional<AssetTypeEntity> findByTitle(String title); //search per title materials

   // Optional<AssetTypeEntity> findByModel(String model); //search per model materials

    boolean existsByTitle(String title);   //check for not duplicate title materials
}
