package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.TransferVoucherEntity;
import ir.arcademy.mamoot.entity.TransferVoucherItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TransferVoucherItemRepository extends JpaRepository<TransferVoucherItemEntity, UUID> {
    List<TransferVoucherItemEntity> findByVoucher(TransferVoucherEntity voucher);
}
