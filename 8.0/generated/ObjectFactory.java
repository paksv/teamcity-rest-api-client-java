
package stubs.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AgentRef_QNAME = new QName("", "agent-ref");
    private final static QName _IssuesRef_QNAME = new QName("", "issues-ref");
    private final static QName _Users_QNAME = new QName("", "users");
    private final static QName _VcsRootRef_QNAME = new QName("", "vcs-root-ref");
    private final static QName _Change_QNAME = new QName("", "change");
    private final static QName _BuildTypes_QNAME = new QName("", "buildTypes");
    private final static QName _NewBuildTypeDescription_QNAME = new QName("", "newBuildTypeDescription");
    private final static QName _ArtifactDependencies_QNAME = new QName("", "artifact-dependencies");
    private final static QName _BuildsRef_QNAME = new QName("", "builds-ref");
    private final static QName _Plugin_QNAME = new QName("", "plugin");
    private final static QName _File_QNAME = new QName("", "file");
    private final static QName _Features_QNAME = new QName("", "features");
    private final static QName _Role_QNAME = new QName("", "role");
    private final static QName _Feature_QNAME = new QName("", "feature");
    private final static QName _Href_QNAME = new QName("", "href");
    private final static QName _Groups_QNAME = new QName("", "groups");
    private final static QName _Branches_QNAME = new QName("", "branches");
    private final static QName _VcsRoots_QNAME = new QName("", "vcs-roots");
    private final static QName _VcsRootInstances_QNAME = new QName("", "vcs-root-instances");
    private final static QName _VcsRootEntries_QNAME = new QName("", "vcs-root-entries");
    private final static QName _IssuesUsages_QNAME = new QName("", "issuesUsages");
    private final static QName _BuildRef_QNAME = new QName("", "build-ref");
    private final static QName _NewProjectDescription_QNAME = new QName("", "newProjectDescription");
    private final static QName _Steps_QNAME = new QName("", "steps");
    private final static QName _Properties_QNAME = new QName("", "properties");
    private final static QName _VcsRootInstance_QNAME = new QName("", "vcs-root-instance");
    private final static QName _Agent_QNAME = new QName("", "agent");
    private final static QName _Investigations_QNAME = new QName("", "investigations");
    private final static QName _Project_QNAME = new QName("", "project");
    private final static QName _Projects_QNAME = new QName("", "projects");
    private final static QName _ChangesRef_QNAME = new QName("", "changes-ref");
    private final static QName _ArtifactDependency_QNAME = new QName("", "artifact-dependency");
    private final static QName _Items_QNAME = new QName("", "items");
    private final static QName _GroupRef_QNAME = new QName("", "group-ref");
    private final static QName _BuildTypeRef_QNAME = new QName("", "buildType-ref");
    private final static QName _Issues_QNAME = new QName("", "issues");
    private final static QName _Roles_QNAME = new QName("", "roles");
    private final static QName _Branch_QNAME = new QName("", "branch");
    private final static QName _VcsRootInstanceRef_QNAME = new QName("", "vcs-root-instance-ref");
    private final static QName _AgentRequirements_QNAME = new QName("", "agent-requirements");
    private final static QName _BuildType_QNAME = new QName("", "buildType");
    private final static QName _ProjectRef_QNAME = new QName("", "project-ref");
    private final static QName _Plugins_QNAME = new QName("", "plugins");
    private final static QName _ChangeRef_QNAME = new QName("", "change-ref");
    private final static QName _VcsRootEntry_QNAME = new QName("", "vcs-root-entry");
    private final static QName _VcsLabeling_QNAME = new QName("", "vcs-labeling");
    private final static QName _Build_QNAME = new QName("", "build");
    private final static QName _Labeling_QNAME = new QName("", "labeling");
    private final static QName _AgentRequirement_QNAME = new QName("", "agent-requirement");
    private final static QName _AgentsRef_QNAME = new QName("", "agents-ref");
    private final static QName _Tags_QNAME = new QName("", "tags");
    private final static QName _VcsRoot_QNAME = new QName("", "vcs-root");
    private final static QName _Files_QNAME = new QName("", "files");
    private final static QName _Trigger_QNAME = new QName("", "trigger");
    private final static QName _Builds_QNAME = new QName("", "builds");
    private final static QName _SnapshotDependencies_QNAME = new QName("", "snapshot-dependencies");
    private final static QName _Server_QNAME = new QName("", "server");
    private final static QName _ProgressInfo_QNAME = new QName("", "progress-info");
    private final static QName _Triggers_QNAME = new QName("", "triggers");
    private final static QName _Group_QNAME = new QName("", "group");
    private final static QName _User_QNAME = new QName("", "user");
    private final static QName _Step_QNAME = new QName("", "step");
    private final static QName _SnapshotDependency_QNAME = new QName("", "snapshot-dependency");
    private final static QName _Changes_QNAME = new QName("", "changes");
    private final static QName _UserRef_QNAME = new QName("", "user-ref");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgentRef }
     * 
     */
    public AgentRef createAgentRef() {
        return new AgentRef();
    }

    /**
     * Create an instance of {@link IssuesRef }
     * 
     */
    public IssuesRef createIssuesRef() {
        return new IssuesRef();
    }

    /**
     * Create an instance of {@link Users }
     * 
     */
    public Users createUsers() {
        return new Users();
    }

    /**
     * Create an instance of {@link VcsRootRef }
     * 
     */
    public VcsRootRef createVcsRootRef() {
        return new VcsRootRef();
    }

    /**
     * Create an instance of {@link Change }
     * 
     */
    public Change createChange() {
        return new Change();
    }

    /**
     * Create an instance of {@link BuildTypes }
     * 
     */
    public BuildTypes createBuildTypes() {
        return new BuildTypes();
    }

    /**
     * Create an instance of {@link NewBuildTypeDescription }
     * 
     */
    public NewBuildTypeDescription createNewBuildTypeDescription() {
        return new NewBuildTypeDescription();
    }

    /**
     * Create an instance of {@link PropEntitiesArtifactDep }
     * 
     */
    public PropEntitiesArtifactDep createPropEntitiesArtifactDep() {
        return new PropEntitiesArtifactDep();
    }

    /**
     * Create an instance of {@link BuildsRef }
     * 
     */
    public BuildsRef createBuildsRef() {
        return new BuildsRef();
    }

    /**
     * Create an instance of {@link PluginInfo }
     * 
     */
    public PluginInfo createPluginInfo() {
        return new PluginInfo();
    }

    /**
     * Create an instance of {@link PropEntitiesFeature }
     * 
     */
    public PropEntitiesFeature createPropEntitiesFeature() {
        return new PropEntitiesFeature();
    }

    /**
     * Create an instance of {@link RoleAssignment }
     * 
     */
    public RoleAssignment createRoleAssignment() {
        return new RoleAssignment();
    }

    /**
     * Create an instance of {@link PropEntityFeature }
     * 
     */
    public PropEntityFeature createPropEntityFeature() {
        return new PropEntityFeature();
    }

    /**
     * Create an instance of {@link HReference }
     * 
     */
    public HReference createHReference() {
        return new HReference();
    }

    /**
     * Create an instance of {@link VcsRoots }
     * 
     */
    public VcsRoots createVcsRoots() {
        return new VcsRoots();
    }

    /**
     * Create an instance of {@link Branches }
     * 
     */
    public Branches createBranches() {
        return new Branches();
    }

    /**
     * Create an instance of {@link Groups }
     * 
     */
    public Groups createGroups() {
        return new Groups();
    }

    /**
     * Create an instance of {@link VcsRootInstances }
     * 
     */
    public VcsRootInstances createVcsRootInstances() {
        return new VcsRootInstances();
    }

    /**
     * Create an instance of {@link VcsRootEntries }
     * 
     */
    public VcsRootEntries createVcsRootEntries() {
        return new VcsRootEntries();
    }

    /**
     * Create an instance of {@link IssueUsages }
     * 
     */
    public IssueUsages createIssueUsages() {
        return new IssueUsages();
    }

    /**
     * Create an instance of {@link BuildRef }
     * 
     */
    public BuildRef createBuildRef() {
        return new BuildRef();
    }

    /**
     * Create an instance of {@link NewProjectDescription }
     * 
     */
    public NewProjectDescription createNewProjectDescription() {
        return new NewProjectDescription();
    }

    /**
     * Create an instance of {@link PropEntitiesStep }
     * 
     */
    public PropEntitiesStep createPropEntitiesStep() {
        return new PropEntitiesStep();
    }

    /**
     * Create an instance of {@link Properties }
     * 
     */
    public Properties createProperties() {
        return new Properties();
    }

    /**
     * Create an instance of {@link VcsRootInstance }
     * 
     */
    public VcsRootInstance createVcsRootInstance() {
        return new VcsRootInstance();
    }

    /**
     * Create an instance of {@link Agent }
     * 
     */
    public Agent createAgent() {
        return new Agent();
    }

    /**
     * Create an instance of {@link Investigations }
     * 
     */
    public Investigations createInvestigations() {
        return new Investigations();
    }

    /**
     * Create an instance of {@link Project }
     * 
     */
    public Project createProject() {
        return new Project();
    }

    /**
     * Create an instance of {@link Projects }
     * 
     */
    public Projects createProjects() {
        return new Projects();
    }

    /**
     * Create an instance of {@link ChangesRef }
     * 
     */
    public ChangesRef createChangesRef() {
        return new ChangesRef();
    }

    /**
     * Create an instance of {@link PropEntityArtifactDep }
     * 
     */
    public PropEntityArtifactDep createPropEntityArtifactDep() {
        return new PropEntityArtifactDep();
    }

    /**
     * Create an instance of {@link Items }
     * 
     */
    public Items createItems() {
        return new Items();
    }

    /**
     * Create an instance of {@link GroupRef }
     * 
     */
    public GroupRef createGroupRef() {
        return new GroupRef();
    }

    /**
     * Create an instance of {@link BuildTypeRef }
     * 
     */
    public BuildTypeRef createBuildTypeRef() {
        return new BuildTypeRef();
    }

    /**
     * Create an instance of {@link Issues }
     * 
     */
    public Issues createIssues() {
        return new Issues();
    }

    /**
     * Create an instance of {@link RoleAssignments }
     * 
     */
    public RoleAssignments createRoleAssignments() {
        return new RoleAssignments();
    }

    /**
     * Create an instance of {@link Branch }
     * 
     */
    public Branch createBranch() {
        return new Branch();
    }

    /**
     * Create an instance of {@link VcsRootInstanceRef }
     * 
     */
    public VcsRootInstanceRef createVcsRootInstanceRef() {
        return new VcsRootInstanceRef();
    }

    /**
     * Create an instance of {@link PropEntitiesAgentRequirement }
     * 
     */
    public PropEntitiesAgentRequirement createPropEntitiesAgentRequirement() {
        return new PropEntitiesAgentRequirement();
    }

    /**
     * Create an instance of {@link BuildType }
     * 
     */
    public BuildType createBuildType() {
        return new BuildType();
    }

    /**
     * Create an instance of {@link ProjectRef }
     * 
     */
    public ProjectRef createProjectRef() {
        return new ProjectRef();
    }

    /**
     * Create an instance of {@link PluginInfos }
     * 
     */
    public PluginInfos createPluginInfos() {
        return new PluginInfos();
    }

    /**
     * Create an instance of {@link ChangeRef }
     * 
     */
    public ChangeRef createChangeRef() {
        return new ChangeRef();
    }

    /**
     * Create an instance of {@link VcsRootEntry }
     * 
     */
    public VcsRootEntry createVcsRootEntry() {
        return new VcsRootEntry();
    }

    /**
     * Create an instance of {@link VcsLabelingOptions }
     * 
     */
    public VcsLabelingOptions createVcsLabelingOptions() {
        return new VcsLabelingOptions();
    }

    /**
     * Create an instance of {@link Build }
     * 
     */
    public Build createBuild() {
        return new Build();
    }

    /**
     * Create an instance of {@link LabelingOptions }
     * 
     */
    public LabelingOptions createLabelingOptions() {
        return new LabelingOptions();
    }

    /**
     * Create an instance of {@link PropEntityAgentRequirement }
     * 
     */
    public PropEntityAgentRequirement createPropEntityAgentRequirement() {
        return new PropEntityAgentRequirement();
    }

    /**
     * Create an instance of {@link AgentsRef }
     * 
     */
    public AgentsRef createAgentsRef() {
        return new AgentsRef();
    }

    /**
     * Create an instance of {@link VcsRoot }
     * 
     */
    public VcsRoot createVcsRoot() {
        return new VcsRoot();
    }

    /**
     * Create an instance of {@link Tags }
     * 
     */
    public Tags createTags() {
        return new Tags();
    }

    /**
     * Create an instance of {@link PropEntityTrigger }
     * 
     */
    public PropEntityTrigger createPropEntityTrigger() {
        return new PropEntityTrigger();
    }

    /**
     * Create an instance of {@link Files }
     * 
     */
    public Files createFiles() {
        return new Files();
    }

    /**
     * Create an instance of {@link PropEntitiesSnapshotDep }
     * 
     */
    public PropEntitiesSnapshotDep createPropEntitiesSnapshotDep() {
        return new PropEntitiesSnapshotDep();
    }

    /**
     * Create an instance of {@link RunningBuildInfo }
     * 
     */
    public RunningBuildInfo createRunningBuildInfo() {
        return new RunningBuildInfo();
    }

    /**
     * Create an instance of {@link Server }
     * 
     */
    public Server createServer() {
        return new Server();
    }

    /**
     * Create an instance of {@link PropEntitiesTrigger }
     * 
     */
    public PropEntitiesTrigger createPropEntitiesTrigger() {
        return new PropEntitiesTrigger();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link PropEntityStep }
     * 
     */
    public PropEntityStep createPropEntityStep() {
        return new PropEntityStep();
    }

    /**
     * Create an instance of {@link UserRef }
     * 
     */
    public UserRef createUserRef() {
        return new UserRef();
    }

    /**
     * Create an instance of {@link Changes }
     * 
     */
    public Changes createChanges() {
        return new Changes();
    }

    /**
     * Create an instance of {@link PropEntitySnapshotDep }
     * 
     */
    public PropEntitySnapshotDep createPropEntitySnapshotDep() {
        return new PropEntitySnapshotDep();
    }

    /**
     * Create an instance of {@link InvestigationScope }
     * 
     */
    public InvestigationScope createInvestigationScope() {
        return new InvestigationScope();
    }

    /**
     * Create an instance of {@link Revision }
     * 
     */
    public Revision createRevision() {
        return new Revision();
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public File createFile() {
        return new File();
    }

    /**
     * Create an instance of {@link Investigation }
     * 
     */
    public Investigation createInvestigation() {
        return new Investigation();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link BuildsList }
     * 
     */
    public BuildsList createBuildsList() {
        return new BuildsList();
    }

    /**
     * Create an instance of {@link PropEntity }
     * 
     */
    public PropEntity createPropEntity() {
        return new PropEntity();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link FileChanges }
     * 
     */
    public FileChanges createFileChanges() {
        return new FileChanges();
    }

    /**
     * Create an instance of {@link Issue }
     * 
     */
    public Issue createIssue() {
        return new Issue();
    }

    /**
     * Create an instance of {@link CopyOptionsDescription }
     * 
     */
    public CopyOptionsDescription createCopyOptionsDescription() {
        return new CopyOptionsDescription();
    }

    /**
     * Create an instance of {@link TriggeredBy }
     * 
     */
    public TriggeredBy createTriggeredBy() {
        return new TriggeredBy();
    }

    /**
     * Create an instance of {@link Builds }
     * 
     */
    public Builds createBuilds() {
        return new Builds();
    }

    /**
     * Create an instance of {@link FileRef }
     * 
     */
    public FileRef createFileRef() {
        return new FileRef();
    }

    /**
     * Create an instance of {@link FileChange }
     * 
     */
    public FileChange createFileChange() {
        return new FileChange();
    }

    /**
     * Create an instance of {@link IssueUsage }
     * 
     */
    public IssueUsage createIssueUsage() {
        return new IssueUsage();
    }

    /**
     * Create an instance of {@link Revisions }
     * 
     */
    public Revisions createRevisions() {
        return new Revisions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "agent-ref")
    public JAXBElement<AgentRef> createAgentRef(AgentRef value) {
        return new JAXBElement<AgentRef>(_AgentRef_QNAME, AgentRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuesRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "issues-ref")
    public JAXBElement<IssuesRef> createIssuesRef(IssuesRef value) {
        return new JAXBElement<IssuesRef>(_IssuesRef_QNAME, IssuesRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Users }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "users")
    public JAXBElement<Users> createUsers(Users value) {
        return new JAXBElement<Users>(_Users_QNAME, Users.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VcsRootRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vcs-root-ref")
    public JAXBElement<VcsRootRef> createVcsRootRef(VcsRootRef value) {
        return new JAXBElement<VcsRootRef>(_VcsRootRef_QNAME, VcsRootRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Change }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "change")
    public JAXBElement<Change> createChange(Change value) {
        return new JAXBElement<Change>(_Change_QNAME, Change.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "buildTypes")
    public JAXBElement<BuildTypes> createBuildTypes(BuildTypes value) {
        return new JAXBElement<BuildTypes>(_BuildTypes_QNAME, BuildTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewBuildTypeDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "newBuildTypeDescription")
    public JAXBElement<NewBuildTypeDescription> createNewBuildTypeDescription(NewBuildTypeDescription value) {
        return new JAXBElement<NewBuildTypeDescription>(_NewBuildTypeDescription_QNAME, NewBuildTypeDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropEntitiesArtifactDep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "artifact-dependencies")
    public JAXBElement<PropEntitiesArtifactDep> createArtifactDependencies(PropEntitiesArtifactDep value) {
        return new JAXBElement<PropEntitiesArtifactDep>(_ArtifactDependencies_QNAME, PropEntitiesArtifactDep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildsRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "builds-ref")
    public JAXBElement<BuildsRef> createBuildsRef(BuildsRef value) {
        return new JAXBElement<BuildsRef>(_BuildsRef_QNAME, BuildsRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PluginInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "plugin")
    public JAXBElement<PluginInfo> createPlugin(PluginInfo value) {
        return new JAXBElement<PluginInfo>(_Plugin_QNAME, PluginInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "file")
    public JAXBElement<Object> createFile(Object value) {
        return new JAXBElement<Object>(_File_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropEntitiesFeature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "features")
    public JAXBElement<PropEntitiesFeature> createFeatures(PropEntitiesFeature value) {
        return new JAXBElement<PropEntitiesFeature>(_Features_QNAME, PropEntitiesFeature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleAssignment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "role")
    public JAXBElement<RoleAssignment> createRole(RoleAssignment value) {
        return new JAXBElement<RoleAssignment>(_Role_QNAME, RoleAssignment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropEntityFeature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "feature")
    public JAXBElement<PropEntityFeature> createFeature(PropEntityFeature value) {
        return new JAXBElement<PropEntityFeature>(_Feature_QNAME, PropEntityFeature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "href")
    public JAXBElement<HReference> createHref(HReference value) {
        return new JAXBElement<HReference>(_Href_QNAME, HReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Groups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "groups")
    public JAXBElement<Groups> createGroups(Groups value) {
        return new JAXBElement<Groups>(_Groups_QNAME, Groups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Branches }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "branches")
    public JAXBElement<Branches> createBranches(Branches value) {
        return new JAXBElement<Branches>(_Branches_QNAME, Branches.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VcsRoots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vcs-roots")
    public JAXBElement<VcsRoots> createVcsRoots(VcsRoots value) {
        return new JAXBElement<VcsRoots>(_VcsRoots_QNAME, VcsRoots.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VcsRootInstances }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vcs-root-instances")
    public JAXBElement<VcsRootInstances> createVcsRootInstances(VcsRootInstances value) {
        return new JAXBElement<VcsRootInstances>(_VcsRootInstances_QNAME, VcsRootInstances.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VcsRootEntries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vcs-root-entries")
    public JAXBElement<VcsRootEntries> createVcsRootEntries(VcsRootEntries value) {
        return new JAXBElement<VcsRootEntries>(_VcsRootEntries_QNAME, VcsRootEntries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueUsages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "issuesUsages")
    public JAXBElement<IssueUsages> createIssuesUsages(IssueUsages value) {
        return new JAXBElement<IssueUsages>(_IssuesUsages_QNAME, IssueUsages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "build-ref")
    public JAXBElement<BuildRef> createBuildRef(BuildRef value) {
        return new JAXBElement<BuildRef>(_BuildRef_QNAME, BuildRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewProjectDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "newProjectDescription")
    public JAXBElement<NewProjectDescription> createNewProjectDescription(NewProjectDescription value) {
        return new JAXBElement<NewProjectDescription>(_NewProjectDescription_QNAME, NewProjectDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropEntitiesStep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "steps")
    public JAXBElement<PropEntitiesStep> createSteps(PropEntitiesStep value) {
        return new JAXBElement<PropEntitiesStep>(_Steps_QNAME, PropEntitiesStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Properties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "properties")
    public JAXBElement<Properties> createProperties(Properties value) {
        return new JAXBElement<Properties>(_Properties_QNAME, Properties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VcsRootInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vcs-root-instance")
    public JAXBElement<VcsRootInstance> createVcsRootInstance(VcsRootInstance value) {
        return new JAXBElement<VcsRootInstance>(_VcsRootInstance_QNAME, VcsRootInstance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "agent")
    public JAXBElement<Agent> createAgent(Agent value) {
        return new JAXBElement<Agent>(_Agent_QNAME, Agent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Investigations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "investigations")
    public JAXBElement<Investigations> createInvestigations(Investigations value) {
        return new JAXBElement<Investigations>(_Investigations_QNAME, Investigations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Project }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "project")
    public JAXBElement<Project> createProject(Project value) {
        return new JAXBElement<Project>(_Project_QNAME, Project.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Projects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "projects")
    public JAXBElement<Projects> createProjects(Projects value) {
        return new JAXBElement<Projects>(_Projects_QNAME, Projects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangesRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "changes-ref")
    public JAXBElement<ChangesRef> createChangesRef(ChangesRef value) {
        return new JAXBElement<ChangesRef>(_ChangesRef_QNAME, ChangesRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropEntityArtifactDep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "artifact-dependency")
    public JAXBElement<PropEntityArtifactDep> createArtifactDependency(PropEntityArtifactDep value) {
        return new JAXBElement<PropEntityArtifactDep>(_ArtifactDependency_QNAME, PropEntityArtifactDep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Items }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "items")
    public JAXBElement<Items> createItems(Items value) {
        return new JAXBElement<Items>(_Items_QNAME, Items.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "group-ref")
    public JAXBElement<GroupRef> createGroupRef(GroupRef value) {
        return new JAXBElement<GroupRef>(_GroupRef_QNAME, GroupRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildTypeRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "buildType-ref")
    public JAXBElement<BuildTypeRef> createBuildTypeRef(BuildTypeRef value) {
        return new JAXBElement<BuildTypeRef>(_BuildTypeRef_QNAME, BuildTypeRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Issues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "issues")
    public JAXBElement<Issues> createIssues(Issues value) {
        return new JAXBElement<Issues>(_Issues_QNAME, Issues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleAssignments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "roles")
    public JAXBElement<RoleAssignments> createRoles(RoleAssignments value) {
        return new JAXBElement<RoleAssignments>(_Roles_QNAME, RoleAssignments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Branch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "branch")
    public JAXBElement<Branch> createBranch(Branch value) {
        return new JAXBElement<Branch>(_Branch_QNAME, Branch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VcsRootInstanceRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vcs-root-instance-ref")
    public JAXBElement<VcsRootInstanceRef> createVcsRootInstanceRef(VcsRootInstanceRef value) {
        return new JAXBElement<VcsRootInstanceRef>(_VcsRootInstanceRef_QNAME, VcsRootInstanceRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropEntitiesAgentRequirement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "agent-requirements")
    public JAXBElement<PropEntitiesAgentRequirement> createAgentRequirements(PropEntitiesAgentRequirement value) {
        return new JAXBElement<PropEntitiesAgentRequirement>(_AgentRequirements_QNAME, PropEntitiesAgentRequirement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "buildType")
    public JAXBElement<BuildType> createBuildType(BuildType value) {
        return new JAXBElement<BuildType>(_BuildType_QNAME, BuildType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "project-ref")
    public JAXBElement<ProjectRef> createProjectRef(ProjectRef value) {
        return new JAXBElement<ProjectRef>(_ProjectRef_QNAME, ProjectRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PluginInfos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "plugins")
    public JAXBElement<PluginInfos> createPlugins(PluginInfos value) {
        return new JAXBElement<PluginInfos>(_Plugins_QNAME, PluginInfos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "change-ref")
    public JAXBElement<ChangeRef> createChangeRef(ChangeRef value) {
        return new JAXBElement<ChangeRef>(_ChangeRef_QNAME, ChangeRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VcsRootEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vcs-root-entry")
    public JAXBElement<VcsRootEntry> createVcsRootEntry(VcsRootEntry value) {
        return new JAXBElement<VcsRootEntry>(_VcsRootEntry_QNAME, VcsRootEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VcsLabelingOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vcs-labeling")
    public JAXBElement<VcsLabelingOptions> createVcsLabeling(VcsLabelingOptions value) {
        return new JAXBElement<VcsLabelingOptions>(_VcsLabeling_QNAME, VcsLabelingOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Build }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "build")
    public JAXBElement<Build> createBuild(Build value) {
        return new JAXBElement<Build>(_Build_QNAME, Build.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelingOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "labeling")
    public JAXBElement<LabelingOptions> createLabeling(LabelingOptions value) {
        return new JAXBElement<LabelingOptions>(_Labeling_QNAME, LabelingOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropEntityAgentRequirement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "agent-requirement")
    public JAXBElement<PropEntityAgentRequirement> createAgentRequirement(PropEntityAgentRequirement value) {
        return new JAXBElement<PropEntityAgentRequirement>(_AgentRequirement_QNAME, PropEntityAgentRequirement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentsRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "agents-ref")
    public JAXBElement<AgentsRef> createAgentsRef(AgentsRef value) {
        return new JAXBElement<AgentsRef>(_AgentsRef_QNAME, AgentsRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tags }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tags")
    public JAXBElement<Tags> createTags(Tags value) {
        return new JAXBElement<Tags>(_Tags_QNAME, Tags.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VcsRoot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vcs-root")
    public JAXBElement<VcsRoot> createVcsRoot(VcsRoot value) {
        return new JAXBElement<VcsRoot>(_VcsRoot_QNAME, VcsRoot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Files }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "files")
    public JAXBElement<Files> createFiles(Files value) {
        return new JAXBElement<Files>(_Files_QNAME, Files.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropEntityTrigger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "trigger")
    public JAXBElement<PropEntityTrigger> createTrigger(PropEntityTrigger value) {
        return new JAXBElement<PropEntityTrigger>(_Trigger_QNAME, PropEntityTrigger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "builds")
    public JAXBElement<Builds> createBuilds(Builds value) {
        return new JAXBElement<Builds>(_Builds_QNAME, Builds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropEntitiesSnapshotDep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "snapshot-dependencies")
    public JAXBElement<PropEntitiesSnapshotDep> createSnapshotDependencies(PropEntitiesSnapshotDep value) {
        return new JAXBElement<PropEntitiesSnapshotDep>(_SnapshotDependencies_QNAME, PropEntitiesSnapshotDep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Server }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "server")
    public JAXBElement<Server> createServer(Server value) {
        return new JAXBElement<Server>(_Server_QNAME, Server.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunningBuildInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "progress-info")
    public JAXBElement<RunningBuildInfo> createProgressInfo(RunningBuildInfo value) {
        return new JAXBElement<RunningBuildInfo>(_ProgressInfo_QNAME, RunningBuildInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropEntitiesTrigger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "triggers")
    public JAXBElement<PropEntitiesTrigger> createTriggers(PropEntitiesTrigger value) {
        return new JAXBElement<PropEntitiesTrigger>(_Triggers_QNAME, PropEntitiesTrigger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Group }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "group")
    public JAXBElement<Group> createGroup(Group value) {
        return new JAXBElement<Group>(_Group_QNAME, Group.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropEntityStep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "step")
    public JAXBElement<PropEntityStep> createStep(PropEntityStep value) {
        return new JAXBElement<PropEntityStep>(_Step_QNAME, PropEntityStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropEntitySnapshotDep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "snapshot-dependency")
    public JAXBElement<PropEntitySnapshotDep> createSnapshotDependency(PropEntitySnapshotDep value) {
        return new JAXBElement<PropEntitySnapshotDep>(_SnapshotDependency_QNAME, PropEntitySnapshotDep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Changes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "changes")
    public JAXBElement<Changes> createChanges(Changes value) {
        return new JAXBElement<Changes>(_Changes_QNAME, Changes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "user-ref")
    public JAXBElement<UserRef> createUserRef(UserRef value) {
        return new JAXBElement<UserRef>(_UserRef_QNAME, UserRef.class, null, value);
    }

}
