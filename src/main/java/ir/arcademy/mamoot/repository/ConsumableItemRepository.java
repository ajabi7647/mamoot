package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.ConsumableItemEntity;
import ir.arcademy.mamoot.entity.InventoryGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ConsumableItemRepository extends JpaRepository<ConsumableItemEntity, UUID> {
    Optional<ConsumableItemEntity> findByName(String name); //search per name materials
    boolean existsByName(String name);

    List<ConsumableItemEntity> findByInventoryGroup(InventoryGroupEntity inventoryGroup);
}
