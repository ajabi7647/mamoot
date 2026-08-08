package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.TransferVoucher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TransferVoucherRepository extends JpaRepository<TransferVoucher, Long> {

    Optional<TransferVoucher> findByVoucherNumber(String voucherNumber); //search by vochernumber

    boolean existsByVoucherNumber(String voucherNumber); //check for not duplicate
}
