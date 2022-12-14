
package services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @param password
     * @param id
     * @param userRole
     * @param nom
     * @param prenom
     * @param email
     * @param telnum
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "update", targetNamespace = "http://service/", className = "services.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://service/", className = "services.UpdateResponse")
    @Action(input = "http://service/UserService/updateRequest", output = "http://service/UserService/updateResponse")
    public int update(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "nom", targetNamespace = "")
        String nom,
        @WebParam(name = "prenom", targetNamespace = "")
        String prenom,
        @WebParam(name = "telnum", targetNamespace = "")
        String telnum,
        @WebParam(name = "user_role", targetNamespace = "")
        String userRole);

    /**
     * 
     * @param email
     * @return
     *     returns services.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "find", targetNamespace = "http://service/", className = "services.Find")
    @ResponseWrapper(localName = "findResponse", targetNamespace = "http://service/", className = "services.FindResponse")
    @Action(input = "http://service/UserService/findRequest", output = "http://service/UserService/findResponse")
    public User find(
        @WebParam(name = "email", targetNamespace = "")
        String email);

    /**
     * 
     * @return
     *     returns java.util.List<services.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "lister", targetNamespace = "http://service/", className = "services.Lister")
    @ResponseWrapper(localName = "listerResponse", targetNamespace = "http://service/", className = "services.ListerResponse")
    @Action(input = "http://service/UserService/listerRequest", output = "http://service/UserService/listerResponse")
    public List<User> lister();

    /**
     * 
     * @param email
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "autoriser", targetNamespace = "http://service/", className = "services.Autoriser")
    @ResponseWrapper(localName = "autoriserResponse", targetNamespace = "http://service/", className = "services.AutoriserResponse")
    @Action(input = "http://service/UserService/autoriserRequest", output = "http://service/UserService/autoriserResponse")
    public int autoriser(
        @WebParam(name = "email", targetNamespace = "")
        String email);

    /**
     * 
     * @param email
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bloquer", targetNamespace = "http://service/", className = "services.Bloquer")
    @ResponseWrapper(localName = "bloquerResponse", targetNamespace = "http://service/", className = "services.BloquerResponse")
    @Action(input = "http://service/UserService/bloquerRequest", output = "http://service/UserService/bloquerResponse")
    public int bloquer(
        @WebParam(name = "email", targetNamespace = "")
        String email);

    /**
     * 
     * @param email
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sup", targetNamespace = "http://service/", className = "services.Sup")
    @ResponseWrapper(localName = "supResponse", targetNamespace = "http://service/", className = "services.SupResponse")
    @Action(input = "http://service/UserService/supRequest", output = "http://service/UserService/supResponse")
    public int sup(
        @WebParam(name = "email", targetNamespace = "")
        String email);

    /**
     * 
     * @param password
     * @param userRole
     * @param nom
     * @param prenom
     * @param email
     * @param telnum
     * @param autorized
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "inserer", targetNamespace = "http://service/", className = "services.Inserer")
    @ResponseWrapper(localName = "insererResponse", targetNamespace = "http://service/", className = "services.InsererResponse")
    @Action(input = "http://service/UserService/insererRequest", output = "http://service/UserService/insererResponse")
    public int inserer(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "nom", targetNamespace = "")
        String nom,
        @WebParam(name = "prenom", targetNamespace = "")
        String prenom,
        @WebParam(name = "telnum", targetNamespace = "")
        String telnum,
        @WebParam(name = "user_role", targetNamespace = "")
        String userRole,
        @WebParam(name = "autorized", targetNamespace = "")
        Boolean autorized);

}
