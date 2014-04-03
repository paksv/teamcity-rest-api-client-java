
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for investigationScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="investigationScope">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buildType" type="{}buildType-ref" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "investigationScope", propOrder = {
    "buildType"
})
public class InvestigationScope {

    protected BuildTypeRef buildType;

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

}
