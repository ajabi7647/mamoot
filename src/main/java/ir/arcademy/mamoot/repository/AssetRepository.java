package ir.arcademy.mamoot.repository;

import ir.arcademy.mamoot.entity.Asset;
import ir.arcademy.mamoot.entity.AssetType;
import ir.arcademy.mamoot.enume.AssetStatus;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AssetRepository extends JpaRepository<Asset, Long> {

    Optional<Asset> findByAssetCode(String assetCode); //search per assetcode materials
    List<Asset> findByStatus(AssetStatus status);
    List<Asset> findByAssetType(AssetType assetType);

    boolean existsByAssetCode(String assetCode);
    boolean existsBySerialNumber(String serialNumber); //chech for not duplicate serial numbermaterials
}

