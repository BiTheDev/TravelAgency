package AirbnbSeattle.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import AirbnbSeattle.model.Parks;
import AirbnbSeattle.model.Restaurants;
import AirbnbSeattle.model.ThingsToDo;
import AirbnbSeattle.model.ZipCode;

public class ThingsToDoDao {
	protected ConnectionManager connectionManager;

	private static ThingsToDoDao instance = null;
	protected ThingsToDoDao() {
		connectionManager = new ConnectionManager();
	}
	public static ThingsToDoDao getInstance() {
		if(instance == null) {
			instance = new ThingsToDoDao();
		}
		return instance;
	}
	
	public ThingsToDo create(ThingsToDo thingsToDo) throws SQLException {
		String insertThingsToDo = 
			"INSERT INTO ThingsToDo(Name,Address,Longitude,Latitude,ZipCodeId) " +
			"VALUES(?,?,?,?,?);";
		Connection connection = null;
		PreparedStatement insertStmt = null;
		try {
			connection = connectionManager.getConnection();
			insertStmt = connection.prepareStatement(insertThingsToDo);
			
			insertStmt.setString(1, thingsToDo.getName());
			insertStmt.setString(2, thingsToDo.getAddress());
			insertStmt.setFloat(3, thingsToDo.getLongitude());
			insertStmt.setFloat(4, thingsToDo.getLatitude());
			insertStmt.setInt(5, thingsToDo.getZipCode().getZipCodeId());		
			insertStmt.executeUpdate();		
				return thingsToDo;
				
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			if(connection != null) {
				connection.close();
			}
			if(insertStmt != null) {
				insertStmt.close();
			}
		}
	}
	
	public ThingsToDo getThingsToDoByName(String name) throws SQLException {
		String selectThingsToDo =
				"SELECT Name,Address,Longitude,Latitude,ZipCodeId " +
				"FROM ThingsToDo " +
				"WHERE Name=?;";
		Connection connection = null;
		PreparedStatement selectStmt = null;
		ResultSet results = null;
		try {
			connection = connectionManager.getConnection();
			selectStmt = connection.prepareStatement(selectThingsToDo);
			selectStmt.setString(1, name);
			results = selectStmt.executeQuery();
			ZipCodeDao zipCodeDao = ZipCodeDao.getInstance();
			if(results.next()) {
				String resultName = results.getString("Name");
				String address = results.getString("Address");
				Float longitude = results.getFloat("Longitude");
				Float latitude = results.getFloat("Latitude");
				int zipCodeId = results.getInt("ZipCodeId");
				ZipCode zipCode = zipCodeDao.getZipCodeByZipCodeId(zipCodeId);
				
				ThingsToDo thingsToDo = new ThingsToDo(resultName, address, longitude, latitude, zipCode);
				return thingsToDo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			if(connection != null) {
				connection.close();
			}
			if(selectStmt != null) {
				selectStmt.close();
			}
			if(results != null) {
				results.close();
			}
		}
		return null;
	}
	
//	public List<ThingsToDo> getThingsToDoFromZipCode(int zipCode) throws SQLException {
//		List<ThingsToDo> thingsToDo = new ArrayList<ThingsToDo>();
//		String selectThingsToDo = 
//			"SELECT Name,Address,ZipCode.ZipCodeId,Latitude,Longitude" +
//			" FROM ThingsToDo JOIN ZipCode ON ZipCode.ZipCodeId = ThingsToDo.ZipCodeId" +
//			" WHERE ZipCodeNumber=? ;";
//		Connection connection = null;
//		PreparedStatement selectStmt = null;
//		ResultSet results = null;
//		ZipCodeDao zipDao = ZipCodeDao.getInstance();
//		try {
//			connection = connectionManager.getConnection();
//			selectStmt = connection.prepareStatement(selectThingsToDo);
//			selectStmt.setInt(1, zipCode);
//			results = selectStmt.executeQuery();
//			while(results.next()) {
//				String name = results.getString("Name");
//				String address = results.getString("Address");
//				float latitude = results.getFloat("Latitude");
//				float longitude = results.getFloat("Longitude");
//				int zipId = results.getInt("ZipCode.ZipCodeId");
//				ZipCode zip = zipDao.getZipCodeByZipCodeId(zipId);
//				ThingsToDo thingToDo = new ThingsToDo(name, address, longitude, latitude, zip);
//				thingsToDo.add(thingToDo);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//			throw e;
//		} finally {
//			if(connection != null) {
//				connection.close();
//			}
//			if(selectStmt != null) {
//				selectStmt.close();
//			}
//			if(results != null) {
//				results.close();
//			}
//		}
//		return thingsToDo;
//	}
	
	public List<Parks> getParkFromZipCode(int zipCode) throws SQLException {
		List<Parks> parks = new ArrayList<Parks>();
		String selectParks = 
			"SELECT Park.Name,Park.Address,ZipCode.ZipCodeId,Latitude,Longitude" +
			" FROM Park JOIN ThingsToDo ON ThingsToDo.Name = Park.Name" +
			" JOIN ZipCode ON ZipCode.ZipCodeId = ThingsToDo.ZipCodeId" +
			" WHERE ZipCodeNumber=? ;";
		Connection connection = null;
		PreparedStatement selectStmt = null;
		ResultSet results = null;
		ZipCodeDao zipDao = ZipCodeDao.getInstance();
		try {
			connection = connectionManager.getConnection();
			selectStmt = connection.prepareStatement(selectParks);
			selectStmt.setInt(1, zipCode);
			results = selectStmt.executeQuery();
			while(results.next()) {
				String name = results.getString("Park.Name");
				String address = results.getString("Park.Address");
				float latitude = results.getFloat("Latitude");
				float longitude = results.getFloat("Longitude");
				int zipId = results.getInt("ZipCode.ZipCodeId");
				ZipCode zip = zipDao.getZipCodeByZipCodeId(zipId);
				Parks park = new Parks(name, address, longitude, latitude, zip);
				parks.add(park);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			if(connection != null) {
				connection.close();
			}
			if(selectStmt != null) {
				selectStmt.close();
			}
			if(results != null) {
				results.close();
			}
		}
		return parks;
	}
	
	public List<Restaurants> getRestaurantsFromZipCode(int zipCode) throws SQLException {
		List<Restaurants> restaurants = new ArrayList<Restaurants>();
		String selectRestaurants = 
			"SELECT Restaurant.Name,Restaurant.Address,ZipCode.ZipCodeId,Latitude,Longitude" +
		    " FROM Restaurant JOIN ThingsToDo ON ThingsToDo.Name = Restaurant.Name" +
			" JOIN ZipCode ON ZipCode.ZipCodeId = ThingsToDo.ZipCodeId" +
			" WHERE ZipCodeNumber=? ;";
		Connection connection = null;
		PreparedStatement selectStmt = null;
		ResultSet results = null;
		ZipCodeDao zipDao = ZipCodeDao.getInstance();
		try {
			connection = connectionManager.getConnection();
			selectStmt = connection.prepareStatement(selectRestaurants);
			selectStmt.setInt(1, zipCode);
			results = selectStmt.executeQuery();
			while(results.next()) {
				String name = results.getString("Restaurant.Name");
				String address = results.getString("Restaurant.Address");
				float latitude = results.getFloat("Latitude");
				float longitude = results.getFloat("Longitude");
				int zipId = results.getInt("ZipCode.ZipCodeId");
				ZipCode zip = zipDao.getZipCodeByZipCodeId(zipId);
				Restaurants restaurant = new Restaurants(name, address, longitude, latitude, zip);
				restaurants.add(restaurant);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			if(connection != null) {
				connection.close();
			}
			if(selectStmt != null) {
				selectStmt.close();
			}
			if(results != null) {
				results.close();
			}
		}
		return restaurants;
	}
	
//	public List<ThingsToDo> getThingsToDoFromNeighborhood(String neighborhood) throws SQLException {
//		List<ThingsToDo> thingsToDo = new ArrayList<ThingsToDo>();
//		String selectThingsToDo = 
//			"SELECT Name,Address,ZipCode.ZipCodeId,Latitude,Longitude" +
//			"FROM ThingsToDo JOIN ZipCode ON ZipCode.ZipCodeId = ThingsToDo.ZipCodeId" +
//			" JOIN Neighborhood ON Neighborhood.ZipCodeId = ZipCode.ZipCodeId "+
//			"WHERE NeighborhoodName=?;";
//		Connection connection = null;
//		PreparedStatement selectStmt = null;
//		ResultSet results = null;
//		ZipCodeDao zipDao = ZipCodeDao.getInstance();
//		try {
//			connection = connectionManager.getConnection();
//			selectStmt = connection.prepareStatement(selectThingsToDo);
//			selectStmt.setString(1, neighborhood);
//			results = selectStmt.executeQuery();
//			while(results.next()) {
//				String name = results.getString("Name");
//				String address = results.getString("Address");
//				float latitude = results.getFloat("Latitude");
//				float longitude = results.getFloat("Longitude");
//				int zipId = results.getInt("ZipCode.ZipCodeId");
//				ZipCode zip = zipDao.getZipCodeByZipCodeId(zipId);
//				ThingsToDo thingToDo = new ThingsToDo(name, address, longitude, latitude, zip);
//				thingsToDo.add(thingToDo);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//			throw e;
//		} finally {
//			if(connection != null) {
//				connection.close();
//			}
//			if(selectStmt != null) {
//				selectStmt.close();
//			}
//			if(results != null) {
//				results.close();
//			}
//		}
//		return thingsToDo;
//	}
	
	
	public List<Parks> getParkFromNeighborhood(String neighborhood) throws SQLException {
		List<Parks> parks = new ArrayList<Parks>();
		String selectParks = 
			"SELECT Park.Name,Park.Address,ZipCode.ZipCodeId,Latitude,Longitude" +
			" FROM Park JOIN ThingsToDo ON ThingsToDo.Name = Park.Name" +
			" JOIN ZipCode ON ZipCode.ZipCodeId = ThingsToDo.ZipCodeId" +
			" JOIN Neighborhood ON Neighborhood.ZipCodeId = ZipCode.ZipCodeId "+
			"WHERE NeighborhoodName = ? ;";
		Connection connection = null;
		PreparedStatement selectStmt = null;
		ResultSet results = null;
		ZipCodeDao zipDao = ZipCodeDao.getInstance();
		try {
			connection = connectionManager.getConnection();
			selectStmt = connection.prepareStatement(selectParks);
			selectStmt.setString(1, neighborhood);
			results = selectStmt.executeQuery();
			while(results.next()) {
				String name = results.getString("Park.Name");
				String address = results.getString("Park.Address");
				float latitude = results.getFloat("Latitude");
				float longitude = results.getFloat("Longitude");
				int zipId = results.getInt("ZipCode.ZipCodeId");
				ZipCode zip = zipDao.getZipCodeByZipCodeId(zipId);
				Parks park = new Parks(name, address, longitude, latitude, zip);
				parks.add(park);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			if(connection != null) {
				connection.close();
			}
			if(selectStmt != null) {
				selectStmt.close();
			}
			if(results != null) {
				results.close();
			}
		}
		return parks;
	}
	
	public List<Restaurants> getRestaurantFromNeighborhood(String neighborhood) throws SQLException {
		List<Restaurants> restaurants = new ArrayList<Restaurants>();
		String selectRestaurants = 
			"SELECT Restaurant.Name,Restaurant.Address,ZipCode.ZipCodeId,Latitude,Longitude" +
			" FROM Restaurant JOIN ThingsToDo ON Restaurant.Name = ThingsToDo.Name" +
			" JOIN ZipCode ON ZipCode.ZipCodeId = ThingsToDo.ZipCodeId" +
			" JOIN Neighborhood ON Neighborhood.ZipCodeId = ZipCode.ZipCodeId "+
			"WHERE NeighborhoodName=?;";
		Connection connection = null;
		PreparedStatement selectStmt = null;
		ResultSet results = null;
		ZipCodeDao zipDao = ZipCodeDao.getInstance();
		try {
			connection = connectionManager.getConnection();
			selectStmt = connection.prepareStatement(selectRestaurants);
			selectStmt.setString(1, neighborhood);
			results = selectStmt.executeQuery();
			while(results.next()) {
				String name = results.getString("Restaurant.Name");
				String address = results.getString("Restaurant.Address");
				float latitude = results.getFloat("Latitude");
				float longitude = results.getFloat("Longitude");
				int zipId = results.getInt("ZipCode.ZipCodeId");
				ZipCode zip = zipDao.getZipCodeByZipCodeId(zipId);
				Restaurants restaurant  = new Restaurants(name, address, longitude, latitude, zip);
				restaurants.add(restaurant);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			if(connection != null) {
				connection.close();
			}
			if(selectStmt != null) {
				selectStmt.close();
			}
			if(results != null) {
				results.close();
			}
		}
		return restaurants;
	}
	
	
	public ThingsToDo delete(ThingsToDo thingsToDo) throws SQLException {
		String deleteThingsToDo = "DELETE FROM ThingsToDo WHERE Name=?;";
		Connection connection = null;
		PreparedStatement deleteStmt = null;
		try {
			connection = connectionManager.getConnection();
			deleteStmt = connection.prepareStatement(deleteThingsToDo);
			deleteStmt.setString(1, thingsToDo.getName());
			deleteStmt.executeUpdate();

			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			if(connection != null) {
				connection.close();
			}
			if(deleteStmt != null) {
				deleteStmt.close();
			}
		}
	}
}
