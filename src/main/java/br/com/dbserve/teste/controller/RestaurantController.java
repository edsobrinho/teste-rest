/**
 * 
 */
package br.com.dbserve.teste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author douglasfs
 *
 */
@Controller
public class RestaurantController {
	

	@RequestMapping("/")
	String home(ModelMap modal) {
		return "index";
	}
	
	
	
}
