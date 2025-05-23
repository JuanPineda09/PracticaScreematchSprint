package com.oraclecurso.screematch;

import com.oraclecurso.screematch.model.DatosEpisodio;
import com.oraclecurso.screematch.model.DatosSerie;
import com.oraclecurso.screematch.model.DatosTemporas;
import com.oraclecurso.screematch.principal.Principal;
import com.oraclecurso.screematch.service.ConsumoAPI;
import com.oraclecurso.screematch.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreematchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreematchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal();
		principal.muestraElMenu();







		//System.out.println("Hola Mundo desde Spring");

		/*var consumoApi = new ConsumoAPI();
		var json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&apikey=27283838");
		ConvierteDatos conversor = new ConvierteDatos();
		var datos = conversor.obtenerDatos(json, DatosSerie.class);
		System.out.println(datos);

		json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&Season=1&episode=1&apikey=27283838");
		DatosEpisodio episodios = conversor.obtenerDatos(json, DatosEpisodio.class);
		System.out.println(episodios);*/
	}
}


//Funciones Lambda
//(argumentos) -> { cuerpo-de-la-función }
// (a, b) -> { return a + b; }