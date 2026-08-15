package ir.arcademy.mamoot.entity;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
@Entity
@Table(name = "asset_type")
public class AssetTypeEntity extends BaseEntity {

    @Column(nullable = true, length = 100)
    private boolean hasSerialNumber;

    @Column(nullable = true, length = 100)
    private String model;

    @Column(nullable = false, length = 100, unique = true)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inventory_group_id", nullable = false)
    private InventoryGroupEntity inventoryGroup;
}

