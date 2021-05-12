package game;

import java.rmi.RemoteException;

import Abstracts.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {
    
    public boolean CheckIfRealPerson(User user) throws Exception {
        KPSPublicSoapProxy client = new KPSPublicSoapProxy();
        try {
        
        return client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),
        		user.getName().toUpperCase(),user.getLastName().toUpperCase()
                ,user.getDateOfBirth().getYear());
    }catch(RemoteException e) {
        e.printStackTrace();
    }
        return false;
    }
	
}