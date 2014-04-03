
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for issueUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="issueUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}changes" minOccurs="0"/>
 *         &lt;element name="issue" type="{}issue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issueUsage", propOrder = {
    "changes",
    "issue"
})
public class IssueUsage {

    protected Changes changes;
    protected Issue issue;

    /**
     * Gets the value of the changes property.
     * 
     * @return
     *     possible object is
     *     {@link Changes }
     *     
     */
    public Changes getChanges() {
        return changes;
    }

    /**
     * Sets the value of the changes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Changes }
     *     
     */
    public void setChanges(Changes value) {
        this.changes = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link Issue }
     *     
     */
    public Issue getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issue }
     *     
     */
    public void setIssue(Issue value) {
        this.issue = value;
    }

}
