package sn.isi.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sn.isi.entities.User;

public class UserImpl implements IUser{
	public DB db = new DB();
	private int ok;
	@Override
	public int add(User user) {
		try {
	        String sql = "INSERT INTO user VALUES(NULL, ?, ?, ?, ?, ?)";
	        db.init(sql);
	        db.getPstm().setString(1, user.getNom());
	        db.getPstm().setString(2, user.getPrenom());
	        db.getPstm().setString(3, user.getEmail());
	        db.getPstm().setString(4, user.getPassword());
	        db.getPstm().setString(5, user.getProfil());
	         int ok = db.executeUpdate();
	        
			}catch (Exception ex){  
				ex.printStackTrace();
			}
			return ok;
	}

	@Override
	public int delete(int id) {
		try {
			db.open();
	        String sql = "DELETE FROM user WHERE id = ?";
	        db.init(sql);
	        db.getPstm().setInt(1, id);
	        int ok = db.executeUpdate();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
	        return ok;
	}

	@Override
	public int update(User user) {
		try {
		db.open();
        String sql = "UPDATE user SET nom = ?, prenom = ?, email = ?, password = ? WHERE id = ?";
        db.init(sql);
        db.getPstm().setString(1, user.getNom());
        db.getPstm().setString(2, user.getPrenom());
        db.getPstm().setString(3, user.getEmail());
        db.getPstm().setString(4, user.getPassword());
        db.getPstm().setString(5, user.getProfil());
        db.getPstm().setInt(6, user.getId());
        int ok = db.executeUpdate();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
        return ok;
	}

	@Override
	public List<User> getAll() {
			List<User> users = new ArrayList<User>();
			try {
	        db.open();
	        String sql = "SELECT * FROM user";
	        db.init(sql);
	        ResultSet rs = db.executeSelect();
	        while (rs.next()) {
	            User user = new User();
	            user.setId(rs.getInt(1));
	            user.setNom(rs.getString(2));
	            user.setPrenom(rs.getString(3));
	            user.setEmail(rs.getString(4));
	            user.setPassword(rs.getString(5));
	            user.setProfil(rs.getString(6));
	            users.add(user);
	        }
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	        return users; 	
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(String email, String password) {
		User user = null;
		 try {
	        db.open();
	        String sql = "SELECT * FROM user WHERE email = ? AND password = ?";
	        db.init(sql);
	        db.getPstm().setString(1, email);
	        db.getPstm().setString(2, password);
	        ResultSet rs = db.executeSelect();
	        if (rs.next()) {
	            user = new User();
	            user.setId(rs.getInt(1));
	            user.setNom(rs.getString(2));
	            user.setPrenom(rs.getString(3));
	            user.setEmail(rs.getString(4));
	            user.setPassword(rs.getString(5));
	            user.setProfil(rs.getString(6));
	            
	        }
		 }catch(Exception ex) {
			 ex.printStackTrace();
		 }
	        return user;
	    }
}

	

