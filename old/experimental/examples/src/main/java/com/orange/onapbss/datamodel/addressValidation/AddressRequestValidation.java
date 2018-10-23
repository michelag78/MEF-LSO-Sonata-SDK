//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.08 à 11:31:21 AM CEST 
//


package com.orange.onapbss.datamodel.addressValidation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AddressRequestValidation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AddressRequestValidation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="streetNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="streetNrSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="streetNrLast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="streetNrLastSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="streetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="streetSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="geoLocationRef" type="{http://orange.com/POC_ONAP/api/address/v0/model}GeoLocationRef" minOccurs="0"/&gt;
 *         &lt;element name="geoLocation" type="{http://orange.com/POC_ONAP/api/address/v0/model}GeoLocation" minOccurs="0"/&gt;
 *         &lt;element name="subAddress" type="{http://orange.com/POC_ONAP/api/address/v0/model}SubAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressRequestValidation", propOrder = {
    "streetNr",
    "streetNrSuffix",
    "streetNrLast",
    "streetNrLastSuffix",
    "streetName",
    "streetType",
    "streetSuffix",
    "postcode",
    "locality",
    "city",
    "stateOrProvince",
    "country",
    "geoLocationRef",
    "geoLocation",
    "subAddress"
})
public class AddressRequestValidation {

    protected String streetNr;
    protected String streetNrSuffix;
    protected String streetNrLast;
    protected String streetNrLastSuffix;
    protected String streetName;
    protected String streetType;
    protected String streetSuffix;
    protected String postcode;
    protected String locality;
    protected String city;
    protected String stateOrProvince;
    protected String country;
    protected GeoLocationRef geoLocationRef;
    protected GeoLocation geoLocation;
    protected SubAddress subAddress;

    /**
     * Obtient la valeur de la propriété streetNr.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreetNr() {
        return streetNr;
    }

    /**
     * Définit la valeur de la propriété streetNr.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreetNr(String value) {
        this.streetNr = value;
    }

    /**
     * Obtient la valeur de la propriété streetNrSuffix.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreetNrSuffix() {
        return streetNrSuffix;
    }

    /**
     * Définit la valeur de la propriété streetNrSuffix.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreetNrSuffix(String value) {
        this.streetNrSuffix = value;
    }

    /**
     * Obtient la valeur de la propriété streetNrLast.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreetNrLast() {
        return streetNrLast;
    }

    /**
     * Définit la valeur de la propriété streetNrLast.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreetNrLast(String value) {
        this.streetNrLast = value;
    }

    /**
     * Obtient la valeur de la propriété streetNrLastSuffix.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreetNrLastSuffix() {
        return streetNrLastSuffix;
    }

    /**
     * Définit la valeur de la propriété streetNrLastSuffix.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreetNrLastSuffix(String value) {
        this.streetNrLastSuffix = value;
    }

    /**
     * Obtient la valeur de la propriété streetName.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Définit la valeur de la propriété streetName.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Obtient la valeur de la propriété streetType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreetType() {
        return streetType;
    }

    /**
     * Définit la valeur de la propriété streetType.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreetType(String value) {
        this.streetType = value;
    }

    /**
     * Obtient la valeur de la propriété streetSuffix.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * Définit la valeur de la propriété streetSuffix.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreetSuffix(String value) {
        this.streetSuffix = value;
    }

    /**
     * Obtient la valeur de la propriété postcode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Définit la valeur de la propriété postcode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Obtient la valeur de la propriété locality.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Définit la valeur de la propriété locality.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLocality(String value) {
        this.locality = value;
    }

    /**
     * Obtient la valeur de la propriété city.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCity() {
        return city;
    }

    /**
     * Définit la valeur de la propriété city.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtient la valeur de la propriété stateOrProvince.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Définit la valeur de la propriété stateOrProvince.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStateOrProvince(String value) {
        this.stateOrProvince = value;
    }

    /**
     * Obtient la valeur de la propriété country.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountry() {
        return country;
    }

    /**
     * Définit la valeur de la propriété country.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtient la valeur de la propriété geoLocationRef.
     *
     * @return
     *     possible object is
     *     {@link GeoLocationRef }
     *
     */
    public GeoLocationRef getGeoLocationRef() {
        return geoLocationRef;
    }

    /**
     * Définit la valeur de la propriété geoLocationRef.
     *
     * @param value
     *     allowed object is
     *     {@link GeoLocationRef }
     *
     */
    public void setGeoLocationRef(GeoLocationRef value) {
        this.geoLocationRef = value;
    }

    /**
     * Obtient la valeur de la propriété geoLocation.
     *
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *
     */
    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    /**
     * Définit la valeur de la propriété geoLocation.
     *
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *
     */
    public void setGeoLocation(GeoLocation value) {
        this.geoLocation = value;
    }

    /**
     * Obtient la valeur de la propriété subAddress.
     * 
     * @return
     *     possible object is
     *     {@link SubAddress }
     *     
     */
    public SubAddress getSubAddress() {
        return subAddress;
    }

    /**
     * Définit la valeur de la propriété subAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAddress }
     *     
     */
    public void setSubAddress(SubAddress value) {
        this.subAddress = value;
    }

}