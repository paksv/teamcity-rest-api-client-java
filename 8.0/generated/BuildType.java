
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buildType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="buildType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="project" type="{}project-ref" minOccurs="0"/>
 *         &lt;element name="template" type="{}buildType-ref" minOccurs="0"/>
 *         &lt;element name="builds" type="{}builds-ref" minOccurs="0"/>
 *         &lt;element ref="{}vcs-root-entries" minOccurs="0"/>
 *         &lt;element ref="{}vcs-labeling" minOccurs="0"/>
 *         &lt;element name="settings" type="{}properties" minOccurs="0"/>
 *         &lt;element name="parameters" type="{}properties" minOccurs="0"/>
 *         &lt;element ref="{}steps" minOccurs="0"/>
 *         &lt;element ref="{}features" minOccurs="0"/>
 *         &lt;element ref="{}triggers" minOccurs="0"/>
 *         &lt;element ref="{}snapshot-dependencies" minOccurs="0"/>
 *         &lt;element ref="{}artifact-dependencies" minOccurs="0"/>
 *         &lt;element ref="{}agent-requirements" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="templateFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="webUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paused" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buildType", propOrder = {
    "project",
    "template",
    "builds",
    "vcsRootEntries",
    "vcsLabeling",
    "settings",
    "parameters",
    "steps",
    "features",
    "triggers",
    "snapshotDependencies",
    "artifactDependencies",
    "agentRequirements"
})
public class BuildType {

    protected ProjectRef project;
    protected BuildTypeRef template;
    protected BuildsRef builds;
    @XmlElement(name = "vcs-root-entries")
    protected VcsRootEntries vcsRootEntries;
    @XmlElement(name = "vcs-labeling")
    protected VcsLabelingOptions vcsLabeling;
    protected Properties settings;
    protected Properties parameters;
    protected PropEntitiesStep steps;
    protected PropEntitiesFeature features;
    protected PropEntitiesTrigger triggers;
    @XmlElement(name = "snapshot-dependencies")
    protected PropEntitiesSnapshotDep snapshotDependencies;
    @XmlElement(name = "artifact-dependencies")
    protected PropEntitiesArtifactDep artifactDependencies;
    @XmlElement(name = "agent-requirements")
    protected PropEntitiesAgentRequirement agentRequirements;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "templateFlag")
    protected Boolean templateFlag;
    @XmlAttribute(name = "webUrl")
    protected String webUrl;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "paused")
    protected Boolean paused;

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectRef }
     *     
     */
    public ProjectRef getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectRef }
     *     
     */
    public void setProject(ProjectRef value) {
        this.project = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link BuildTypeRef }
     *     
     */
    public BuildTypeRef getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildTypeRef }
     *     
     */
    public void setTemplate(BuildTypeRef value) {
        this.template = value;
    }

    /**
     * Gets the value of the builds property.
     * 
     * @return
     *     possible object is
     *     {@link BuildsRef }
     *     
     */
    public BuildsRef getBuilds() {
        return builds;
    }

    /**
     * Sets the value of the builds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildsRef }
     *     
     */
    public void setBuilds(BuildsRef value) {
        this.builds = value;
    }

    /**
     * Gets the value of the vcsRootEntries property.
     * 
     * @return
     *     possible object is
     *     {@link VcsRootEntries }
     *     
     */
    public VcsRootEntries getVcsRootEntries() {
        return vcsRootEntries;
    }

    /**
     * Sets the value of the vcsRootEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link VcsRootEntries }
     *     
     */
    public void setVcsRootEntries(VcsRootEntries value) {
        this.vcsRootEntries = value;
    }

    /**
     * Gets the value of the vcsLabeling property.
     * 
     * @return
     *     possible object is
     *     {@link VcsLabelingOptions }
     *     
     */
    public VcsLabelingOptions getVcsLabeling() {
        return vcsLabeling;
    }

    /**
     * Sets the value of the vcsLabeling property.
     * 
     * @param value
     *     allowed object is
     *     {@link VcsLabelingOptions }
     *     
     */
    public void setVcsLabeling(VcsLabelingOptions value) {
        this.vcsLabeling = value;
    }

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setSettings(Properties value) {
        this.settings = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setParameters(Properties value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the steps property.
     * 
     * @return
     *     possible object is
     *     {@link PropEntitiesStep }
     *     
     */
    public PropEntitiesStep getSteps() {
        return steps;
    }

    /**
     * Sets the value of the steps property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropEntitiesStep }
     *     
     */
    public void setSteps(PropEntitiesStep value) {
        this.steps = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link PropEntitiesFeature }
     *     
     */
    public PropEntitiesFeature getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropEntitiesFeature }
     *     
     */
    public void setFeatures(PropEntitiesFeature value) {
        this.features = value;
    }

    /**
     * Gets the value of the triggers property.
     * 
     * @return
     *     possible object is
     *     {@link PropEntitiesTrigger }
     *     
     */
    public PropEntitiesTrigger getTriggers() {
        return triggers;
    }

    /**
     * Sets the value of the triggers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropEntitiesTrigger }
     *     
     */
    public void setTriggers(PropEntitiesTrigger value) {
        this.triggers = value;
    }

    /**
     * Gets the value of the snapshotDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link PropEntitiesSnapshotDep }
     *     
     */
    public PropEntitiesSnapshotDep getSnapshotDependencies() {
        return snapshotDependencies;
    }

    /**
     * Sets the value of the snapshotDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropEntitiesSnapshotDep }
     *     
     */
    public void setSnapshotDependencies(PropEntitiesSnapshotDep value) {
        this.snapshotDependencies = value;
    }

    /**
     * Gets the value of the artifactDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link PropEntitiesArtifactDep }
     *     
     */
    public PropEntitiesArtifactDep getArtifactDependencies() {
        return artifactDependencies;
    }

    /**
     * Sets the value of the artifactDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropEntitiesArtifactDep }
     *     
     */
    public void setArtifactDependencies(PropEntitiesArtifactDep value) {
        this.artifactDependencies = value;
    }

    /**
     * Gets the value of the agentRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link PropEntitiesAgentRequirement }
     *     
     */
    public PropEntitiesAgentRequirement getAgentRequirements() {
        return agentRequirements;
    }

    /**
     * Sets the value of the agentRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropEntitiesAgentRequirement }
     *     
     */
    public void setAgentRequirements(PropEntitiesAgentRequirement value) {
        this.agentRequirements = value;
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
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
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
     * Gets the value of the templateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTemplateFlag() {
        return templateFlag;
    }

    /**
     * Sets the value of the templateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemplateFlag(Boolean value) {
        this.templateFlag = value;
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

    /**
     * Gets the value of the paused property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaused() {
        return paused;
    }

    /**
     * Sets the value of the paused property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaused(Boolean value) {
        this.paused = value;
    }

}
