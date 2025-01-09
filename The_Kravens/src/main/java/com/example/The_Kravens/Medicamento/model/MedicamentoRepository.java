package com.example.The_Kravens.Medicamento.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoRepository extends CrudRepository<Medicamento, Long> {

}
