package ir.arcademy.mamoot.dto;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
public class EmployeeDto {

    private String firstName;
    private String lastName;
    private String personnelNumber;
    private UUID departmentId;
}
