
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vcs-root-instance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vcs-root-instance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vcs-root" type="{}vcs-root-ref" minOccurs="0"/>
 *         &lt;element ref="{}properties" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vcsName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastChecked" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastVersionInternal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="projectLocator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vcs-root-instance", propOrder = {
    "vcsRoot",
    "properties"
})
public class VcsRootInstance {

    @XmlElement(name = "vcs-root")
    protected VcsRootRef vcsRoot;
    protected Properties properties;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "vcsName")
    protected String vcsName;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "lastChecked")
    protected String lastChecked;
    @XmlAttribute(name = "lastVersion")
    protected String lastVersion;
    @XmlAttribute(name = "lastVersionInternal")
    protected String lastVersionInternal;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "projectLocator")
    protected String projectLocator;

    /**
     * Gets the value of the vcsRoot property.
     * 
     * @return
     *     possible object is
     *     {@link VcsRootRef }
     *     
     */
    public VcsRootRef getVcsRoot() {
        return vcsRoot;
    }

    /**
     * Sets the value of the vcsRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link VcsRootRef }
     *     
     */
    public void setVcsRoot(VcsRootRef value) {
        this.vcsRoot = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setProperties(Properties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the vcsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcsName() {
        return vcsName;
    }

    /**
     * Sets the value of the vcsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcsName(String value) {
        this.vcsName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the lastChecked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastChecked() {
        return lastChecked;
    }

    /**
     * Sets the value of the lastChecked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChecked(String value) {
        this.lastChecked = value;
    }

    /**
     * Gets the value of the lastVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastVersion() {
        return lastVersion;
    }

    /**
     * Sets the value of the lastVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastVersion(String value) {
        this.lastVersion = value;
    }

    /**
     * Gets the value of the lastVersionInternal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastVersionInternal() {
        return lastVersionInternal;
    }

    /**
     * Sets the value of the lastVersionInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastVersionInternal(String value) {
        this.lastVersionInternal = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the projectLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectLocator() {
        return projectLocator;
    }

    /**
     * Sets the value of the projectLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectLocator(String value) {
        this.projectLocator = value;
    }

}
