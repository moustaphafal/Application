package modeles;

import stub.Stub;
import javax.xml.ws.WebServiceException;
import services.AuthentificationService;
import services.Login;
import services.LoginResponse;

public class UserAuthentification {
    private static Stub stubManager = Stub.getInstanceStub();
    private static AuthentificationService stub ;
    private static UserAuthentification instance = new UserAuthentification();

    private UserAuthentification(){
        try {
            stub = stubManager.getInstanceAuth();
        } catch (WebServiceException e) {
            System.out.println("Erreur de connexion au niveau du stubAuth "+e.getMessage());
        }
    }

    public static UserAuthentification getUserAuthentificationInstance() throws WebServiceException{
        if(instance != null)
            return instance ;
        else 
            throw new WebServiceException("Erreur de connexion au stub ");
    }

    public LoginResponse login(Login requete){
        LoginResponse reponse = new LoginResponse();
        reponse.setReturn(stub.login(requete.getEmail(), requete.getPassword()));
        return reponse ;
    }
    
}
