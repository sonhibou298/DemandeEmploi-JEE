package sn.isi.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sn.isi.entities.Entreprise;
import sn.isi.entities.Offre;

public class OffreImpl implements IOffre{
	public DB db = new DB();
	private int ok;

	@Override
	public int add(Offre offre) {
		// TODO Auto-generated method stub
		try {
	        String sql = "INSERT INTO offre VALUES(NULL, ?, ?)";
	        db.init(sql);
	        db.getPstm().setString(1, offre.getDescription());
	        db.getPstm().setInt(2, offre.getIdEntreprise());
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
	public int update(Offre offre) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Offre> getAll() {
		List<Offre> offres = new ArrayList<Offre>();
		try {
        db.open();
        String sql = "SELECT * FROM offre";
        db.init(sql);
        ResultSet rs = db.executeSelect();
        while (rs.next()) {
            Offre offre = new Offre();
            offre.setIdO(rs.getInt(1));
            offre.setDescription(rs.getString(2));
            offre.setIdEntreprise(rs.getInt(3));
            
            offres.add(offre);
        }
		}catch (Exception e) {
			e.printStackTrace();
		}
        return offres;
	}

	@Override
	public Offre get(int id) {
		Offre offre = null;
		try {
        db.open();  
        String sql = "SELECT * FROM offre WHERE idEntreprise = ?";
        db.init(sql);
        db.getPstm().setInt(1, id);
        ResultSet rs = db.executeSelect();
        if (rs.next()) {
            offre = new Offre();
            offre.setIdO(rs.getInt(1));
            offre.setDescription(rs.getString(2));
            offre.setIdEntreprise(rs.getInt(3));   
        }
        }catch (Exception e) {
			e.printStackTrace();
		}
        return offre;
    
	}

}
