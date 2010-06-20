// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package org.iesc.flightws.domain;

/**
 * 
 */
public abstract class FlightDate
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -3351333382162507315L;

    private java.sql.Timestamp departureDate;

    /**
     * 
     */
    public java.sql.Timestamp getDepartureDate()
    {
        return this.departureDate;
    }

    public void setDepartureDate(java.sql.Timestamp departureDate)
    {
        this.departureDate = departureDate;
    }

    private java.sql.Timestamp arrivalDate;

    /**
     * 
     */
    public java.sql.Timestamp getArrivalDate()
    {
        return this.arrivalDate;
    }

    public void setArrivalDate(java.sql.Timestamp arrivalDate)
    {
        this.arrivalDate = arrivalDate;
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

    private java.util.Collection prices = new java.util.HashSet();

    /**
     * 
     */
    public java.util.Collection getPrices()
    {
        return this.prices;
    }

    public void setPrices(java.util.Collection prices)
    {
        this.prices = prices;
    }

    private org.iesc.flightws.domain.Plane plane;

    /**
     * 
     */
    public org.iesc.flightws.domain.Plane getPlane()
    {
        return this.plane;
    }

    public void setPlane(org.iesc.flightws.domain.Plane plane)
    {
        this.plane = plane;
    }

    /**
     * Returns <code>true</code> if the argument is an FlightDate instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof FlightDate))
        {
            return false;
        }
        final FlightDate that = (FlightDate)object;
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
     * Constructs new instances of {@link org.iesc.flightws.domain.FlightDate}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link org.iesc.flightws.domain.FlightDate}.
         */
        public static org.iesc.flightws.domain.FlightDate newInstance()
        {
            return new org.iesc.flightws.domain.FlightDateImpl();
        }


        /**
         * Constructs a new instance of {@link org.iesc.flightws.domain.FlightDate}, taking all possible properties
         * (except the identifier(s))as arguments.
         */
        public static org.iesc.flightws.domain.FlightDate newInstance(java.sql.Timestamp departureDate, java.sql.Timestamp arrivalDate, java.util.Collection prices, org.iesc.flightws.domain.Plane plane)
        {
            final org.iesc.flightws.domain.FlightDate entity = new org.iesc.flightws.domain.FlightDateImpl();
            entity.setDepartureDate(departureDate);
            entity.setArrivalDate(arrivalDate);
            entity.setPrices(prices);
            entity.setPlane(plane);
            return entity;
        }
    }
    
// HibernateEntity.vsl merge-point
}