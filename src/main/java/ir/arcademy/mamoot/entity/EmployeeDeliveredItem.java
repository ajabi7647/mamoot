package ir.arcademy.mamoot.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@Setter

@Entity
@Table(name = "employee_delivered_item")
public class EmployeeDeliveredItem extends BaseEntity {
    @Column(nullable = true)
    Integer quantity;
    @Column(nullable = false, length = 50)
    private String assetCode;
    @Column(nullable = true, length = 50)
    String serial;
    @Column(nullable = false, length = 20)
    String unit;
    @Column(nullable = true, length = 100)
    String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receiver_id", nullable = false)
    private EmployeeEntity receiver;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deliverer_id", nullable = false)
    private EmployeeEntity deliverer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asset_type_id")
    private AssetTypeEntity assetType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "consumable_item_id")
    private ConsumableItemEntity consumableItem;

}
