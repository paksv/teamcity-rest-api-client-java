
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vcs-root complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vcs-root">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}project" minOccurs="0"/>
 *         &lt;element ref="{}properties" minOccurs="0"/>
 *         &lt;element name="vcsRootInstances" type="{}HReference" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vcsName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="modificationCheckInterval" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastChecked" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "vcs-root", propOrder = {
    "project",
    "properties",
    "vcsRootInstances"
})
public class VcsRoot {

    protected Project project;
    protected Properties properties;
    protected HReference vcsRootInstances;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "internalId")
    protected Long internalId;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "vcsName")
    protected String vcsName;
    @XmlAttribute(name = "modificationCheckInterval")
    protected Integer modificationCheckInterval;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "lastChecked")
    protected String lastChecked;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "projectLocator")
    protected String projectLocator;

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link Project }
     *     
     */
    public Project getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setProject(Project value) {
        this.project = value;
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
     * Gets the value of the vcsRootInstances property.
     * 
     * @return
     *     possible object is
     *     {@link HReference }
     *     
     */
    public HReference getVcsRootInstances() {
        return vcsRootInstances;
    }

    /**
     * Sets the value of the vcsRootInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link HReference }
     *     
     */
    public void setVcsRootInstances(HReference value) {
        this.vcsRootInstances = value;
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
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInternalId(Long value) {
        this.internalId = value;
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
     * Gets the value of the modificationCheckInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getModificationCheckInterval() {
        return modificationCheckInterval;
    }

    /**
     * Sets the value of the modificationCheckInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModificationCheckInterval(Integer value) {
        this.modificationCheckInterval = value;
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
