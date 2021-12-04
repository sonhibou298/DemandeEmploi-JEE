package sn.isi.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sn.isi.entities.Entreprise;
import sn.isi.entities.User;

public class EntrImpl implements IEntreprise {
	public DB db = new DB();
	private int ok;

	@Override
	public int add(Entreprise en) {
		// TODO Auto-generated method stub
		try {
	        String sql = "INSERT INTO entreprise VALUES(NULL, ?, ?, ?, ?, ?)";
	        db.init(sql);
	        db.getPstm().setString(1, en.getNomEntreprise());
	        db.getPstm().setString(2, en.getEmail());
	        db.getPstm().setString(3, en.getPassword());
	        db.getPstm().setInt(4, en.getTelephone());
	        db.getPstm().setString(5, en.getAdresse());
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
	public int update(Entreprise en) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Entreprise> getAll() {
		  List<Entreprise> ese = new ArrayList<Entreprise>();
		  try {
	        db.open();
	        String sql = "SELECT * FROM entreprise";
	        db.init(sql);
	        ResultSet rs = db.executeSelect();
	        while (rs.next()) {
	            Entreprise en = new Entreprise();
	            en.setIdEntreprise(rs.getInt(1));
	            en.setNomEntreprise(rs.getString(2));
	            en.setEmail(rs.getString(3));
	            en.setPassword(rs.getString(4));
	            en.setTelephone(rs.getInt(5));
	            en.setAdresse(rs.getString(6));

	            ese.add(en);
	        }
		  }catch (Exception e) {
			  e.printStackTrace();
		  }
	        return ese;
	}

	@Override
	public Entreprise get(int id) {
		// TODO Auto-generated method stub
		 Entreprise en = null;
		 try {
	        db.open();
	        String sql = "SELECT * FROM entreprise WHERE id = ?";
	        db.init(sql);
	        db.getPstm().setInt(1, id);
	        ResultSet rs = db.executeSelect();
	        if (rs.next()) {
	            en = new Entreprise();
	            en.setIdEntreprise(rs.getInt(1));
	            en.setNomEntreprise(rs.getString(2));
	            en.setEmail(rs.getString(3));
	            en.setPassword(rs.getString(4));
	            en.setAdresse(rs.getString(5));
	        }
		 }catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
	        return en;
	}

	@Override
	public Entreprise login(String email, String password) {
		 Entreprise e = null;
		 try {
	        db.open();
	        String sql = "SELECT * FROM entreprise WHERE email = ? AND password = ?";
	        db.init(sql);
	        db.getPstm().setString(1, email);
	        db.getPstm().setString(2, password);
	        ResultSet rs = db.executeSelect();
	        if (rs.next()) {
	            e =  new Entreprise();
	            e.setIdEntreprise(rs.getInt(1));
	            e.setNomEntreprise(rs.getString(2));
	            e.setEmail(rs.getString(3));
	            e.setPassword(rs.getString(4));
	            e.setTelephone(rs.getInt(5));
	            e.setAdresse(rs.getString(6));
	            
	        }
		 }catch(Exception ex) {
			 ex.printStackTrace();
		 }
	        return e;
	    }
	
	@Override
	public Entreprise findId(String email) {
		Entreprise en = null;
		try {
			db.open();
			String sql = "SELECT idEntreprise FROM entreprise WHERE email = ?";
			db.init(sql);
			db.getPstm().setString(1, email);
			ResultSet rs = db.executeSelect();
	        if (rs.next()) {
	            en =  new Entreprise();
	            //en.setIdEntreprise(rs.getInt(1));
	            en.setNomEntreprise(rs.getString(1));
	            en.setEmail(rs.getString(2));
	            en.setPassword(rs.getString(3));
	            en.setTelephone(rs.getInt(4));
	            en.setAdresse(rs.getString(5));
	        }     
			
		}catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
		return en;
	}
	
	@Override
	public Entreprise findName(String email) {
		Entreprise enN = null;
		try {
			db.open();
			String sql = "SELECT nomEntreprise FROM entreprise WHERE email = ?";
			db.init(sql);
			db.getPstm().setString(1, email);
			ResultSet rs = db.executeSelect();
	        if (rs.next()) {
	            enN =  new Entreprise();
	            enN.setIdEntreprise(rs.getInt(1));
	            enN.setNomEntreprise(rs.getString(2));
	            enN.setEmail(rs.getString(3));
	            enN.setPassword(rs.getString(4));
	            enN.setTelephone(rs.getInt(5));
	            enN.setAdresse(rs.getString(6));
	        }
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	

}
