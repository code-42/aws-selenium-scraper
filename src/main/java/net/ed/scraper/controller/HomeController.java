package net.ed.scraper.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.ed.scraper.util.YahooLoginUtil;
import net.ed.scraper.model.Totals;
//import net.ed.scraper.service.IScraperService;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/")
	public String home(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate);
		
		return "home";
	}
	
	@RequestMapping("/totals")
	public String totals(Model model) {

		System.out.println("44. inside /scraper");

		Totals t = new Totals();
		t.setCurrentMarketValue("10,000");
		t.setDayGain("10");
		t.setTotalGain("100");
		
		model.addAttribute("todays_totals", t);

		return "totals";
	}
	
	// inject scraper service
//	@Autowired
//	private IScraperService scraperService;

	@RequestMapping("/scraper")
	public String scraper(Model model) throws Exception {

		System.out.println("56. inside /scraper");
		
        // read spring config java class
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(ScraperConfig.class);
        
        // get the bean from spring container
        YahooLoginUtil theLoginUtil = context.getBean("yahooLoginUtil", YahooLoginUtil.class);
        WebDriver driver = ScraperController.scraperDriver();
        theLoginUtil.getLoggedIn(driver);
        
        // call methods on the bean
//		System.out.println(theLoginUtil.getLoggedIn(driver));

//	    // get the bean from spring container
//        ScraperUtil theScraperUtil = context.getBean("scraperUtil", ScraperUtil.class);
//
//        // call methods on the bean
//        System.out.println(theScraperUtil.navWatchlist(driver));
        
//        // store data in lists to send to the view
//        List<Totals> todays_totals = theScraperUtil.scrapeTotals(driver);
//        List<Watchlist> todays_watchlist = theScraperUtil.scrapeWatchlist(driver);
//
//        // writing data to the view
//        model.addAttribute("todays_totals", todays_totals);
//        model.addAttribute("todays_watchlist", todays_watchlist);
//		model.addAttribute("market_time", todays_watchlist.get(0).getMarketTime());

                    
        // close the context
//        context.close();
//        return "list-data";
        return "scraper";
	}

}