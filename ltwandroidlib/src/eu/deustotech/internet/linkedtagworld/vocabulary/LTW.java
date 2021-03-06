/* CVS $Id: $ */
package eu.deustotech.internet.linkedtagworld.vocabulary;

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.ontology.*;
 
/**
 * Vocabulary definitions from /home/jon/ontologies/ltw/0.1 
 * @author Auto-generated by schemagen on 05 Jun 2013 10:44 
 */
public class LTW {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://helheim.deusto.es/ltw/0.1#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "0.1";
    
    /** <p>Specifies the datatype of the value associated to mapped property.</p> */
    public static final ObjectProperty datatype = m_model.createObjectProperty( "http://helheim.deusto.es/ltw/0.1#datatype" );
    
    /** <p>Specifies a PropertyItem inside a ClassItem.</p> */
    public static final ObjectProperty hasPropertyItem = m_model.createObjectProperty( "http://helheim.deusto.es/ltw/0.1#hasPropertyItem" );
    
    /** <p>Specifies the class from a given ontology to which a ClassItem element belongs.</p> */
    public static final ObjectProperty ontologyClass = m_model.createObjectProperty( "http://helheim.deusto.es/ltw/0.1#ontologyClass" );
    
    /** <p>Specifies the property from a given ontology to which a ClassItem element 
     *  belongs.</p>
     */
    public static final ObjectProperty ontologyProperty = m_model.createObjectProperty( "http://helheim.deusto.es/ltw/0.1#ontologyProperty" );
    
    /** <p>Specifies a unique identifier for a given item.</p> */
    public static final DatatypeProperty identifier = m_model.createDatatypeProperty( "http://helheim.deusto.es/ltw/0.1#identifier" );
    
    /** <p>Specifies if a property is clickable in the Android app and generates new 
     *  views from it.</p>
     */
    public static final DatatypeProperty isClickable = m_model.createDatatypeProperty( "http://helheim.deusto.es/ltw/0.1#isClickable" );
    
    /** <p>Specifies if a property is a key aspect to try to find links with external 
     *  resources.</p>
     */
    public static final DatatypeProperty isLinkable = m_model.createDatatypeProperty( "http://helheim.deusto.es/ltw/0.1#isLinkable" );
    
    /** <p>Specifies if a property is the main one, which implies emphasizing it in visualization.</p> */
    public static final DatatypeProperty isMain = m_model.createDatatypeProperty( "http://helheim.deusto.es/ltw/0.1#isMain" );
    
    /** <p>Specifies the java class that implements wanted behaviour on Android application.</p> */
    public static final DatatypeProperty javaClass = m_model.createDatatypeProperty( "http://helheim.deusto.es/ltw/0.1#javaClass" );
    
    /** <p>Specifies the language of the value associated to mapped property.</p> */
    public static final DatatypeProperty language = m_model.createDatatypeProperty( "http://helheim.deusto.es/ltw/0.1#language" );
    
    /** <p>Represents an ontology class item</p> */
    public static final OntClass ClassItem = m_model.createClass( "http://helheim.deusto.es/ltw/0.1#ClassItem" );
    
    /** <p>Represents an ontology property item</p> */
    public static final OntClass PropertyItem = m_model.createClass( "http://helheim.deusto.es/ltw/0.1#PropertyItem" );
    
}
