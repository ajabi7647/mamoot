package ir.arcademy.mamoot.dto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class AssetAssignmentDto {

    private LocalDate deliveryDate;
    private LocalDate returnDate;
    private String description;
    private Long employeeId;
    private Long assetId;
}
