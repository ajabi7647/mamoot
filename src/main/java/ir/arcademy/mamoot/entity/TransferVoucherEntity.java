package ir.arcademy.mamoot.entity;

import ir.arcademy.mamoot.enume.VoucherStatus;
import ir.arcademy.mamoot.enume.VoucherType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
@Entity
@Table(name = "transfer_vouchers")
public class TransferVoucher extends BaseEntity {

    @Column(nullable = false, unique = true, updatable = false, length = 50)
    private String voucherNumber;

    @Column(nullable = false)
    private LocalDate voucherDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private VoucherType voucherType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private VoucherStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inventory_group_id", nullable = false)
    private InventoryGroup inventoryGroup;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "distribution_officer_id")
    private Employee distributionOfficer;

}
