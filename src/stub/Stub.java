package stub;

import javax.xml.ws.WebServiceException;

import services.*;

public class Stub {
    private AuthentificationService authws = null ;
    private UserService userws = null ;
    private static Stub stub = null ;

    private Stub(){
        try{
            this.authws = new AuthentificationWS().getAuthentificationServicePort();
            this.userws = new UserWS().getUserServicePort();
        } catch(WebServiceException e) {
            System.out.println("Probleme de connexion au niveau du stub : "+e.getMessage());
        }
            
    }

    public static Stub getInstanceStub(){
        if(stub == null)
            stub = new Stub();
        return stub ;
    }

    public AuthentificationService getInstanceAuth(){
        return authws ;
    }

    public UserService getInstanceUserService(){
        return userws;
    }

}


