package mx.com.lobos.msc.bincoServices.funciones;

import java.math.BigDecimal;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import mx.com.lobos.msc.bincoServices.entidades.Usuarios;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RepositoryRestResource(path = "usuarios")
public interface UsuariosDao extends PagingAndSortingRepository<Usuarios, BigDecimal> {

}
