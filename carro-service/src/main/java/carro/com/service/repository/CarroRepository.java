package carro.com.service.repository;

import carro.com.service.entity.Carro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer> {

    List<Carro> findByUsuarioId(int usuarioId);

}
