package ir.arcademy.mamoot.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
@Entity
@Table(name = "transfer_vouchers_items")
public class TransferVoucherItemEntity extends BaseEntity{

    @Column(nullable = false)
    private Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "voucher_id", nullable = false)
    private TransferVoucherEntity voucher;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "consumable_item_id")
    private ConsumableItemEntity consumableItem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asset_type_id")
    private AssetTypeEntity assetType;
}
