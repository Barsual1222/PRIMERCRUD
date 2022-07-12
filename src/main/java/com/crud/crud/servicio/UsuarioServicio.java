package com.crud.crud.servicio;


import com.crud.crud.modelo.Usuario;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UsuarioServicio {

    ResponseEntity<List<Usuario>> listarUsuario();

    ResponseEntity<Usuario> guardarUsuario(Usuario Usuario);

    ResponseEntity<Usuario> eliminarUsuario(Long id);

    ResponseEntity<Usuario> usuarioId(Long id );

    ResponseEntity<Usuario> actualizarUsuario(Usuario usuario, Long id);

}
