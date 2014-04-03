
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for change complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="change">
 *   &lt;complexContent>
 *     &lt;extension base="{}change-ref">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user" type="{}user-ref" minOccurs="0"/>
 *         &lt;element name="files" type="{}fileChanges" minOccurs="0"/>
 *         &lt;element name="vcsRootInstance" type="{}vcs-root-instance-ref" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="personal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "change", propOrder = {
    "comment",
    "user",
    "files",
    "vcsRootInstance"
})
public class Change
    extends ChangeRef
{

    protected String comment;
    protected UserRef user;
    protected FileChanges files;
    protected VcsRootInstanceRef vcsRootInstance;
    @XmlAttribute(name = "username")
    protected String username;
    @XmlAttribute(name = "date")
    protected String date;
    @XmlAttribute(name = "personal")
    protected Boolean personal;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserRef }
     *     
     */
    public UserRef getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRef }
     *     
     */
    public void setUser(UserRef value) {
        this.user = value;
    }

    /**
     * Gets the value of the files property.
     * 
     * @return
     *     possible object is
     *     {@link FileChanges }
     *     
     */
    public FileChanges getFiles() {
        return files;
    }

    /**
     * Sets the value of the files property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileChanges }
     *     
     */
    public void setFiles(FileChanges value) {
        this.files = value;
    }

    /**
     * Gets the value of the vcsRootInstance property.
     * 
     * @return
     *     possible object is
     *     {@link VcsRootInstanceRef }
     *     
     */
    public VcsRootInstanceRef getVcsRootInstance() {
        return vcsRootInstance;
    }

    /**
     * Sets the value of the vcsRootInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link VcsRootInstanceRef }
     *     
     */
    public void setVcsRootInstance(VcsRootInstanceRef value) {
        this.vcsRootInstance = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the personal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonal() {
        return personal;
    }

    /**
     * Sets the value of the personal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonal(Boolean value) {
        this.personal = value;
    }

}
