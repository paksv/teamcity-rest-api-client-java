
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for copyOptionsDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="copyOptionsDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="copyAllAssociatedSettings" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "copyOptionsDescription")
@XmlSeeAlso({
    NewBuildTypeDescription.class,
    NewProjectDescription.class
})
public class CopyOptionsDescription {

    @XmlAttribute(name = "copyAllAssociatedSettings")
    protected Boolean copyAllAssociatedSettings;

    /**
     * Gets the value of the copyAllAssociatedSettings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyAllAssociatedSettings() {
        return copyAllAssociatedSettings;
    }

    /**
     * Sets the value of the copyAllAssociatedSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyAllAssociatedSettings(Boolean value) {
        this.copyAllAssociatedSettings = value;
    }

}
