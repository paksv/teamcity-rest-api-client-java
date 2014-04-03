
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for investigation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="investigation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responsible" type="{}user-ref" minOccurs="0"/>
 *         &lt;element name="assignment" type="{}comment" minOccurs="0"/>
 *         &lt;element name="scope" type="{}investigationScope" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "investigation", propOrder = {
    "responsible",
    "assignment",
    "scope"
})
public class Investigation {

    protected UserRef responsible;
    protected Comment assignment;
    protected InvestigationScope scope;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "state")
    protected String state;

    /**
     * Gets the value of the responsible property.
     * 
     * @return
     *     possible object is
     *     {@link UserRef }
     *     
     */
    public UserRef getResponsible() {
        return responsible;
    }

    /**
     * Sets the value of the responsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRef }
     *     
     */
    public void setResponsible(UserRef value) {
        this.responsible = value;
    }

    /**
     * Gets the value of the assignment property.
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getAssignment() {
        return assignment;
    }

    /**
     * Sets the value of the assignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setAssignment(Comment value) {
        this.assignment = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationScope }
     *     
     */
    public InvestigationScope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationScope }
     *     
     */
    public void setScope(InvestigationScope value) {
        this.scope = value;
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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

}
