
package com.alex.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.alex.beans.Person;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getPersonReturn" type="{http://beans.alex.com}Person"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPersonReturn"
})
@XmlRootElement(name = "getPersonResponse")
public class GetPersonResponse {

    @XmlElement(required = true)
    protected Person getPersonReturn;

    /**
     * Gets the value of the getPersonReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getGetPersonReturn() {
        return getPersonReturn;
    }

    /**
     * Sets the value of the getPersonReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setGetPersonReturn(Person value) {
        this.getPersonReturn = value;
    }

}
