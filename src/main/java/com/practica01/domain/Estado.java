
package com.practica01.domain;
        
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "practica")

public class Estado implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_estado;
    String nombre;
    String capital;
    int poblacion;
    int extension;

    public Estado() {
    }

    public Estado(Long id_estado, String nombre, String capital, int poblacion, int extension) {
        this.id_estado = id_estado;
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.extension = extension;
    }

   

}

