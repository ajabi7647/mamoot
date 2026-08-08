package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.AssetType;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AssetTypeRepository extends JpaRepository<AssetType, Long> {

    Optional<AssetType> findByTitle(String title); //search per title materials

   // Optional<AssetType> findByModel(String model); //search per model materials

    boolean existsByTitle(String title);   //check for not duplicate title materials
}
