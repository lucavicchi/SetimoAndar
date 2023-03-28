package br.com.ada.locasp.demo.controller;

import br.com.ada.locasp.demo.domain.Apartamento;
import br.com.ada.locasp.demo.service.ApartamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("apartamento")
@RestController
public class ApartamentoController {

    private final ApartamentoService apartamentoService;

    @GetMapping
    public List<Apartamento> list(){
        return apartamentoService.list();
    }

    @GetMapping("{id}")
    public Apartamento getById(@PathVariable Long id){
        return apartamentoService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Apartamento save(@RequestBody Apartamento apartamento){
        return apartamentoService.save(apartamento);
    }
}