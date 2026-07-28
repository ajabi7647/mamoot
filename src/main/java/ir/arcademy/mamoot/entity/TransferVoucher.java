package ir.arcademy.mamoot.entity;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class TransferVoucher extends BaseEntity {
    @Column(nullable = true)
    private String voucherNumber;
    private LocalDate voucherDate;
    private String voucherType;
     private String  status;
    inventoryGroup_id
            distributionOfficer_id

}
