/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.estudiofinanciero.domain;

import java.util.List;

public interface TipoPersonaService {

    List<TipoPersona> listar();
    
    TipoPersona listarIdTp(int id_tp);

    TipoPersona add(TipoPersona tp);

    TipoPersona edit(TipoPersona tp);

    TipoPersona delete(int id_tp);
    
}
