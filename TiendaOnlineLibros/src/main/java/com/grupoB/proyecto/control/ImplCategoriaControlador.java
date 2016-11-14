package com.grupoB.proyecto.control;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.grupoB.proyecto.modelo.*;
import com.grupoB.proyecto.servicio.*;


public class ImplCategoriaControlador implements IControlador 
{

	public String process(HttpServletRequest request, HttpServletResponse response) 
	{
		String operacion;
		
        try 
        {
            // Comprobamos el tipo de accion que se solicita
            operacion = request.getParameter("operacion");
            
            
            CategoriaServicio catserv =new CategoriaServicio();

            if(operacion.equals("alta"))
            {
            	System.out.println("estoy dando de alta");
            	catserv.persist(recogerDatos(request));
            	request.setAttribute("categorias", catserv.findAll());
            	//response.sendRedirect("implCategoriaControlador.do?operacion=listado");
            }
            else if(operacion.equals("baja"))
            {
            	System.out.println("estoy dando de baja");
            	catserv.delete(Integer.parseInt(request.getParameter("cod")));
            	request.setAttribute("categorias", catserv.findAll());
            	//response.sendRedirect("implCategoriaControlador.do?operacion=listado");
            }
            else if(operacion.equals("modificacion"))
            {
            	System.out.println("estoy modificando");
            	catserv.update(recogerDatos(request));
            	request.setAttribute("categorias", catserv.findAll());
            	//response.sendRedirect("implCategoriaControlador.do?operacion=listado");
            }
            else if(operacion.equals("listado"))
            {
            	System.out.println("estoy listando");
            	request.setAttribute("categorias", catserv.findAll());
            }
            
        }catch (Exception e) 
        {
            System.out.println("--------------------  FALLO  -----------------------------");
            e.printStackTrace();
            System.out.println("----------------------------------------------------------");
        }   

		return ("/listadoCategoria.jsp");
	}
	
	
	
	public Categoria recogerDatos(HttpServletRequest request) 
	{
		Integer idLibro;
        Libro l = new Libro();
        LibroServicio libserv= new LibroServicio();

        Categoria c = new Categoria();
        
        if((request.getParameter("operacion")).equals("modificacion"))
        	c.setIdCategoria(Integer.parseInt(request.getParameter("idCategoria")));
        c.setNombre(request.getParameter("nombre"));
        idLibro=Integer.parseInt(request.getParameter("idLibro"));
        l= libserv.findById(idLibro);
        c.setLibro(l);
       
        return c;
    }

}