
package stubs.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vcs-roots complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vcs-roots">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vcs-root" type="{}vcs-root-ref" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="nextHref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prevHref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vcs-roots", propOrder = {
    "vcsRoot"
})
public class VcsRoots {

    @XmlElement(name = "vcs-root")
    protected List<VcsRootRef> vcsRoot;
    @XmlAttribute(name = "count", required = true)
    protected long count;
    @XmlAttribute(name = "nextHref")
    protected String nextHref;
    @XmlAttribute(name = "prevHref")
    protected String prevHref;

    /**
     * Gets the value of the vcsRoot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vcsRoot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVcsRoot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VcsRootRef }
     * 
     * 
     */
    public List<VcsRootRef> getVcsRoot() {
        if (vcsRoot == null) {
            vcsRoot = new ArrayList<VcsRootRef>();
        }
        return this.vcsRoot;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(long value) {
        this.count = value;
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
