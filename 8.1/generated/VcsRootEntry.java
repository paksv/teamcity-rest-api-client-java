
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vcs-root-entry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vcs-root-entry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vcs-root" type="{}vcs-root-ref" minOccurs="0"/>
 *         &lt;element name="checkout-rules" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vcs-root-entry", propOrder = {
    "vcsRoot",
    "checkoutRules"
})
public class VcsRootEntry {

    @XmlElement(name = "vcs-root")
    protected VcsRootRef vcsRoot;
    @XmlElement(name = "checkout-rules")
    protected String checkoutRules;
    @XmlAttribute(name = "id")
    protected String id;

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
     * Gets the value of the checkoutRules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckoutRules() {
        return checkoutRules;
    }

    /**
     * Sets the value of the checkoutRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckoutRules(String value) {
        this.checkoutRules = value;
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

}
