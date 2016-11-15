package com.grupoB.proyecto.control;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.grupoB.proyecto.modelo.Categoria;
import com.grupoB.proyecto.servicio.CategoriaServicio;


/**
 * Handles requests for the application home page.
 */
@Controller
public class ControladorCategoria 
{
	
	@Autowired
	private CategoriaServicio catServ;

	@RequestMapping("/listadoCat")
	public ModelAndView handleRequest() throws Exception 
	{
		List<Categoria> listCategorias = catServ.findAll();
		ModelAndView model = new ModelAndView("CategoriaList");
		model.addObject("CategoriaList", listCategorias);
		return model;
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newCategoria() 
	{
		ModelAndView model = new ModelAndView("AltaCat");
		model.addObject("categoria", new Categoria());
		return model;		
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editCategoria(HttpServletRequest request) 
	{
		int categoriaId = Integer.parseInt(request.getParameter("idCategoria"));
		Categoria categoria = catServ.findById(categoriaId);
		ModelAndView model = new ModelAndView("ModificarCat");
		model.addObject("categoria", categoria);
		return model;		
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteCategoria(HttpServletRequest request) 
	{
		int categoriaId = Integer.parseInt(request.getParameter("idCategoria"));
		catServ.delete(categoriaId);
		return new ModelAndView("redirect:/listadoCat");		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveCategoria(@ModelAttribute Categoria categoria) 
	{
		catServ.persist(categoria);
		return new ModelAndView("redirect:/listadoCat");
	}
	
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute Categoria categoria) 
	{
		catServ.update(categoria);
		return new ModelAndView("redirect:/listadoCat");
	}
	
	
	
	
	
	
	
	
	
	
}
