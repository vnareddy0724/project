package com.example.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.Cart;
import com.example.domain.SearchData;
import com.example.service.AppService;

@Controller
public class AppController {

	@Autowired
	AppService appService;
	
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String getIndexPage(HttpServletRequest req, HttpServletResponse res) {
		
		return "index";
		
	}
	
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String getRegisterPage(Model model,HttpServletRequest req, HttpServletResponse res) {
		
		System.out.println("Controller");
		boolean result=appService.addUser(req.getParameter("emailsignup"),req.getParameter("passwordsignup"));	
		if(result) {
			model.addAttribute("errormessage", "Please login with your registered credentials");
			return "index";
					
		}
		model.addAttribute("errormessage", "This email id is already registered");
		return "index";
		
	}
	
	
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginPage(Model model,HttpServletRequest req, HttpServletResponse res) {
		
		
		boolean result=appService.validateUser(req.getParameter("username"),req.getParameter("password"));	
		
		if(result) {
			HttpSession session=req.getSession();  
	        session.setAttribute("user",req.getParameter("username"));  
			return "Home";
		}
		
		model.addAttribute("errormessage", "Invalid username or password");
		return "index";
		
	}
	
	@RequestMapping(value="/book", method=RequestMethod.GET)
	public String getBookPage(Model model,HttpServletRequest req, HttpServletResponse res) {
		
		HttpSession session=req.getSession();  
		
		appService.storeBookings(session.getAttribute("user"),session.getAttribute("hotel"),session.getAttribute("price"));	
		
		return getCartPage(model,req,res);
		
	}
	
	
	@RequestMapping(value="/cart", method=RequestMethod.GET)
	public String getCartPage(Model model,HttpServletRequest req, HttpServletResponse res) {
		
		HttpSession session=req.getSession();  
		
		List<String> list=appService.getCart(session.getAttribute("user"));
		
		model.addAttribute("cart",list);
		
		return "cart";
		
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String getLogoutPage(Model model,HttpServletRequest req, HttpServletResponse res) {
		
		
	HttpSession session= req.getSession();
	session.invalidate();
	model.addAttribute("errormessage", "Successfully logged out");
		return "index";
		
	}
	
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String getHomePage(HttpServletRequest req, HttpServletResponse res) {
		
		return "Home";
		
	}
	@RequestMapping(value="/gallery", method=RequestMethod.GET)
	public String getGalleryPage(HttpServletRequest req, HttpServletResponse res) {
		
		return "gallery";
		
	}
	@RequestMapping(value="/aboutus", method=RequestMethod.GET)
	public String getAboutPage(HttpServletRequest req, HttpServletResponse res) {
		
		return "about";
		
	}
	@RequestMapping(value="/banglore", method=RequestMethod.GET)
	public String getbanglorePage(HttpServletRequest req, HttpServletResponse res) {
		
		return "banglore";
		
	}
	@RequestMapping(value="/chennai", method=RequestMethod.GET)
	public String getChennaiPage(HttpServletRequest req, HttpServletResponse res) {
		
		return "chennai";
		
	}
	@RequestMapping(value="/singapore", method=RequestMethod.GET)
	public String getSingaporePage(HttpServletRequest req, HttpServletResponse res) {
		
		return "singapore";
		
	}
	@RequestMapping(value="/goa", method=RequestMethod.GET)
	public String getGoaPage(HttpServletRequest req, HttpServletResponse res) {
		
		return "goa";
		
	}
	@RequestMapping(value="/kochii", method=RequestMethod.GET)
	public String getKochiiPage(HttpServletRequest req, HttpServletResponse res) {
		
		return "kochii";
		
	}
	@RequestMapping(value="/kerala", method=RequestMethod.GET)
	public String getKeralaPage(HttpServletRequest req, HttpServletResponse res) {
		
		return "kerala";
		
	}
	@RequestMapping(value="/contact", method=RequestMethod.GET)
	public String getContactPage(HttpServletRequest req, HttpServletResponse res) {
		
		return "contact";
		
	}
	
	
	/*
	 * @RequestMapping(value="/search", method=RequestMethod.POST) public String
	 * searchData(Model model,HttpServletRequest req, HttpServletResponse res) {
	 * 
	 * int years=0; int months=0; int days=0;
	 * 
	 * 
	 * List<SearchData> searchList =
	 * appService.searchData(Integer.parseInt(req.getParameter("policynum")),req.
	 * getParameter("birthdt"));
	 * 
	 * 
	 * if(searchList.size() !=0) { Date date1=null; Date date2=null; try { date1 =
	 * new SimpleDateFormat("yyyy-MM-dd").parse(searchList.get(0).getBirthDate());
	 * 
	 * date2=new
	 * SimpleDateFormat("yyyy-MM-dd").parse(searchList.get(0).getStartDate());
	 * 
	 * } catch (ParseException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * 
	 * //Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(bdate);
	 * 
	 * if(date2.getYear() > date1.getYear()) {
	 * 
	 * years=date2.getYear()-date1.getYear();
	 * months=years*12+date2.getMonth()-date1.getMonth();
	 * days=years*365+date2.getDay()-date1.getDay(); }
	 * 
	 * model.addAttribute("years",years); model.addAttribute("months",months);
	 * model.addAttribute("days",days); }
	 * 
	 * if(searchList.size() == 0) {
	 * 
	 * return "NoResults"; }
	 * 
	 * 
	 * model.addAttribute("searchDataList",searchList);
	 * model.addAttribute("name",searchList.get(0).getFirstName());
	 * 
	 * return "Search"; }
	 */
	
	
}
