//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.03 at 03:38:36 PM IRST 
//


package org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstanceofExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstanceofExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Expression">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Expression"/>
 *         &lt;element name="evaluationType" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstanceofExpression", namespace = "http://rebecalang.org/compiler/modelcompiler/corerebecaexpression", propOrder = {
    "value",
    "evaluationType"
})
public class InstanceofExpression
    extends Expression
{

    @XmlElement(required = true)
    protected Expression value;
    @XmlElement(required = true)
    protected Type evaluationType;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setValue(Expression value) {
        this.value = value;
    }

    /**
     * Gets the value of the evaluationType property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getEvaluationType() {
        return evaluationType;
    }

    /**
     * Sets the value of the evaluationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setEvaluationType(Type value) {
        this.evaluationType = value;
    }

}