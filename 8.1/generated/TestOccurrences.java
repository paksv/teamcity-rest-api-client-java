
package stubs.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testOccurrences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testOccurrences">
 *   &lt;complexContent>
 *     &lt;extension base="{}occurrencesSummary">
 *       &lt;sequence>
 *         &lt;element ref="{}testOccurrence" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nextHref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prevHref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testOccurrences", propOrder = {
    "testOccurrence"
})
public class TestOccurrences
    extends OccurrencesSummary
{

    protected List<TestOccurrence> testOccurrence;
    @XmlAttribute(name = "count")
    protected Integer count;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "nextHref")
    protected String nextHref;
    @XmlAttribute(name = "prevHref")
    protected String prevHref;

    /**
     * Gets the value of the testOccurrence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testOccurrence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestOccurrence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestOccurrence }
     * 
     * 
     */
    public List<TestOccurrence> getTestOccurrence() {
        if (testOccurrence == null) {
            testOccurrence = new ArrayList<TestOccurrence>();
        }
        return this.testOccurrence;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
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
     * Gets the value of the nextHref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextHref() {
        return nextHref;
    }

    /**
     * Sets the value of the nextHref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextHref(String value) {
        this.nextHref = value;
    }

    /**
     * Gets the value of the prevHref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevHref() {
        return prevHref;
    }

    /**
     * Sets the value of the prevHref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevHref(String value) {
        this.prevHref = value;
    }

}
