
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for build-ref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="build-ref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="running" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="percentageComplete" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="buildTypeId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultBranch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="unspecifiedBranch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="webUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "build-ref")
public class BuildRef {

    @XmlAttribute(name = "id", required = true)
    protected long id;
    @XmlAttribute(name = "number")
    protected String number;
    @XmlAttribute(name = "running")
    protected Boolean running;
    @XmlAttribute(name = "percentageComplete")
    protected Integer percentageComplete;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "buildTypeId")
    protected String buildTypeId;
    @XmlAttribute(name = "branchName")
    protected String branchName;
    @XmlAttribute(name = "defaultBranch")
    protected Boolean defaultBranch;
    @XmlAttribute(name = "unspecifiedBranch")
    protected Boolean unspecifiedBranch;
    @XmlAttribute(name = "startDate")
    protected String startDate;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "webUrl")
    protected String webUrl;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the running property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRunning() {
        return running;
    }

    /**
     * Sets the value of the running property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunning(Boolean value) {
        this.running = value;
    }

    /**
     * Gets the value of the percentageComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPercentageComplete() {
        return percentageComplete;
    }

    /**
     * Sets the value of the percentageComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPercentageComplete(Integer value) {
        this.percentageComplete = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the buildTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildTypeId() {
        return buildTypeId;
    }

    /**
     * Sets the value of the buildTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildTypeId(String value) {
        this.buildTypeId = value;
    }

    /**
     * Gets the value of the branchName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the defaultBranch property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDefaultBranch() {
        return defaultBranch;
    }

    /**
     * Sets the value of the defaultBranch property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDefaultBranch(Boolean value) {
        this.defaultBranch = value;
    }

    /**
     * Gets the value of the unspecifiedBranch property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isUnspecifiedBranch() {
        return unspecifiedBranch;
    }

    /**
     * Sets the value of the unspecifiedBranch property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setUnspecifiedBranch(Boolean value) {
        this.unspecifiedBranch = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
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
     * Gets the value of the webUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * Sets the value of the webUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUrl(String value) {
        this.webUrl = value;
    }

}
