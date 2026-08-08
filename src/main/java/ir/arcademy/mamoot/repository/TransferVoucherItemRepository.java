package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.TransferVoucher;
import ir.arcademy.mamoot.entity.TransferVoucherItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransferVoucherItemRepository extends JpaRepository<TransferVoucherItem, Long> {
    List<TransferVoucherItem> findByVoucher(TransferVoucher voucher);
}
