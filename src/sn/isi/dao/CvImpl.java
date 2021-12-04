package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Cv;

public class CvImpl implements ICv{
	public DB db = new DB();
	private int ok;

	@Override
	public int add(Cv cv) {
		try {
	        String sql = "INSERT INTO cv VALUES(NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	        db.init(sql);
	        db.getPstm().setString(1, cv.getNom());
	        db.getPstm().setString(2, cv.getPrenom());
	        db.getPstm().setInt(3, cv.getAge());
	        db.getPstm().setString(4, cv.getEmail());
	        db.getPstm().setInt(5, cv.getTelephone());
	        db.getPstm().setString(6, cv.getAdresse());
	        db.getPstm().setString(7, cv.getSpecialite());
	        db.getPstm().setString(8, cv.getNivEtude());
	        db.getPstm().setString(9, cv.getExpProf());
	        db.getPstm().setInt(10, cv.getIdDemandeur());
	        int ok = db.executeUpdate();
	        
			}catch (Exception ex){  
				ex.printStackTrace();
			}
			return ok;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		try {
			 db.open();
		        String sql = "DELETE FROM cv WHERE id = ?";
		        db.init(sql);
		        db.getPstm().setInt(1, id);
		        int ok = db.executeUpdate();
		        
		}catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public int update(Cv cv) {
		try {
			db.open();
	        String sql = "UPDATE cv SET nom = ?, prenom = ?, age = ?, email = ?, telephone = ?, adresse = ?, specialite = ?, nivEtude = ?, expProf = ?  WHERE id = ?";
	        db.init(sql);
	        db.getPstm().setString(1, cv.getNom());
	        db.getPstm().setString(2, cv.getPrenom());
	        db.getPstm().setInt(3, cv.getAge());
	        db.getPstm().setString(4, cv.getEmail());
	        db.getPstm().setInt(5, cv.getTelephone());
	        db.getPstm().setString(6, cv.getAdresse());
	        db.getPstm().setString(7, cv.getSpecialite());
	        db.getPstm().setString(8, cv.getNivEtude());
	        db.getPstm().setString(9, cv.getExpProf());
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return ok;
	}

	@Override
	public List<Cv> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cv get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
