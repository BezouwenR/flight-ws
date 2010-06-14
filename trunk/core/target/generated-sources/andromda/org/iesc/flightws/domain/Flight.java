// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package org.iesc.flightws.domain;

/**
 * 
 */
public abstract class Flight
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 853675559340037093L;

    private java.lang.Long id;

    /**
     * 
     */
    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    /**
     * Returns <code>true</code> if the argument is an Flight instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof Flight))
        {
            return false;
        }
        final Flight that = (Flight)object;
        if (this.id == null || that.getId() == null || !this.id.equals(that.getId()))
        {
            return false;
        }
        return true;
    }

    /**
     * Returns a hash code based on this entity's identifiers.
     */
    public int hashCode()
    {
        int hashCode = 0;
        hashCode = 29 * hashCode + (id == null ? 0 : id.hashCode());

        return hashCode;
    }

    /**
     * Constructs new instances of {@link org.iesc.flightws.domain.Flight}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link org.iesc.flightws.domain.Flight}.
         */
        public static org.iesc.flightws.domain.Flight newInstance()
        {
            return new org.iesc.flightws.domain.FlightImpl();
        }

    }
    
// HibernateEntity.vsl merge-point
}