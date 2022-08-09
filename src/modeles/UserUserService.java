package modeles;

import javax.xml.ws.WebServiceException;

import services.*;
import stub.Stub;

public class UserUserService {
    private static Stub stubManager = Stub.getInstanceStub();
    private static UserService stub ;
    private static UserUserService instance = new UserUserService();

    private UserUserService(){
        try{
            stub = stubManager.getInstanceUserService();
        } catch(WebServiceException e){
            System.err.println("Erreur de connexion au niveau du stub UserUserService : "+e.getMessage());
        }
    }

    public static UserUserService getInstanceUserUserService() throws WebServiceException{
        if(instance != null)
            return instance;
        else 
            throw new WebServiceException("Erreur d'initialisation d'instance de stub UUserService !");
    }

    public AutoriserResponse autoriser(Autoriser requete){
        AutoriserResponse reponse = new AutoriserResponse();
        reponse.setReturn(stub.autoriser(requete.getEmail()));
        return reponse ;
    }
    public BloquerResponse bloquer(Bloquer requete){
        BloquerResponse reponse = new BloquerResponse();
        reponse.setReturn(stub.bloquer(requete.getEmail()));
        return reponse ;
    }
    public FindResponse find(Find requete){
        FindResponse reponse = new FindResponse();
        reponse.setReturn(stub.find(requete.getEmail()));
        return reponse ;
    }
    public InsererResponse inserer(Inserer requete){
        InsererResponse reponse = new InsererResponse();
        reponse.setReturn(stub.inserer(requete.getEmail(),requete.getPassword(),requete.getNom(),requete.getPrenom(), requete.getTelnum(), requete.getUserRole(),requete.isAutorized()));
        return reponse ;
    }
    public ListerResponse lister(){
        ListerResponse reponse = new ListerResponse();
        reponse.setReturn(stub.lister());
        return reponse ;
    }
    public SupResponse sup(Sup requete){
        SupResponse reponse = new SupResponse();
        reponse.setReturn(stub.sup(requete.getEmail()));
        return reponse ;
    }
    public UpdateResponse update(Update requete){
        UpdateResponse reponse = new UpdateResponse();
        reponse.setReturn(stub.update(requete.getId(), requete.getEmail(), requete.getPassword(), requete.getNom(), requete.getPrenom(), requete.getTelnum(), requete.getUserRole()));
        return reponse ;
    }

}
