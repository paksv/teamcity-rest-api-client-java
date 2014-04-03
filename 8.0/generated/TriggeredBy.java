
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for triggeredBy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="triggeredBy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{}user-ref" minOccurs="0"/>
 *         &lt;element name="buildType" type="{}buildType-ref" minOccurs="0"/>
 *         &lt;element ref="{}properties" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="details" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rawValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "triggeredBy", propOrder = {
    "user",
    "buildType",
    "properties"
})
public class TriggeredBy {

    protected UserRef user;
    protected BuildTypeRef buildType;
    protected Properties properties;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "details")
    protected String details;
    @XmlAttribute(name = "date")
    protected String date;
    @XmlAttribute(name = "rawValue")
    protected String rawValue;

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
     * Gets the value of the buildType property.
     * 
     * @return
     *     possible object is
     *     {@link BuildTypeRef }
     *     
     */
    public BuildTypeRef getBuildType() {
        return buildType;
    }

    /**
     * Sets the value of the buildType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildTypeRef }
     *     
     */
    public void setBuildType(BuildTypeRef value) {
        this.buildType = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetails(String value) {
        this.details = value;
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
     * Gets the value of the rawValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawValue() {
        return rawValue;
    }

    /**
     * Sets the value of the rawValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawValue(String value) {
        this.rawValue = value;
    }

}
