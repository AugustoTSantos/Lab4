package br.gov.sp.fatec.projetospring20231.service;

import java.util.List;

import br.gov.sp.fatec.projetospring20231.entity.UsuarioEntity;

public interface IUsuarioService {
    public UsuarioEntity buscarPorId(Long id);

    public UsuarioEntity novoUsuario(UsuarioEntity usuario);

    public List<UsuarioEntity> buscarTodos();
}
