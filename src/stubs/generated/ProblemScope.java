
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for problemScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="problemScope">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}project" minOccurs="0"/>
 *         &lt;element ref="{}buildTypes" minOccurs="0"/>
 *         &lt;element ref="{}buildType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "problemScope", propOrder = {
    "project",
    "buildTypes",
    "buildType"
})
public class ProblemScope {

    protected Project project;
    protected BuildTypes buildTypes;
    protected BuildType buildType;

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link Project }
     *     
     */
    public Project getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setProject(Project value) {
        this.project = value;
    }

    /**
     * Gets the value of the buildTypes property.
     * 
     * @return
     *     possible object is
     *     {@link BuildTypes }
     *     
     */
    public BuildTypes getBuildTypes() {
        return buildTypes;
    }

    /**
     * Sets the value of the buildTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildTypes }
     *     
     */
    public void setBuildTypes(BuildTypes value) {
        this.buildTypes = value;
    }

    /**
     * Gets the value of the buildType property.
     * 
     * @return
     *     possible object is
     *     {@link BuildType }
     *     
     */
    public BuildType getBuildType() {
        return buildType;
    }

    /**
     * Sets the value of the buildType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildType }
     *     
     */
    public void setBuildType(BuildType value) {
        this.buildType = value;
    }

}
