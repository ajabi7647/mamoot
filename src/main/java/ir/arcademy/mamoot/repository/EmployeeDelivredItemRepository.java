package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.EmployeeDeliveredItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface EmployeeDelivredItemRepository extends JpaRepository<EmployeeDeliveredItem , UUID>  {
    List<EmployeeDeliveredItem> findByReciver_Id(UUID receiverId);
}
