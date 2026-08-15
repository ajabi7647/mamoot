package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.TransferVoucherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface TransferVoucherRepository extends JpaRepository<TransferVoucherEntity, UUID> {

    Optional<TransferVoucherEntity> findByVoucherNumber(String voucherNumber); //search by vochernumber

    boolean existsByVoucherNumber(String voucherNumber); //check for not duplicate
}
