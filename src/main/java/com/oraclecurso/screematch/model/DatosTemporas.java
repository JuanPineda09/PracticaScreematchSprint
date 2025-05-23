package com.oraclecurso.screematch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosTemporas(
            @JsonAlias("Season") Integer numero,
            @JsonAlias("Episodes") List<DatosEpisodio>  episodios
                    ){
}
