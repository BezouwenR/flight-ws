// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package org.iesc.flightws.vo;

/**
 * 
 */
public class FlightDateVO
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 6523312206984361013L;

    public FlightDateVO()
    {
    }

    public FlightDateVO(java.lang.Long departureDate, java.lang.Long arrivalDate, org.iesc.flightws.vo.PlaneVO plane)
    {
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.plane = plane;
    }

    /**
     * Copies constructor from other FlightDateVO
     *
     * @param otherBean, cannot be <code>null</code>
     * @throws java.lang.NullPointerException if the argument is <code>null</code>
     */
    public FlightDateVO(FlightDateVO otherBean)
    {
        this(otherBean.getDepartureDate(), otherBean.getArrivalDate(), otherBean.getPlane());
    }

    /**
     * Copies all properties from the argument value object into this value object.
     */
    public void copy(FlightDateVO otherBean)
    {
        if (otherBean != null)
        {
            this.setDepartureDate(otherBean.getDepartureDate());
            this.setArrivalDate(otherBean.getArrivalDate());
            this.setPlane(otherBean.getPlane());
        }
    }

    private java.lang.Long departureDate;

    /**
     * 
     */
    public java.lang.Long getDepartureDate()
    {
        return this.departureDate;
    }

    public void setDepartureDate(java.lang.Long departureDate)
    {
        this.departureDate = departureDate;
    }

    private java.lang.Long arrivalDate;

    /**
     * 
     */
    public java.lang.Long getArrivalDate()
    {
        return this.arrivalDate;
    }

    public void setArrivalDate(java.lang.Long arrivalDate)
    {
        this.arrivalDate = arrivalDate;
    }

    private org.iesc.flightws.vo.PlaneVO plane;

    /**
     * 
     */
    public org.iesc.flightws.vo.PlaneVO getPlane()
    {
        return this.plane;
    }

    public void setPlane(org.iesc.flightws.vo.PlaneVO plane)
    {
        this.plane = plane;
    }

    // org.iesc.flightws.vo.FlightDateVO value-object java merge-point
}