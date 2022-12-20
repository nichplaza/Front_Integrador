package com.portfolio.np.Security.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.np.Security.Entity.Rol;
import com.portfolio.np.Security.Enums.RolNombre;
import com.portfolio.np.Security.Repository.iRolRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class RolService {
	@Autowired
	iRolRepository irolRepository;
	
		public Optional<Rol> getByRolNombre(RolNombre rolNombre){
			return irolRepository.findByRolNombre(rolNombre);
		}
		
		public void save(Rol rol) {
		irolRepository.save(rol);
		}
}
