package mx.com.lobos.msc.bincoServices.usuarios;

import java.math.BigDecimal;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import mx.com.lobos.msc.bincoServices.entidades.Funciones;

@RepositoryRestResource(path = "funciones")
public interface FuncionesDao extends PagingAndSortingRepository<Funciones, BigDecimal> {

}
