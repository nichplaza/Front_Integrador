package com.portfolio.np.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.np.Entity.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{

	List<Persona> findAll();

}
