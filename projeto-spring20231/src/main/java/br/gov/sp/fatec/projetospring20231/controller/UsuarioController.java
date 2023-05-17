package br.gov.sp.fatec.projetospring20231.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.projetospring20231.entity.UsuarioEntity;
import br.gov.sp.fatec.projetospring20231.service.IUsuarioService;

@RestController
@CrossOrigin
@RequestMapping(value = "/usuario")
public class UsuarioController {
    @Autowired
    private IUsuarioService service;

    @GetMapping
    public List<UsuarioEntity> buscarTodos() {
        return service.buscarTodos();
    }

    @GetMapping(value = "/id/{usuario}")
    public UsuarioEntity buscarPorId(@PathVariable ("usuario") Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public UsuarioEntity novoUsuario(@RequestBody UsuarioEntity usuario) {
        return service.novoUsuario(usuario);
    }
}
