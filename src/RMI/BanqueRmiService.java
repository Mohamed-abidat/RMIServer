package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.Compte;

public class BanqueRmiService extends UnicastRemoteObject implements IBanqueRemote{

	public BanqueRmiService() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double conversio(double mt) throws RemoteException {
		System.out.println("Conversion du montant "+mt);
		return mt*200;
	}

	@Override
	public Compte consulterCompte(int code) throws RemoteException {
		System.out.println("Consultation du compte "+code);
		Compte cp=new Compte(1, Math.random()*9000, new Date());
		return cp;
	}

	@Override
	public List<Compte> ListComptes() throws RemoteException {
		System.out.println("Consultations des comptes");
		List<Compte> cptes=new ArrayList<Compte>();
		cptes.add(new Compte(1, Math.random()*9000, new Date()));
		cptes.add(new Compte(2, Math.random()*9000, new Date()));
		cptes.add(new Compte(3, Math.random()*9000, new Date()));
		return cptes;
	}

}
