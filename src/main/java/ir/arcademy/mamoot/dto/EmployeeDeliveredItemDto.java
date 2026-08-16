package ir.arcademy.mamoot.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
public class EmployeeDeliveredItemDto {

    private Integer quantity;
    private String assetCode;
    private String serial;
    private String unit;
    private String description;

    private UUID receiverId;
    private UUID delivererId;
    private UUID assetTypeId;
    private UUID consumableItemId;
}