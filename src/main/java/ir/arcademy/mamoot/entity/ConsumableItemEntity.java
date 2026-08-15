package ir.arcademy.mamoot.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
@Entity
@Table(name = "consumable_items")

public class ConsumableItemEntity extends BaseEntity{

    @Column(nullable = false, unique = true, length = 50)
    private String name;

    @Column(nullable = true, length = 300)
    private String description;

    @Column(nullable = false, length = 10)
    private  String unit;

    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn(name = "inventory_group_id", nullable = false)
    private InventoryGroupEntity inventoryGroup;
}
