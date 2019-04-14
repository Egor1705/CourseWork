package by.bsu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import by.bsu.model.Ticket;


public class TicketDaoImpl implements TicketDao {

	private JdbcTemplate jdbcTemp;
	
	
	
	
	
	
	public TicketDaoImpl(DataSource dataSource) {
		jdbcTemp = new JdbcTemplate(dataSource);
	}





	public List<Ticket> listAllTickets() {
		
		List<Ticket> list = jdbcTemp.query("SELECT * FROM Tickets", new RowMapper<Ticket>() {

			public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
				Ticket ticket = new Ticket();

				ticket.setId(rs.getInt("id_ticket"));
				ticket.setHow_long(rs.getString("how_long"));
				ticket.setId_class_ticket(rs.getInt("id_class_ticket"));
				ticket.setPrice(rs.getDouble("price"));				
				return ticket;
			}
		});
		return list;
	}

	@Override
	public List<Ticket> ViewCatalog() {
		// TODO Auto-generated method stub
		return null;
	}





	
	public List<Ticket> FixPrice() {
		List<Ticket> list = jdbcTemp.query("Select * from Tickets Where price>4200", new RowMapper<Ticket>() {

			public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
				Ticket ticket = new Ticket();

				ticket.setId(rs.getInt("id_ticket"));
				ticket.setHow_long(rs.getString("how_long"));
				ticket.setId_class_ticket(rs.getInt("id_class_ticket"));
				ticket.setPrice(rs.getDouble("price"));				
				return ticket;
			}
		});
		return list;
	}





	
	
	

}
