package br.gov.sp.fatec.projetospring20231.service;

import java.util.List;

import br.gov.sp.fatec.projetospring20231.entity.Usuario;

public interface InterfaceUsuarioService {

    public Usuario buscarPorId(Long id);

    public Usuario novoUsuario(Usuario usuario);

    public List<Usuario> buscarTodos();

}
