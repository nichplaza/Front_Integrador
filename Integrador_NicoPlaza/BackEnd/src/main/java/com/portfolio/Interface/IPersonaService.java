package com.portfolio.Interface;

import java.util.List;
import com.portfolio.Entity.Persona;

public interface IPersonaService {
	
	public List<Persona> getPersona();
	
	public void savePersona(Persona persona);
	
	public void deletePersona(Long id); 
	
	public Persona findPersona(Long id);
}
