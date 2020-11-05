package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import metier.Compte;

public interface IBanqueRemote extends Remote{
	public double conversio(double mt)throws RemoteException;
	public Compte consulterCompte(int code)throws RemoteException;
	public List<Compte> ListComptes() throws RemoteException;
	}
