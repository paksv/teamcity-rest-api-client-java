
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vcs-root-instance-ref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vcs-root-instance-ref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vcs-root-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vcsRootInternalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vcs-root-instance-ref")
public class VcsRootInstanceRef {

    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "vcs-root-id")
    protected String vcsRootId;
    @XmlAttribute(name = "vcsRootInternalId")
    protected String vcsRootInternalId;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "href")
    protected String href;

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
     * Gets the value of the vcsRootId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcsRootId() {
        return vcsRootId;
    }

    /**
     * Sets the value of the vcsRootId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcsRootId(String value) {
        this.vcsRootId = value;
    }

    /**
     * Gets the value of the vcsRootInternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcsRootInternalId() {
        return vcsRootInternalId;
    }

    /**
     * Sets the value of the vcsRootInternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcsRootInternalId(String value) {
        this.vcsRootInternalId = value;
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

}
