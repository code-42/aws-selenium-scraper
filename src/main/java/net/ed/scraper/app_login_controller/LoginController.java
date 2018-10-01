package net.ed.scraper.app_login_controller;

//adapted from youtube video https://www.youtube.com/watch?v=MQlcLrCrzNc
//change CustomerService to ScraperService

import javax.servlet.http.HttpSession;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
//	@Autowired
//	private VisitorService visitorService;
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("loggedInUser");
		System.out.println("23. " + session.getAttribute("loggedInUser"));
		return "redirect:/";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginForm() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String verifyLogin(@RequestParam String userId, @RequestParam String password, 
			HttpSession session, Model model) {
		
		if (userId == "" || userId == null) {
			model.addAttribute("loginError", "Error logging in. Please enter a username.");
			return "login";
		}
		
		if (password == "" || password == null) {
			model.addAttribute("loginError", "Error logging in. Please enter a password.");
			return "login";
		}
		
		// instantiate customer object through constructor dependency injection
//		Customer customer = customerService.loginCustomer(userId, password);
//		if (customer == null) {
//			model.addAttribute("loginError", "Error logging in. Please try again.");
//			model.addAttribute("user", userId);
//			return "login";
//			return "redirect:/listData";
//		}
		session.setAttribute("loggedInUser", userId);
		System.out.println("37. " + userId);
		System.out.println(session.getAttribute("loggedInUser"));
//		return "redirect:/";
		return "redirect:/totals";
		
	}
	

}
