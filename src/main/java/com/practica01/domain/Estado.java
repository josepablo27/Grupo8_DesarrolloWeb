package com.practica01.domain;
        
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")

public class Estado implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;
    String nombre;
    String capital;
    int poblacion;
    int extension;

    public Estado() {
    }

    public Estado(String nombre, String capital, int poblacion, int extension) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.extension = extension;
    }

   

}

