package by.bsu.dao;

import java.util.List;

import by.bsu.model.Ticket;

public interface TicketDao {

	public List<Ticket> listAllTickets();
	
	public List<Ticket> ViewCatalog();
	
}
