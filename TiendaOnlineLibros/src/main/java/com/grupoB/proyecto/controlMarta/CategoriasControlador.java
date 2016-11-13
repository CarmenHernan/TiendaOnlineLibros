package com.grupoB.proyecto.controlMarta;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.grupoB.project.modelo.*;
import com.grupoB.project.servicio.*;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;


public class CategoriasControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String operacion;
		
        try 
        {
            // Comprobamos el tipo de accion que se solicita****
            operacion = request.getParameter("operacion");
          
          CategoriaServicio catserv =new CategoriaServicio();

            if(operacion.equals("alta"))
            {
            	catserv.persist(recogerDatos(request));
            	// ****Sends a temporary redirect response to the client using the specified redirect
            	//location URL (parameter). This method can accept relative URLs; the servlet container must convert
            	//the relative URL to an absolute URL before sending the response to the client. 
            	response.sendRedirect("categoriasctrl?operacion=listado");
            }
            else if(operacion.equals("baja"))
            {
            	// hay que hacer porque el getParameter siempre devuelve un String
            	catserv.delete(Integer.parseInt(request.getParameter("idCategoria")));
            	response.sendRedirect("categoriasctrl?operacion=listado");
            }
            else if(operacion.equals("modificacion"))
            {
            	catserv.update(recogerDatos(request));
            	response.sendRedirect("categoriasctrl?operacion=listado");
            }
            else if(operacion.equals("listado"))
            {
            	request.setAttribute("categorias", catserv.findAll());
            	
            	
            	RequestDispatcher view = request.getRequestDispatcher("/listado.jsp");
                view.forward(request, response);
            	
            }
            
        }catch (Exception e) 
        {
            System.out.println("--------------------  FALLO  -----------------------------");
            e.printStackTrace();
            System.out.println("----------------------------------------------------------");
        }   

	}


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    public Categoria recogerDatos(HttpServletRequest request) 
	{
	//devuelve un objeto categoria, para poder dar altas y modificar
		
		
		Integer idLibro;
        Libro l = new Libro();
        LibroServicio libserv= new LibroServicio();

        Categoria c = new Categoria();
        //doy nombre a la categoria
        c.setNombre(request.getParameter("nombre"));
        //el método parseInt es de la clase Integer
        idLibro=Integer.parseInt(request.getParameter("idLibro"));
        //me devuelve un libro a partir de su id
        l= libserv.findById(idLibro);
        //tengo la categoria con un nombre y un objeto libro
        c.setLibro(l);
       //el código de la categoria no se lo doy, porque es autoincremental, pero el del libro sí
        return c;
    }
}
