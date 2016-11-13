package com.grupoB.proyecto.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//El único servlet de la aplicación es el FrontServlet, que se encarga de recoger 
//la acción realizada por el usuario y pasar el control al Controller adecuado.
public class FrontServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private Map<String, IControlador> controllers = new HashMap<String, IControlador>();
       
    
	//Constructor vacio
    public FrontServlet() 
    {
       
    }

    //sobreescribir metodo init()
    public void init() throws ServletException 
	{

		super.init();

		//Colocar el mapeado de los servidores y la insancia del controlador
		controllers.put("/categoriasctrl", new ImplCategoriaControlador());
	}
	
    
    //metodo doProcess
    private void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException 
    {
		// Comprueba la accion a realizar
		String action = request.getServletPath();
		// Ejecuta el controlador a partir de la accion
		String view = controllers.get(action).process(request, response);
		// Crea la vista que viene a continuacion
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		// Redirige la peticion
		dispatcher.forward(request, response);
	}

    //metodo doGet
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doProcess(request, response);
	}


	//metodo doPost
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		doProcess(request, response);
	}
	
	
	

}
