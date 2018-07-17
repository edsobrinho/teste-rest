/**
 * 
 */
package br.com.dbserve.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.dbserve.teste.model.Restaurante;
import br.com.dbserve.teste.repositories.RestauranteRepository;

/**
 * @author douglasfs
 *
 */
@Service("restauranteService")
@Transactional
public class RestauranteServiceImpl implements RestauranteService  {

	@Autowired
	private RestauranteRepository repository;
	
	@Override
	public List<Restaurante> getRestaurantes() {
		return repository.findAll();
	}

}
