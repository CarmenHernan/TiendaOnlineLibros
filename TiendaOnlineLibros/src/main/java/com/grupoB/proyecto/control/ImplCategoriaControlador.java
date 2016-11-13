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
            	catserv.persist(recogerDatos(request));
            	response.sendRedirect("categoriasctrl?operacion=listado");
            }
            else if(operacion.equals("baja"))
            {
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
            }
            
        }catch (Exception e) 
        {
            System.out.println("--------------------  FALLO  -----------------------------");
            e.printStackTrace();
            System.out.println("----------------------------------------------------------");
        }   

		return ("/listado.jsp");
	}
	
	
	
	public Categoria recogerDatos(HttpServletRequest request) 
	{
		Integer idLibro;
        Libro l = new Libro();
        LibroServicio libserv= new LibroServicio();

        Categoria c = new Categoria();
        c.setNombre(request.getParameter("nombre"));
        idLibro=Integer.parseInt(request.getParameter("idLibro"));
        l= libserv.findById(idLibro);
        c.setLibro(l);
       
        return c;
    }

}