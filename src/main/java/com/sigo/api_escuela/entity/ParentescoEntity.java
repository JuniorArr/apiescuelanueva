/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sigo.api_escuela.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder            //Genera la Clase.
@AllArgsConstructor //Constructores con Atributos.
@NoArgsConstructor  //Constructores sin Atributos.
@Data               //Genera los Getter and Setters.

@Entity(name = "ParentescoEntity")
@Table(name = "parentesco")

public class ParentescoEntity implements Serializable {
    private static final long serialVersionUID=1L;
    
    //Atributos
    @Id
    @Column(name = "codpar")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long codigo;
    
    @Column(name = "despar")
    private String descripcion;
    
    @Column(name = "estpar")
    private boolean estado;
}
