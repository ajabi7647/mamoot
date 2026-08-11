package ir.arcademy.mamoot.service.impl;

import ir.arcademy.mamoot.dto.TransferVoucherDto;
import ir.arcademy.mamoot.entity.TransferVoucherEntity;
import ir.arcademy.mamoot.service.TransferVoucherService;
import org.springframework.stereotype.Service;
import ir.arcademy.mamoot.repository.TransferVoucherRepository;
import java.util.List;
import java.util.UUID;

@Service
public class TransferVoucherServiceImpl implements TransferVoucherService {

    private final TransferVoucherRepository transferVoucherRepository;

    public TransferVoucherServiceImpl(
            TransferVoucherRepository transferVoucherRepository) {
        this.transferVoucherRepository = transferVoucherRepository;
    }
    @Override
    public TransferVoucherEntity saveTransferVoucher(TransferVoucherDto transferVoucherDto) {
        return null;
    }

    @Override
    public List<TransferVoucherDto> getAllTransferVoucher() {
        return List.of();
    }

    @Override
    public TransferVoucherDto updateTransferVoucher(TransferVoucherDto transferVoucherDto, UUID id) {
        return null;
    }

    @Override
    public void deleteTransferVoucher(UUID id) {

    }
}
