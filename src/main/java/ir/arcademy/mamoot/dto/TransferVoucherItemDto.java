package ir.arcademy.mamoot.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter

public class TransferVoucherItemDto {

    private Integer quantity;


    private UUID voucherId;


    private UUID consumableItemId;


    private UUID assetTypeId;
}
