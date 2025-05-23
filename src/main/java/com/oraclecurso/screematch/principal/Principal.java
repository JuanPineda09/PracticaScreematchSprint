package com.oraclecurso.screematch.principal;
import com.oraclecurso.screematch.model.DatosEpisodio;
import com.oraclecurso.screematch.model.DatosSerie;
import com.oraclecurso.screematch.model.DatosTemporas;
import com.oraclecurso.screematch.service.ConsumoAPI;
import com.oraclecurso.screematch.service.ConvierteDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=27283838";
    private ConvierteDatos conversor = new ConvierteDatos();

    public void muestraElMenu(){
        System.out.println("Ingresa el nombre de la serie que deseas buscar");
        //Busca los datos generales de las series
        var nombreSerie = teclado.nextLine();
        var json = consumoApi.obtenerDatos(URL_BASE+nombreSerie.replace(" ","+")+API_KEY);
        var datos = conversor.obtenerDatos(json, DatosSerie.class);
        System.out.println(datos);
        //Busca los datos de todas las temporadas
        List<DatosTemporas> temporadas = new ArrayList<>();
        for (int i = 1; i <= datos.temporadas() ; i++) {
            json = consumoApi.obtenerDatos(URL_BASE+nombreSerie.replace(" ","+")+"&Season="+i+API_KEY);
            var datosTemporadas = conversor.obtenerDatos(json, DatosTemporas.class);
            temporadas.add(datosTemporadas);
        }
        //temporadas.forEach(System.out::println);
        
        
        //Mostrar solo el titulo de los episodios para las temporadas
        //La forma larga de recorrer el array
        /*for (int i = 0; i < datos.temporadas(); i++) {
            List<DatosEpisodio> episodiosTemporadas = temporadas.get(i).episodios();
            for (int j = 0; j < episodiosTemporadas.size(); j++) {
                System.out.println(episodiosTemporadas.get(j).titulo());
            }
        }*/
        //Esta forma simplifica el codigo anterior
        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));
    }
}
