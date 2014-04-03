
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for build complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="build">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="running-info" type="{}runningBuildInfo" minOccurs="0"/>
 *         &lt;element name="statusText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buildType" type="{}buildType-ref" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finishDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agent" type="{}agent-ref" minOccurs="0"/>
 *         &lt;element name="comment" type="{}comment" minOccurs="0"/>
 *         &lt;element ref="{}tags" minOccurs="0"/>
 *         &lt;element name="pinInfo" type="{}comment" minOccurs="0"/>
 *         &lt;element name="user" type="{}user-ref" minOccurs="0"/>
 *         &lt;element ref="{}properties" minOccurs="0"/>
 *         &lt;element name="snapshot-dependencies" type="{}buildsList" minOccurs="0"/>
 *         &lt;element name="artifact-dependencies" type="{}buildsList" minOccurs="0"/>
 *         &lt;element name="revisions" type="{}revisions" minOccurs="0"/>
 *         &lt;element name="triggered" type="{}triggeredBy" minOccurs="0"/>
 *         &lt;element name="changes" type="{}changes-ref" minOccurs="0"/>
 *         &lt;element name="relatedIssues" type="{}issueUsages" minOccurs="0"/>
 *         &lt;element name="artifacts" type="{}HReference" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="webUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultBranch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="unspecifiedBranch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="personal" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="history" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="pinned" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="running" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "build", propOrder = {
    "runningInfo",
    "statusText",
    "buildType",
    "startDate",
    "finishDate",
    "agent",
    "comment",
    "tags",
    "pinInfo",
    "user",
    "properties",
    "snapshotDependencies",
    "artifactDependencies",
    "revisions",
    "triggered",
    "changes",
    "relatedIssues",
    "artifacts"
})
public class Build {

    @XmlElement(name = "running-info")
    protected RunningBuildInfo runningInfo;
    protected String statusText;
    protected BuildTypeRef buildType;
    protected String startDate;
    protected String finishDate;
    protected AgentRef agent;
    protected Comment comment;
    protected Tags tags;
    protected Comment pinInfo;
    protected UserRef user;
    protected Properties properties;
    @XmlElement(name = "snapshot-dependencies")
    protected BuildsList snapshotDependencies;
    @XmlElement(name = "artifact-dependencies")
    protected BuildsList artifactDependencies;
    protected Revisions revisions;
    protected TriggeredBy triggered;
    protected ChangesRef changes;
    protected IssueUsages relatedIssues;
    protected HReference artifacts;
    @XmlAttribute(name = "id", required = true)
    protected long id;
    @XmlAttribute(name = "number")
    protected String number;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "webUrl")
    protected String webUrl;
    @XmlAttribute(name = "branchName")
    protected String branchName;
    @XmlAttribute(name = "defaultBranch")
    protected Boolean defaultBranch;
    @XmlAttribute(name = "unspecifiedBranch")
    protected Boolean unspecifiedBranch;
    @XmlAttribute(name = "personal", required = true)
    protected boolean personal;
    @XmlAttribute(name = "history", required = true)
    protected boolean history;
    @XmlAttribute(name = "pinned", required = true)
    protected boolean pinned;
    @XmlAttribute(name = "running")
    protected Boolean running;

    /**
     * Gets the value of the runningInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RunningBuildInfo }
     *     
     */
    public RunningBuildInfo getRunningInfo() {
        return runningInfo;
    }

    /**
     * Sets the value of the runningInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunningBuildInfo }
     *     
     */
    public void setRunningInfo(RunningBuildInfo value) {
        this.runningInfo = value;
    }

    /**
     * Gets the value of the statusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusText() {
        return statusText;
    }

    /**
     * Sets the value of the statusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusText(String value) {
        this.statusText = value;
    }

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
     * Gets the value of the finishDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishDate() {
        return finishDate;
    }

    /**
     * Sets the value of the finishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishDate(String value) {
        this.finishDate = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link AgentRef }
     *     
     */
    public AgentRef getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentRef }
     *     
     */
    public void setAgent(AgentRef value) {
        this.agent = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setComment(Comment value) {
        this.comment = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link Tags }
     *     
     */
    public Tags getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tags }
     *     
     */
    public void setTags(Tags value) {
        this.tags = value;
    }

    /**
     * Gets the value of the pinInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getPinInfo() {
        return pinInfo;
    }

    /**
     * Sets the value of the pinInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setPinInfo(Comment value) {
        this.pinInfo = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserRef }
     *     
     */
    public UserRef getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRef }
     *     
     */
    public void setUser(UserRef value) {
        this.user = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setProperties(Properties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the snapshotDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link BuildsList }
     *     
     */
    public BuildsList getSnapshotDependencies() {
        return snapshotDependencies;
    }

    /**
     * Sets the value of the snapshotDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildsList }
     *     
     */
    public void setSnapshotDependencies(BuildsList value) {
        this.snapshotDependencies = value;
    }

    /**
     * Gets the value of the artifactDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link BuildsList }
     *     
     */
    public BuildsList getArtifactDependencies() {
        return artifactDependencies;
    }

    /**
     * Sets the value of the artifactDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildsList }
     *     
     */
    public void setArtifactDependencies(BuildsList value) {
        this.artifactDependencies = value;
    }

    /**
     * Gets the value of the revisions property.
     * 
     * @return
     *     possible object is
     *     {@link Revisions }
     *     
     */
    public Revisions getRevisions() {
        return revisions;
    }

    /**
     * Sets the value of the revisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revisions }
     *     
     */
    public void setRevisions(Revisions value) {
        this.revisions = value;
    }

    /**
     * Gets the value of the triggered property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeredBy }
     *     
     */
    public TriggeredBy getTriggered() {
        return triggered;
    }

    /**
     * Sets the value of the triggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeredBy }
     *     
     */
    public void setTriggered(TriggeredBy value) {
        this.triggered = value;
    }

    /**
     * Gets the value of the changes property.
     * 
     * @return
     *     possible object is
     *     {@link ChangesRef }
     *     
     */
    public ChangesRef getChanges() {
        return changes;
    }

    /**
     * Sets the value of the changes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangesRef }
     *     
     */
    public void setChanges(ChangesRef value) {
        this.changes = value;
    }

    /**
     * Gets the value of the relatedIssues property.
     * 
     * @return
     *     possible object is
     *     {@link IssueUsages }
     *     
     */
    public IssueUsages getRelatedIssues() {
        return relatedIssues;
    }

    /**
     * Sets the value of the relatedIssues property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueUsages }
     *     
     */
    public void setRelatedIssues(IssueUsages value) {
        this.relatedIssues = value;
    }

    /**
     * Gets the value of the artifacts property.
     * 
     * @return
     *     possible object is
     *     {@link HReference }
     *     
     */
    public HReference getArtifacts() {
        return artifacts;
    }

    /**
     * Sets the value of the artifacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link HReference }
     *     
     */
    public void setArtifacts(HReference value) {
        this.artifacts = value;
    }

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
     * Gets the value of the personal property.
     * 
     */
    public boolean isPersonal() {
        return personal;
    }

    /**
     * Sets the value of the personal property.
     * 
     */
    public void setPersonal(boolean value) {
        this.personal = value;
    }

    /**
     * Gets the value of the history property.
     * 
     */
    public boolean isHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     */
    public void setHistory(boolean value) {
        this.history = value;
    }

    /**
     * Gets the value of the pinned property.
     * 
     */
    public boolean isPinned() {
        return pinned;
    }

    /**
     * Sets the value of the pinned property.
     * 
     */
    public void setPinned(boolean value) {
        this.pinned = value;
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

}
