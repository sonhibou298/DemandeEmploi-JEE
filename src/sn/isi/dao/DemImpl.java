package sn.isi.dao;

import java.sql.ResultSet;
import java.util.List;

import sn.isi.entities.Demandeur;
import sn.isi.entities.Entreprise;

public class DemImpl implements IDemandeur {
	public DB db = new DB();
	private int ok;

	@Override
	public int add(Demandeur dem) {
		try {
	        String sql = "INSERT INTO demandeur VALUES(NULL, ?, ?, ?, ?)";
	        db.init(sql);
	        db.getPstm().setString(1, dem.getNom());
	        db.getPstm().setString(2, dem.getPrenom());
	        db.getPstm().setString(3, dem.getEmail());
	        db.getPstm().setString(4, dem.getPassword());
	        int ok = db.executeUpdate();
	        
			}catch (Exception ex){  
				ex.printStackTrace();
			}
			return ok;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Demandeur dem) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Demandeur> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Demandeur get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Demandeur login(String email, String password) {
		Demandeur dem= null;
		 try {
	        db.open();
	        String sql = "SELECT * FROM demandeur WHERE email = ? AND password = ?";
	        db.init(sql);
	        db.getPstm().setString(1, email);
	        db.getPstm().setString(2, password);
	        ResultSet rs = db.executeSelect();
	        if (rs.next()) {
	            dem =  new Demandeur();
	            dem.setId(rs.getInt(1));
	            dem.setNom(rs.getString(2));
	            dem.setEmail(rs.getString(3));
	            dem.setPassword(rs.getString(4));
	           
	            
	        }
		 }catch(Exception ex) {
			 ex.printStackTrace();
		 }
	        return dem;
	    }
		
	

}
