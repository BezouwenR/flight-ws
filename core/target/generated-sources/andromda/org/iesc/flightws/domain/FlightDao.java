// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringDao.vsl in andromda-spring-cartridge.
//
package org.iesc.flightws.domain;

/**
 * @see org.iesc.flightws.domain.Flight
 */
public interface FlightDao
{
    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p>
     * This specific flag denotes no transformation will occur.
     */
    public final static int TRANSFORM_NONE = 0;


    /**
     * Transforms the given results to a collection of {@link com.lighthousepmg.plz.domain.messaging.persistence.CommunicationCategory}
     * instances (this is useful when the returned results contains a row of data and you want just entities only).
     *
     * @param the query results.
     */
    public void toEntities(final java.util.Collection results);

    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p>
     * This specific flag denotes entities must be transformed into objects of type
     * {@link org.iesc.flightws.vo.FlightVO}.
     */
    public final static int TRANSFORM_FLIGHTVO = 1;

    /**
     * Copies the fields of the specified entity to the target value object. This method is similar to
     * toFlightVO(), but it does not handle any attributes in the target
     * value object that are "read-only" (as those do not have setter methods exposed).
     */
    public void toFlightVO(
        org.iesc.flightws.domain.Flight source,
        org.iesc.flightws.vo.FlightVO target);


    /**
     * Converts this DAO's entity to an object of type {@link org.iesc.flightws.vo.FlightVO}.
     */
    public org.iesc.flightws.vo.FlightVO toFlightVO(org.iesc.flightws.domain.Flight entity);

    /**
     * Converts this DAO's entity to a Collection of instances of type {@link org.iesc.flightws.vo.FlightVO}.
     */
    public void toFlightVOCollection(java.util.Collection entities);

    /**
     * Converts this DAO's entity to an array of instances of type {@link org.iesc.flightws.vo.FlightVO}.
     */
    public org.iesc.flightws.vo.FlightVO[] toFlightVOArray(java.util.Collection entities);

    /**
     * Copies the fields of {@link org.iesc.flightws.vo.FlightVO} to the specified entity.
     * @param copyIfNull If FALSE, the value object's field will not be copied to the entity if the value is NULL. If TRUE,
     * it will be copied regardless of its value.
     */
    public void flightVOToEntity(
        org.iesc.flightws.vo.FlightVO source,
        org.iesc.flightws.domain.Flight target,
        boolean copyIfNull);

    /**
     * Converts an instance of type {@link org.iesc.flightws.vo.FlightVO} to this DAO's entity.
     */
    public org.iesc.flightws.domain.Flight flightVOToEntity(org.iesc.flightws.vo.FlightVO flightVO);

    /**
     * Converts a Collection of instances of type {@link org.iesc.flightws.vo.FlightVO} to this
     * DAO's entity.
     */
    public void flightVOToEntityCollection(java.util.Collection instances);

    /**
     * Loads an instance of org.iesc.flightws.domain.Flight from the persistent store.
     */
    public org.iesc.flightws.domain.Flight load(java.lang.Long id);

    /**
     * <p>
     * Does the same thing as {@link #load(java.lang.Long)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined in this class then the result <strong>WILL BE</strong> passed through an operation which can
     * optionally transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param id the identifier of the entity to load.
     * @return either the entity or the object transformed from the entity.
     */
    public Object load(int transform, java.lang.Long id);

    /**
     * Loads all entities of type {@link org.iesc.flightws.domain.Flight}.
     *
     * @return the loaded entities.
     */
    public java.util.Collection loadAll();

    /**
     * <p>
     * Does the same thing as {@link #loadAll()} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param transform the flag indicating what transformation to use.
     * @return the loaded entities.
     */
    public java.util.Collection loadAll(final int transform);

    /**
     * <p>
     * Does the same thing as {@link #loadAll()} with an
     * additional two arguments called <code>pageNumber</code> and <code>pageSize</code>. The <code>pageNumber</code>
     * argument allows you to specify the page number when you are paging the results and the pageSize allows you to specify the size of the
     * page retrieved.
     * </p>
     *
     * @param pageNumber the page number to retrieve when paging results.
     * @param pageSize the size of the page to retrieve when paging results.
     * @return the loaded entities.
     */
    public java.util.Collection loadAll(final int pageNumber, final int pageSize);

    /**
     * <p>
     * Does the same thing as {@link #loadAll(int)} with an
     * additional two arguments called <code>pageNumber</code> and <code>pageSize</code>. The <code>pageNumber</code>
     * argument allows you to specify the page number when you are paging the results and the pageSize allows you to specify the size of the
     * page retrieved.
     * </p>
     *
     * @param transform the flag indicating what transformation to use.
     * @param pageNumber the page number to retrieve when paging results.
     * @param pageSize the size of the page to retrieve when paging results.
     * @return the loaded entities.
     */
    public java.util.Collection loadAll(final int transform, final int pageNumber, final int pageSize);

    /**
     * Creates an instance of org.iesc.flightws.domain.Flight and adds it to the persistent store.
     */
    public org.iesc.flightws.domain.Flight create(org.iesc.flightws.domain.Flight flight);

    /**
     * <p>
     * Does the same thing as {@link #create(org.iesc.flightws.domain.Flight)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     */
    public Object create(int transform, org.iesc.flightws.domain.Flight flight);

    /**
     * Creates a new instance of org.iesc.flightws.domain.Flight and adds
     * from the passed in <code>entities</code> collection
     *
     * @param entities the collection of org.iesc.flightws.domain.Flight
     * instances to create.
     *
     * @return the created instances.
     */
    public java.util.Collection create(java.util.Collection entities);

    /**
     * <p>
     * Does the same thing as {@link #create(org.iesc.flightws.domain.Flight)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     * </p>
     */
    public java.util.Collection create(int transform, java.util.Collection entities);

    /**
     * <p>
     * Creates a new <code>org.iesc.flightws.domain.Flight</code>
     * instance from <strong>all</strong> attributes and adds it to
     * the persistent store.
     * </p>
     */
    public org.iesc.flightws.domain.Flight create(
        java.lang.String code);

    /**
     * <p>
     * Does the same thing as {@link #create(java.lang.String)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     */
    public Object create(
        int transform,
        java.lang.String code);

    /**
     * <p>
     * Creates a new <code>org.iesc.flightws.domain.Flight</code>
     * instance from only <strong>required</strong> properties (attributes
     * and association ends) and adds it to the persistent store.
     * </p>
     */
    public org.iesc.flightws.domain.Flight create(
        java.lang.String code,
        org.iesc.flightws.domain.City departureCity,
        org.iesc.flightws.domain.City destinationCity);

    /**
     * <p>
     * Does the same thing as {@link #create(java.lang.String)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     */
    public Object create(
        int transform,
        java.lang.String code,
        org.iesc.flightws.domain.City departureCity,
        org.iesc.flightws.domain.City destinationCity);

    /**
     * Updates the <code>flight</code> instance in the persistent store.
     */
    public void update(org.iesc.flightws.domain.Flight flight);

    /**
     * Updates all instances in the <code>entities</code> collection in the persistent store.
     */
    public void update(java.util.Collection entities);

    /**
     * Removes the instance of org.iesc.flightws.domain.Flight from the persistent store.
     */
    public void remove(org.iesc.flightws.domain.Flight flight);

    /**
     * Removes the instance of org.iesc.flightws.domain.Flight having the given
     * <code>identifier</code> from the persistent store.
     */
    public void remove(java.lang.Long id);

    /**
     * Removes all entities in the given <code>entities</code> collection.
     */
    public void remove(java.util.Collection entities);


    /**
     * Does the same thing as {@link #search(int, org.iesc.flightws.Search) but with an
     * additional two flags called <code>pageNumber</code> and <code>pageSize</code>. These flags allow you to
     * limit your data to a specified page number and size.
     *
     * @param transform the transformation flag.
     * @param pageNumber the page number in the data to retrieve
     * @param pageSize the size of the page to retrieve.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search wrapped in a {@link org.iesc.flightws.PaginationResult} instance.
     */
    public org.iesc.flightws.PaginationResult search(final int transform, final int pageNumber, final int pageSize, final org.iesc.flightws.Search search);

    /**
     * Does the same thing as {@link #search(org.iesc.flightws.Search) but with an
     * additional two flags called <code>pageNumber</code> and <code>pageSize</code>. These flags allow you to
     * limit your data to a specified page number and size.
     *
     * @param pageNumber the page number in the data to retrieve
     * @param pageSize the size of the page to retrieve.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search wrapped in a {@link org.iesc.flightws.PaginationResult} instance.
     */
    public org.iesc.flightws.PaginationResult search(final int pageNumber, final int pageSize, final org.iesc.flightws.Search search);

    /**
     * Does the same thing as {@link #search(org.iesc.flightws.Search)} but with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * finder results will <strong>NOT</strong> be transformed during retrieval.
     * If this flag is any of the other constants defined here
     * then results <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     *
     * @param transform the transformation flag.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search.
     */
    public java.util.Set search(final int transform, final org.iesc.flightws.Search search);

    /**
     * Performs a search using the parameters specified in the given <code>search</code> object.
     *
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search.
     */
    public java.util.Set search(final org.iesc.flightws.Search search);

    // spring-dao merge-point
}