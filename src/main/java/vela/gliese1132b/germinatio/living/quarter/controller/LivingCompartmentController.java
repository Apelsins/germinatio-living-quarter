package vela.gliese1132b.germinatio.living.quarter.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vela.gliese1132b.germinatio.living.quarter.dto.LivingCompartmentDTO;
import vela.gliese1132b.germinatio.living.quarter.service.LivingCompartmentService;

import java.util.List;

@RestController
@RequestMapping("/living-compartment")
@AllArgsConstructor
public class LivingCompartmentController {

    private final LivingCompartmentService livingCompartmentService;

    @GetMapping
    public List<LivingCompartmentDTO> getAllInhabitants() {
        return livingCompartmentService.getAllLivingCompartment();
    }

}
