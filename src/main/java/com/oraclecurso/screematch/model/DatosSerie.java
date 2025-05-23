package com.oraclecurso.screematch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)//Ignora Todos los demas campos del JSON que no hemos declarado
public record DatosSerie(
        // @JsonAlias Permite leer los datos del API identificando los nombre que vienen del JSON y transformandolos a el que nosotros queremos asignarle
        //@JsonAlias tambien se utiliza para definir uno o más alias para el nombre de la propiedad JSON asociada al campo Java.
        //@JsonProperty Sirve para leer y enviar datos a la API dado que @JsonAlias solo permite lectura
        @JsonAlias("Title") String titulo,
        @JsonAlias("totalSeasons") Integer temporadas,
        @JsonAlias("imdbRating") String evaluacion) {
}
