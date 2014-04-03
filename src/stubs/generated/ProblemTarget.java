
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for problemTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="problemTarget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}tests" minOccurs="0"/>
 *         &lt;element ref="{}problems" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="anyProblem" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "problemTarget", propOrder = {
    "tests",
    "problems"
})
public class ProblemTarget {

    protected Tests tests;
    protected Problems problems;
    @XmlAttribute(name = "anyProblem")
    protected Boolean anyProblem;

    /**
     * Gets the value of the tests property.
     * 
     * @return
     *     possible object is
     *     {@link Tests }
     *     
     */
    public Tests getTests() {
        return tests;
    }

    /**
     * Sets the value of the tests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tests }
     *     
     */
    public void setTests(Tests value) {
        this.tests = value;
    }

    /**
     * Gets the value of the problems property.
     * 
     * @return
     *     possible object is
     *     {@link Problems }
     *     
     */
    public Problems getProblems() {
        return problems;
    }

    /**
     * Sets the value of the problems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Problems }
     *     
     */
    public void setProblems(Problems value) {
        this.problems = value;
    }

    /**
     * Gets the value of the anyProblem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnyProblem() {
        return anyProblem;
    }

    /**
     * Sets the value of the anyProblem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnyProblem(Boolean value) {
        this.anyProblem = value;
    }

}
