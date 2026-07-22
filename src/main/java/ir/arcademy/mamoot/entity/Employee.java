package ir.arcademy.mamoot.entity;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee extends BaseEntity {

    @Column(nullable = false, length = 50)
    private String firstName;
    @Column(nullable = false, length = 50)
    private String lastName;
    @Column(nullable = false , length = 20,unique = true)
    private String personnelNumber;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id" ,nullable = false)
    private Department department;
}
