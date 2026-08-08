package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.InventoryGroup;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryGroupRepository extends JpaRepository<InventoryGroup, Long> {

    Optional<InventoryGroup> findByName(String name); //search per groupname

      boolean existsByName(String name);
}
