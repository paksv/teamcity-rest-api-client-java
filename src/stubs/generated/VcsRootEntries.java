
package stubs.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vcsRootEntries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vcsRootEntries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}vcs-root-entry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vcsRootEntries", propOrder = {
    "vcsRootEntry"
})
public class VcsRootEntries {

    @XmlElement(name = "vcs-root-entry")
    protected List<VcsRootEntry> vcsRootEntry;

    /**
     * Gets the value of the vcsRootEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vcsRootEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVcsRootEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VcsRootEntry }
     * 
     * 
     */
    public List<VcsRootEntry> getVcsRootEntry() {
        if (vcsRootEntry == null) {
            vcsRootEntry = new ArrayList<VcsRootEntry>();
        }
        return this.vcsRootEntry;
    }

}
