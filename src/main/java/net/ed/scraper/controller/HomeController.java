package net.ed.scraper.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import net.ed.scraper.model.Totals;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {
	
//	private static WebDriver driver;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
//	@ResponseBody
	@RequestMapping("/")
	public String home(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate);
		
		return "home";
	}
	
	@RequestMapping("/scraper")
	public String scraper(Model model) {

		System.out.println("44. inside /scraper");

		Totals t = new Totals();
		t.setCurrentMarketValue("10,000");
		t.setDayGain("10");
		t.setTotalGain("100");
		
		model.addAttribute("todays_totals", t);
		
//		ScraperController.scraperDriver();
		
        return "scraper";
	}
	
}