
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for revision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="revision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vcs-root-instance" type="{}vcs-root-instance-ref" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="internalVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "revision", propOrder = {
    "vcsRootInstance"
})
public class Revision {

    @XmlElement(name = "vcs-root-instance")
    protected VcsRootInstanceRef vcsRootInstance;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "internalVersion")
    protected String internalVersion;

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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the internalVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalVersion() {
        return internalVersion;
    }

    /**
     * Sets the value of the internalVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalVersion(String value) {
        this.internalVersion = value;
    }

}
