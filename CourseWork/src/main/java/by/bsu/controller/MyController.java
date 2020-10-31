package by.bsu.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import by.bsu.dao.AirportDao;
import by.bsu.dao.PlaneDao;
import by.bsu.dao.TicketDao;
import by.bsu.dao.TicketDaoImpl;
import by.bsu.model.Airport;
import by.bsu.model.Plane;
import by.bsu.model.Ticket;

@Controller
public class MyController {

	@Autowired
	private TicketDao ticketDao;
	@Autowired
	private PlaneDao planeDao;
	@Autowired
	private AirportDao airportDao;
	
	

	@RequestMapping(value = "/tickets")
	public ModelAndView listTickets() throws IOException {

		List<Ticket> list = ticketDao.listAllTickets();
		ModelAndView model = new ModelAndView();
		
		model.addObject("list", list);
		model.setViewName("index");
		return model;	
	}
	
	@RequestMapping(value = "/price")
	public ModelAndView FixPriceTickets() throws IOException {

		List<Ticket> list = ticketDao.FixPrice();
		ModelAndView model = new ModelAndView();
		
		model.addObject("list", list);
		model.setViewName("index");
		return model;	
	}
	
	

	
	
	@RequestMapping(value = "/airports")
	public ModelAndView listAirports() throws IOException {

		List<Airport> list = airportDao.listAllAirports();
		ModelAndView model = new ModelAndView();
		model.addObject("list", list);
		model.setViewName("catalog");

		return model;	
	}

	

	@RequestMapping(value = "/planes")
	public ModelAndView listPlanes() throws IOException {

		List<Plane> listP = planeDao.listAllPlanes();
		ModelAndView model1 = new ModelAndView();
		model1.addObject("listP", listP);
		model1.setViewName("catalog");

		return model1;	
	}
	
	
	
//public ModelAndView listCatalog()throws IOEception{
//	
//	
//}
	
	
}
