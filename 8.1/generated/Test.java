
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for test complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="test">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}mutes" minOccurs="0"/>
 *         &lt;element ref="{}investigations" minOccurs="0"/>
 *         &lt;element name="testOccurrences" type="{}HReference" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
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
@XmlType(name = "test", propOrder = {
    "mutes",
    "investigations",
    "testOccurrences"
})
public class Test {

    protected Mutes mutes;
    protected Investigations investigations;
    protected HReference testOccurrences;
    @XmlAttribute(name = "id", required = true)
    protected long id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "href")
    protected String href;

    /**
     * Gets the value of the mutes property.
     * 
     * @return
     *     possible object is
     *     {@link Mutes }
     *     
     */
    public Mutes getMutes() {
        return mutes;
    }

    /**
     * Sets the value of the mutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mutes }
     *     
     */
    public void setMutes(Mutes value) {
        this.mutes = value;
    }

    /**
     * Gets the value of the investigations property.
     * 
     * @return
     *     possible object is
     *     {@link Investigations }
     *     
     */
    public Investigations getInvestigations() {
        return investigations;
    }

    /**
     * Sets the value of the investigations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Investigations }
     *     
     */
    public void setInvestigations(Investigations value) {
        this.investigations = value;
    }

    /**
     * Gets the value of the testOccurrences property.
     * 
     * @return
     *     possible object is
     *     {@link HReference }
     *     
     */
    public HReference getTestOccurrences() {
        return testOccurrences;
    }

    /**
     * Sets the value of the testOccurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link HReference }
     *     
     */
    public void setTestOccurrences(HReference value) {
        this.testOccurrences = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
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
