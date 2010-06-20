// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package org.iesc.flightws.domain;

/**
 * 
 */
public abstract class City
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 2352216180238924323L;

    private java.lang.String name;

    /**
     * 
     */
    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.lang.String codeIATA;

    /**
     * 
     */
    public java.lang.String getCodeIATA()
    {
        return this.codeIATA;
    }

    public void setCodeIATA(java.lang.String codeIATA)
    {
        this.codeIATA = codeIATA;
    }

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
     * Returns <code>true</code> if the argument is an City instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof City))
        {
            return false;
        }
        final City that = (City)object;
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
     * Constructs new instances of {@link org.iesc.flightws.domain.City}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link org.iesc.flightws.domain.City}.
         */
        public static org.iesc.flightws.domain.City newInstance()
        {
            return new org.iesc.flightws.domain.CityImpl();
        }


        /**
         * Constructs a new instance of {@link org.iesc.flightws.domain.City}, taking all possible properties
         * (except the identifier(s))as arguments.
         */
        public static org.iesc.flightws.domain.City newInstance(java.lang.String name, java.lang.String codeIATA)
        {
            final org.iesc.flightws.domain.City entity = new org.iesc.flightws.domain.CityImpl();
            entity.setName(name);
            entity.setCodeIATA(codeIATA);
            return entity;
        }
    }
    
// HibernateEntity.vsl merge-point
}