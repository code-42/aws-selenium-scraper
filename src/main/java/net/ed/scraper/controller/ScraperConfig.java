package net.ed.scraper.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import net.ed.scraper.util.IYahooLogin;
//import net.ed.scraper.util.IScraper;
import net.ed.scraper.util.YahooLoginUtil;
//import net.ed.scraper.util.ScraperUtil;

@Configuration
//@EnableScheduling
@PropertySource("classpath:application.properties")
public class ScraperConfig {

	@Bean
	public IYahooLogin yahooLoginUtil() {
		return new YahooLoginUtil();
	}
	
//	@Bean
//	public IScraper scraperUtil() {
//		return new ScraperUtil();
//	}
	
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/getData").allowedOrigins("http://localhost:8080");
            	registry.addMapping("/scraper").allowedOrigins("http://localhost:8080");
            }
        };
    }
}
