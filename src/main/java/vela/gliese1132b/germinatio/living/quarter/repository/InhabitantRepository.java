package vela.gliese1132b.germinatio.living.quarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vela.gliese1132b.germinatio.living.quarter.entity.Inhabitant;

import java.util.UUID;

public interface InhabitantRepository extends JpaRepository<Inhabitant, UUID> {
}
