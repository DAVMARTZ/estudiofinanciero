/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.estudiofinanciero.domain;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface TipoPersonaRepository extends Repository<TipoPersona, Integer>{ 
    
    List<TipoPersona> findAll();
    
    TipoPersona findById(int id_tp);

    TipoPersona save(TipoPersona tp);

    void delete(TipoPersona tp);
    
}
