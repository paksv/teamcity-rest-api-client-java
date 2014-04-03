
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for file complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="file">
 *   &lt;complexContent>
 *     &lt;extension base="{}file-ref">
 *       &lt;sequence>
 *         &lt;element name="parent" type="{}file-ref" minOccurs="0"/>
 *         &lt;element name="content" type="{}HReference" minOccurs="0"/>
 *         &lt;element name="children" type="{}HReference" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="modificationTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "file", propOrder = {
    "parent",
    "content",
    "children"
})
public class File
    extends FileRef
{

    protected FileRef parent;
    protected HReference content;
    protected HReference children;
    @XmlAttribute(name = "size")
    protected Long size;
    @XmlAttribute(name = "modificationTime")
    protected String modificationTime;

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link FileRef }
     *     
     */
    public FileRef getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileRef }
     *     
     */
    public void setParent(FileRef value) {
        this.parent = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link HReference }
     *     
     */
    public HReference getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link HReference }
     *     
     */
    public void setContent(HReference value) {
        this.content = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link HReference }
     *     
     */
    public HReference getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link HReference }
     *     
     */
    public void setChildren(HReference value) {
        this.children = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSize(Long value) {
        this.size = value;
    }

    /**
     * Gets the value of the modificationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationTime() {
        return modificationTime;
    }

    /**
     * Sets the value of the modificationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationTime(String value) {
        this.modificationTime = value;
    }

}
