package br.gov.sp.fatec.projetospring20231.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.projetospring20231.entity.UsuarioEntity;
import br.gov.sp.fatec.projetospring20231.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepo;

    public UsuarioEntity buscarPorId(Long id) {
        Optional<UsuarioEntity> usuarioOp = usuarioRepo.findById(id);

        if(usuarioOp.isPresent()) {
            return usuarioOp.get();
        }
        throw new IllegalArgumentException("id invalido");
    }

    public UsuarioEntity novoUsuario(UsuarioEntity usuario) {
        if(
            usuario == null ||
            usuario.getNome() == null ||
            usuario.getSenha() == null
        ) {
            throw new IllegalArgumentException("Nome e senha invalidos");
        }
        return usuarioRepo.save(usuario);
    }

    public List<UsuarioEntity> buscarTodos() {
        return usuarioRepo.findAll();
    }
}
