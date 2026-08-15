package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.InventoryGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface InventoryGroupRepository extends JpaRepository<InventoryGroupEntity, UUID> {

    Optional<InventoryGroupEntity> findByName(String name); //search per groupname

      boolean existsByName(String name);
}
