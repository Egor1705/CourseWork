package by.bsu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import by.bsu.model.Airport;


public class AirportDaoImpl implements AirportDao {

	private JdbcTemplate jdbcTemp;
	

	
	public AirportDaoImpl(DataSource dataSource) {
		jdbcTemp = new JdbcTemplate(dataSource);
	}
	
	
	

	public List<Airport> listAllAirports() {
		List<Airport> list = jdbcTemp.query("SELECT * FROM Airports", new RowMapper<Airport>() {

			public Airport mapRow(ResultSet rs, int rowNum) throws SQLException {
				Airport airport = new Airport();
				airport.setId_airport(rs.getInt("id_airport"));
				airport.setCity_name(rs.getString("city_name"));
				airport.setAirport_name(rs.getString("airport_name"));
				airport.setId_plane_airport(rs.getInt("id_plane_airport"));
				return airport;
			}		
		});	
		return list;
	}

}
