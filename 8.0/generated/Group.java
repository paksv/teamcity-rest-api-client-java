
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="group">
 *   &lt;complexContent>
 *     &lt;extension base="{}group-ref">
 *       &lt;sequence>
 *         &lt;element name="parent-groups" type="{}groups" minOccurs="0"/>
 *         &lt;element name="child-groups" type="{}groups" minOccurs="0"/>
 *         &lt;element ref="{}users" minOccurs="0"/>
 *         &lt;element ref="{}roles" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "group", propOrder = {
    "parentGroups",
    "childGroups",
    "users",
    "roles"
})
public class Group
    extends GroupRef
{

    @XmlElement(name = "parent-groups")
    protected Groups parentGroups;
    @XmlElement(name = "child-groups")
    protected Groups childGroups;
    protected Users users;
    protected RoleAssignments roles;
    @XmlAttribute(name = "description")
    protected String description;

    /**
     * Gets the value of the parentGroups property.
     * 
     * @return
     *     possible object is
     *     {@link Groups }
     *     
     */
    public Groups getParentGroups() {
        return parentGroups;
    }

    /**
     * Sets the value of the parentGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Groups }
     *     
     */
    public void setParentGroups(Groups value) {
        this.parentGroups = value;
    }

    /**
     * Gets the value of the childGroups property.
     * 
     * @return
     *     possible object is
     *     {@link Groups }
     *     
     */
    public Groups getChildGroups() {
        return childGroups;
    }

    /**
     * Sets the value of the childGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Groups }
     *     
     */
    public void setChildGroups(Groups value) {
        this.childGroups = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link Users }
     *     
     */
    public Users getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link Users }
     *     
     */
    public void setUsers(Users value) {
        this.users = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link RoleAssignments }
     *     
     */
    public RoleAssignments getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleAssignments }
     *     
     */
    public void setRoles(RoleAssignments value) {
        this.roles = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
