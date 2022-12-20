package com.portfolio.np.Security.Service;

import com.portfolio.np.Security.Entity.Usuario;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.np.Security.Repository.iUsuarioRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class UsuarioService {
	@Autowired
	iUsuarioRepository iusuarioRepository;
	
	public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
		return iusuarioRepository.findByNombreUsuario(nombreUsuario);
	}
	
	public boolean existsByNombreUsuario(String nombreUsuario) {
		return iusuarioRepository.existByNombreUsuario(nombreUsuario);
	}
	
	public boolean existsByEmail(String email) {
		return iusuarioRepository.existByEmail(email);
	}
	
	public void save(Usuario usuario) {
		iusuarioRepository.save(usuario);
	}
}
