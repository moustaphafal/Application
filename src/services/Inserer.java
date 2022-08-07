
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour inserer complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="inserer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autorized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inserer", propOrder = {
    "email",
    "password",
    "nom",
    "prenom",
    "telnum",
    "userRole",
    "autorized"
})
public class Inserer {

    protected String email;
    protected String password;
    protected String nom;
    protected String prenom;
    protected String telnum;
    @XmlElement(name = "user_role")
    protected String userRole;
    protected Boolean autorized;

    /**
     * Obtient la valeur de la propri�t� email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * D�finit la valeur de la propri�t� email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtient la valeur de la propri�t� password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * D�finit la valeur de la propri�t� password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtient la valeur de la propri�t� nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * D�finit la valeur de la propri�t� nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propri�t� prenom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * D�finit la valeur de la propri�t� prenom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenom(String value) {
        this.prenom = value;
    }

    /**
     * Obtient la valeur de la propri�t� telnum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelnum() {
        return telnum;
    }

    /**
     * D�finit la valeur de la propri�t� telnum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelnum(String value) {
        this.telnum = value;
    }

    /**
     * Obtient la valeur de la propri�t� userRole.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * D�finit la valeur de la propri�t� userRole.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRole(String value) {
        this.userRole = value;
    }

    /**
     * Obtient la valeur de la propri�t� autorized.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutorized() {
        return autorized;
    }

    /**
     * D�finit la valeur de la propri�t� autorized.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutorized(Boolean value) {
        this.autorized = value;
    }

}
