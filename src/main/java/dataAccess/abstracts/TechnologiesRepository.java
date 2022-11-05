package dataAccess.abstracts;

import entities.TechnologiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologiesRepository extends JpaRepository<TechnologiesEntity, Integer> {
}
