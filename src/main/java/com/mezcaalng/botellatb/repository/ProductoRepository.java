package com.mezcaalng.botellatb.repository;

import com.mezcaalng.botellatb.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer> {


}
