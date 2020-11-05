
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import RMI.BanqueRmiService;

public class ServeurRMI {

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			BanqueRmiService od=new BanqueRmiService();
			System.out.println(od.toString());
			Naming.rebind("rmi://localhost:1099/BK", od);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
