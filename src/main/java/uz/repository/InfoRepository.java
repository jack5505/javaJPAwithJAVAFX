package uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.entities.InfoEntity;

public interface InfoRepository extends JpaRepository<InfoEntity,Long> {

}
