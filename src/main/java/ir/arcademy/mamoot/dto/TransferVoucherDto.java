package ir.arcademy.mamoot.dto;


import ir.arcademy.mamoot.enume.VoucherStatus;
import ir.arcademy.mamoot.enume.VoucherType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;
@Getter
@Setter
public class TransferVoucherDto {

    private String voucherNumber;
    private LocalDate voucherDate;
     private UUID departmentId;
    private VoucherType voucherType;
     private VoucherStatus status;
    private UUID inventoryGroupId;
    private UUID distributionOfficerId;
}
