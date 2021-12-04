package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Demandeur;


public interface IDemandeur {
	public int add(Demandeur dem);
    public int delete(int id) ;
    public int update(Demandeur dem);
    public List<Demandeur> getAll();
    public Demandeur get(int id);
    public Demandeur login(String email, String password);


}
