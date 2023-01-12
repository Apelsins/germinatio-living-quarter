package vela.gliese1132b.germinatio.living.quarter.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vela.gliese1132b.germinatio.living.quarter.dto.InhabitantDTO;
import vela.gliese1132b.germinatio.living.quarter.service.InhabitantService;

import java.util.List;

@RestController
@RequestMapping("/inhabitant")
@AllArgsConstructor
public class InhabitantController {

    private final InhabitantService inhabitantService;

    @GetMapping
    public List<InhabitantDTO> getAllInhabitants() {
        return inhabitantService.getAllInhabitants();
    }

    @GetMapping("/hi")
    String all() {
        return "Hi";
    }
}
