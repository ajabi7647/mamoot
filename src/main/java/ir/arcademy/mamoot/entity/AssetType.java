package ir.arcademy.mamoot.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.lang.model.type.NullType;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
@Entity
@Table(name = "asset_types")
public class AssetType extends BaseEntity {

    @Column(nullable = false, length = 20)
    private String model;
    @Column(length = 100)
    private boolean hasSerialNumber;
    @Column(length = 100)
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inventory_group_id", nullable = false)
    private InventoryGroup inventoryGroup;
}
