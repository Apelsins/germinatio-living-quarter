package vela.gliese1132b.germinatio.living.quarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vela.gliese1132b.germinatio.living.quarter.entity.LivingCompartment;

import java.util.UUID;

public interface LivingCompartmentRepository extends JpaRepository<LivingCompartment, UUID> {
}
