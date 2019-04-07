package uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.entities.SellerEntity;

public interface SellerRepository extends JpaRepository<SellerEntity,Long> {
}
