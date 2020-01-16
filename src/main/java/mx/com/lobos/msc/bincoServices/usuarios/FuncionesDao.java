package mx.com.lobos.msc.bincoServices.usuarios;

import java.math.BigDecimal;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import mx.com.lobos.msc.bincoServices.entidades.Funciones;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RepositoryRestResource(path = "funciones")
public interface FuncionesDao extends PagingAndSortingRepository<Funciones, BigDecimal> {

}
