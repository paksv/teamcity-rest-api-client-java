
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for newBuildTypeDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="newBuildTypeDescription">
 *   &lt;complexContent>
 *     &lt;extension base="{}copyOptionsDescription">
 *       &lt;sequence>
 *         &lt;element name="sourceBuildType" type="{}buildType-ref" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourceBuildTypeLocator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "newBuildTypeDescription", propOrder = {
    "sourceBuildType"
})
public class NewBuildTypeDescription
    extends CopyOptionsDescription
{

    protected BuildTypeRef sourceBuildType;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "sourceBuildTypeLocator")
    protected String sourceBuildTypeLocator;

    /**
     * Gets the value of the sourceBuildType property.
     * 
     * @return
     *     possible object is
     *     {@link BuildTypeRef }
     *     
     */
    public BuildTypeRef getSourceBuildType() {
        return sourceBuildType;
    }

    /**
     * Sets the value of the sourceBuildType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildTypeRef }
     *     
     */
    public void setSourceBuildType(BuildTypeRef value) {
        this.sourceBuildType = value;
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
     * Gets the value of the sourceBuildTypeLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceBuildTypeLocator() {
        return sourceBuildTypeLocator;
    }

    /**
     * Sets the value of the sourceBuildTypeLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceBuildTypeLocator(String value) {
        this.sourceBuildTypeLocator = value;
    }

}
