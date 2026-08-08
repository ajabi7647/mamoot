package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.ConsumableItem;
import ir.arcademy.mamoot.entity.InventoryGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ConsumableItemRepository extends JpaRepository<ConsumableItem , Long> {
    Optional<ConsumableItem> findByName(String name); //search per name materials
    boolean existsByName(String name);

    List<ConsumableItem> findByInventoryGroup(InventoryGroup inventoryGroup);
}
