package ir.arcademy.mamoot.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
@Entity
@Table(name = "transfer_vouchers")
public class TransferVoucherItem extends BaseEntity{
    @Column(nullable = false)
    private String quantity;
    @ManyToOne
    @JoinColumn(name = "voucher_id", nullable = false)
    private TransferVoucher voucher;
    @ManyToOne
    @JoinColumn(name = "consumable_item_id")
    private ConsumableItem consumableItem;
    @ManyToOne
    @JoinColumn(name = "asset_type_id")
    private AssetType assetType;




}
