package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Offre;

public interface IOffre {
	public int add(Offre offre);
    public int delete(int id) ;
    public int update(Offre offre);
    public List<Offre> getAll();
    public Offre get(int id);

}
