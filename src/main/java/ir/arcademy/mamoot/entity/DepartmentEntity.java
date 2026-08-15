package ir.arcademy.mamoot.entity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "departments")
public class DepartmentEntity extends BaseEntity {

    @Column(nullable = false, unique = true, length = 20)
    private String code;
    @Column(nullable = false, length = 100)
    private String name;
    @Column(length = 300)
    private String description;
   }