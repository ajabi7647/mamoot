package ir.arcademy.mamoot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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

    voucher_id
    @Column(nullable = false)
    asset_type_id
    @Column(nullable = false)
    consumable_item_id



}
