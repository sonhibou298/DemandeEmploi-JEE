package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Entreprise;

public interface IEntreprise {
	public int add(Entreprise en);
    public int delete(int id) ;
    public int update(Entreprise en);
    public List<Entreprise> getAll();
    public Entreprise get(int id);
    public Entreprise login(String email, String password);
    public Entreprise findId(String email);
    public Entreprise findName(String email);
}
