package com.grupoB.proyecto.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//La interfaz básica de un controlador tiene un solo método para procesar la petición, 
//que recibe los objetos HttpServletRequest y HttpServletResponse y devuelve un String 
//con el nombre del archivo .jsp que mostrará el resultado -vista- correspondiente. 
//Este nombre de archivo se lo pasaremos como parámetro al objeto RequestDispatcher para 
//redirigir el controlador a la vista.

public interface IControlador 
{

	String process(HttpServletRequest request, HttpServletResponse response);

}
