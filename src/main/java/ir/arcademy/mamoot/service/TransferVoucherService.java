package ir.arcademy.mamoot.service;

import ir.arcademy.mamoot.dto.TransferVoucherDto;
import ir.arcademy.mamoot.entity.TransferVoucherEntity;

import java.util.List;
import java.util.UUID;


public interface TransferVoucherService {

    public TransferVoucherEntity saveTransferVoucher(TransferVoucherDto transferVoucherDto);
    List<TransferVoucherDto> getAllTransferVoucher();
    TransferVoucherDto updateTransferVoucher(TransferVoucherDto transferVoucherDto , UUID id);
    void  deleteTransferVoucher(UUID id);

}
