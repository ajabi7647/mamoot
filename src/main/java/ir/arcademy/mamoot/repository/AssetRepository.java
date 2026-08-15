package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.AssetEntity;
import ir.arcademy.mamoot.entity.AssetTypeEntity;
import ir.arcademy.mamoot.enume.AssetStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AssetRepository extends JpaRepository<AssetEntity, UUID> {

    Optional<AssetEntity> findByAssetCode(String assetCode); //search per assetcode materials
    List<AssetEntity> findByStatus(AssetStatus status);
    List<AssetEntity> findByAssetType(AssetTypeEntity assetType);

    boolean existsByAssetCode(String assetCode);
    boolean existsBySerialNumber(String serialNumber); //chech for not duplicate serial numbermaterials
}

