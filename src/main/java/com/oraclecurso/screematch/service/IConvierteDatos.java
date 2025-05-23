package com.oraclecurso.screematch.service;

public interface IConvierteDatos {
    // <T> T Se usa para trabajar datos genericos en este caso no se sabe que va a recibir
    <T> T obtenerDatos(String json, Class<T> clase);

}
/*
En Java, los genéricos permiten crear clases, interfaces y métodos que pueden trabajar con tipos desconocidos o parámetros genéricos. Proporcionan una forma de escribir código flexible y reutilizable, haciéndolo independiente de tipos específicos y permitiendo que funcione con diferentes tipos de datos.

Para crear una clase o método genérico, necesitas usar parámetros de tipo (tipos genéricos) que se representan entre corchetes angulares <>. Por lo general, usamos letras mayúsculas únicas para representar los tipos genéricos, pero puedes usar cualquier identificador válido en Java. Aquí tienes un ejemplo de una clase genérica llamada Caja, que almacena un valor de un tipo desconocido:


public class Caja<T> {
    private T contenido;

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }
}*/
