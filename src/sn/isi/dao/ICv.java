package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Cv;

public interface ICv {
	public int add(Cv cv);
    public int delete(int id) ;
    public int update(Cv cv);
    public List<Cv> getAll();
    public Cv get(int id);

}
