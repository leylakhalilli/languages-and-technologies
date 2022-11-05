package dataAccess.abstracts;

import entities.LanguagesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguagesRepository extends JpaRepository<LanguagesEntity,Integer> {
}
