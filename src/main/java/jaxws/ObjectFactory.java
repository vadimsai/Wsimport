
package jaxws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxws package. 
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

    private final static QName _SaiRamResponse_QNAME = new QName("http://jaxws/", "saiRamResponse");
    private final static QName _SaiRam_QNAME = new QName("http://jaxws/", "saiRam");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaiRam }
     * 
     */
    public SaiRam createSaiRam() {
        return new SaiRam();
    }

    /**
     * Create an instance of {@link SaiRamResponse }
     * 
     */
    public SaiRamResponse createSaiRamResponse() {
        return new SaiRamResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaiRamResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws/", name = "saiRamResponse")
    public JAXBElement<SaiRamResponse> createSaiRamResponse(SaiRamResponse value) {
        return new JAXBElement<SaiRamResponse>(_SaiRamResponse_QNAME, SaiRamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaiRam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws/", name = "saiRam")
    public JAXBElement<SaiRam> createSaiRam(SaiRam value) {
        return new JAXBElement<SaiRam>(_SaiRam_QNAME, SaiRam.class, null, value);
    }

}
