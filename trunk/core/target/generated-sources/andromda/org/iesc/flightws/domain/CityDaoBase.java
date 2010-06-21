// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringHibernateDaoBase.vsl in andromda-spring-cartridge.
//
package org.iesc.flightws.domain;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>org.iesc.flightws.domain.City</code>.
 * </p>
 *
 * @see org.iesc.flightws.domain.City
 */
public abstract class CityDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements org.iesc.flightws.domain.CityDao
{

    /**
     * @see org.iesc.flightws.domain.CityDao#load(int, java.lang.Long)
     */
    public java.lang.Object load(final int transform, final java.lang.Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "City.load - 'id' can not be null");
        }
        final java.lang.Object entity = this.getHibernateTemplate().get(org.iesc.flightws.domain.CityImpl.class, id);
        return transformEntity(transform, (org.iesc.flightws.domain.City)entity);
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#load(java.lang.Long)
     */
    public org.iesc.flightws.domain.City load(java.lang.Long id)
    {
        return (org.iesc.flightws.domain.City)this.load(TRANSFORM_NONE, id);
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#loadAll()
     */
    public java.util.Collection loadAll()
    {
        return this.loadAll(TRANSFORM_NONE);
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#loadAll(int)
     */
    public java.util.Collection loadAll(final int transform)
    {
        return this.loadAll(transform, -1, -1);
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#loadAll(int, int)
     */
    public java.util.Collection loadAll(final int pageNumber, final int pageSize)
    {
        return this.loadAll(TRANSFORM_NONE, pageNumber, pageSize);
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#loadAll(int, int, int)
     */
    public java.util.Collection loadAll(final int transform, final int pageNumber, final int pageSize)
    {
        try
        {
            final org.hibernate.Criteria criteria = this.getSession(false).createCriteria(org.iesc.flightws.domain.CityImpl.class);
			criteria.setCacheable(true);
            if (pageNumber > 0 && pageSize > 0)
            {
                criteria.setFirstResult(this.calculateFirstResult(pageNumber, pageSize));
                criteria.setMaxResults(pageSize);
            }
            final java.util.Collection results = criteria.list();
            this.transformEntities(transform, results);
            return results;
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    protected int calculateFirstResult(int pageNumber, int pageSize)
    {
        int firstResult = 0;
        if (pageNumber > 0)
        {
            firstResult = (pageNumber - 1) * pageSize;
        }
        return firstResult;
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#create(org.iesc.flightws.domain.City)
     */
    public org.iesc.flightws.domain.City create(org.iesc.flightws.domain.City city)
    {
        return (org.iesc.flightws.domain.City)this.create(TRANSFORM_NONE, city);
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#create(int transform, org.iesc.flightws.domain.City)
     */
    public java.lang.Object create(final int transform, final org.iesc.flightws.domain.City city)
    {
        if (city == null)
        {
            throw new IllegalArgumentException(
                "City.create - 'city' can not be null");
        }
        this.getHibernateTemplate().save(city);
        return this.transformEntity(transform, city);
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#create(java.util.Collection)
     */
    public java.util.Collection create(final java.util.Collection entities)
    {
        return create(TRANSFORM_NONE, entities);
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#create(int, java.util.Collection)
     */
    public java.util.Collection create(final int transform, final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "City.create - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public java.lang.Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        create(transform, (org.iesc.flightws.domain.City)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
        return entities;
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#create(java.lang.String, java.lang.String)
     */
    public org.iesc.flightws.domain.City create(
        java.lang.String name,
        java.lang.String codeIATA)
    {
        return (org.iesc.flightws.domain.City)this.create(TRANSFORM_NONE, name, codeIATA);
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#create(int, java.lang.String, java.lang.String)
     */
    public java.lang.Object create(
        final int transform,
        java.lang.String name,
        java.lang.String codeIATA)
    {
        org.iesc.flightws.domain.City entity = new org.iesc.flightws.domain.CityImpl();
        entity.setName(name);
        entity.setCodeIATA(codeIATA);
        return this.create(transform, entity);
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#update(org.iesc.flightws.domain.City)
     */
    public void update(org.iesc.flightws.domain.City city)
    {
        if (city == null)
        {
            throw new IllegalArgumentException(
                "City.update - 'city' can not be null");
        }
        this.getHibernateTemplate().update(city);
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#update(java.util.Collection)
     */
    public void update(final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "City.update - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public java.lang.Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        update((org.iesc.flightws.domain.City)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#remove(org.iesc.flightws.domain.City)
     */
    public void remove(org.iesc.flightws.domain.City city)
    {
        if (city == null)
        {
            throw new IllegalArgumentException(
                "City.remove - 'city' can not be null");
        }
        this.getHibernateTemplate().delete(city);
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#remove(java.lang.Long)
     */
    public void remove(java.lang.Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "City.remove - 'id' can not be null");
        }
        org.iesc.flightws.domain.City entity = this.load(id);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#remove(java.util.Collection)
     */
    public void remove(java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "City.remove - 'entities' can not be null");
        }
        this.getHibernateTemplate().deleteAll(entities);
    }
    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>org.iesc.flightws.domain.CityDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link org.iesc.flightws.domain.City} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link org.iesc.flightws.vo.CityVO} - {@link TRANSFORM_CITYVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link org.iesc.flightws.domain.CityDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,java.util.Collection)
     */
    protected java.lang.Object transformEntity(final int transform, final org.iesc.flightws.domain.City entity)
    {
        java.lang.Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case TRANSFORM_CITYVO :
                    target = toCityVO(entity);
                    break;
                case TRANSFORM_NONE : // fall-through
                default:
                    target = entity;
            }
        }
        return target;
    }

    /**
     * Transforms a collection of entities using the
     * {@link #transformEntity(int,org.iesc.flightws.domain.City)}
     * method. This method does not instantiate a new collection.
     * <p>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>org.iesc.flightws.domain.CityDao</code>
     * @param entities the collection of entities to transform
     * @see #transformEntity(int,org.iesc.flightws.domain.City)
     */
    protected void transformEntities(final int transform, final java.util.Collection entities)
    {
        switch (transform)
        {
            case TRANSFORM_CITYVO :
                toCityVOCollection(entities);
                break;
            case TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#toEntities(java.util.Collection)
     */
    public void toEntities(final java.util.Collection results)
    {
        if (results != null)
        {
            org.apache.commons.collections.CollectionUtils.transform(results, ENTITYTRANSFORMER);
        }
    }

    /**
     * This anonymous transformer is designed to transform report query results
     * (which result in an array of entities) to {@link org.iesc.flightws.domain.City}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private org.apache.commons.collections.Transformer ENTITYTRANSFORMER =
        new org.apache.commons.collections.Transformer()
        {
            public java.lang.Object transform(java.lang.Object input)
            {
                java.lang.Object result = null;
                if (input instanceof java.lang.Object[])
                {
                    result = toEntity((java.lang.Object[])input);
                }
                else if (input instanceof org.iesc.flightws.domain.City)
                {
                    result = input;
                }
                return result;
            }
        };

    protected org.iesc.flightws.domain.City toEntity(java.lang.Object[] row)
    {
        org.iesc.flightws.domain.City target = null;
        if (row != null)
        {
            final int numberOfObjects = row.length;
            for (int ctr = 0; ctr < numberOfObjects; ctr++)
            {
                final java.lang.Object object = row[ctr];
                if (object instanceof org.iesc.flightws.domain.City)
                {
                    target = (org.iesc.flightws.domain.City)object;
                    break;
                }
            }
        }
        return target;
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#toCityVOCollection(java.util.Collection)
     */
    public final void toCityVOCollection(java.util.Collection entities)
    {
        if (entities != null)
        {
            org.apache.commons.collections.CollectionUtils.transform(entities, CITYVO_TRANSFORMER);
        }
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#toCityVOArray(java.util.Collection)
     */
    public final org.iesc.flightws.vo.CityVO[] toCityVOArray(java.util.Collection entities)
    {
        org.iesc.flightws.vo.CityVO[] result = null;
        if (entities != null)
        {
            final java.util.Collection collection = new java.util.ArrayList(entities);
            this.toCityVOCollection(collection);
            result = (org.iesc.flightws.vo.CityVO[]) collection.toArray(new org.iesc.flightws.vo.CityVO[0]);
        }
        return result;
    }

    /**
     * Default implementation for transforming the results of a report query into a value object. This
     * implementation exists for convenience reasons only. It needs only be overridden in the
     * {@link CityDaoImpl} class if you intend to use reporting queries.
     * @see org.iesc.flightws.domain.CityDao#toCityVO(org.iesc.flightws.domain.City)
     */
    protected org.iesc.flightws.vo.CityVO toCityVO(java.lang.Object[] row)
    {
        return this.toCityVO(this.toEntity(row));
    }

    /**
     * This anonymous transformer is designed to transform entities or report query results
     * (which result in an array of objects) to {@link org.iesc.flightws.vo.CityVO}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private org.apache.commons.collections.Transformer CITYVO_TRANSFORMER =
        new org.apache.commons.collections.Transformer()
        {
            public java.lang.Object transform(java.lang.Object input)
            {
                java.lang.Object result = null;
                if (input instanceof org.iesc.flightws.domain.City)
                {
                    result = toCityVO((org.iesc.flightws.domain.City)input);
                }
                else if (input instanceof java.lang.Object[])
                {
                    result = toCityVO((java.lang.Object[])input);
                }
                return result;
            }
        };

    /**
     * @see org.iesc.flightws.domain.CityDao#cityVOToEntityCollection(java.util.Collection)
     */
    public final void cityVOToEntityCollection(java.util.Collection instances)
    {
        if (instances != null)
        {
            for (final java.util.Iterator iterator = instances.iterator(); iterator.hasNext();)
            {
                // - remove an objects that are null or not of the correct instance
                if (!(iterator.next() instanceof org.iesc.flightws.vo.CityVO))
                {
                    iterator.remove();
                }
            }
            org.apache.commons.collections.CollectionUtils.transform(instances, CityVOToEntityTransformer);
        }
    }

    private final org.apache.commons.collections.Transformer CityVOToEntityTransformer =
        new org.apache.commons.collections.Transformer()
        {
            public java.lang.Object transform(java.lang.Object input)
            {
                return cityVOToEntity((org.iesc.flightws.vo.CityVO)input);
            }
        };


    /**
     * @see org.iesc.flightws.domain.CityDao#toCityVO(org.iesc.flightws.domain.City, org.iesc.flightws.vo.CityVO)
     */
    public void toCityVO(
        org.iesc.flightws.domain.City source,
        org.iesc.flightws.vo.CityVO target)
    {
        target.setName(source.getName());
        target.setCodeIATA(source.getCodeIATA());
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#toCityVO(org.iesc.flightws.domain.City)
     */
    public org.iesc.flightws.vo.CityVO toCityVO(final org.iesc.flightws.domain.City entity)
    {
        org.iesc.flightws.vo.CityVO target = null;
        if (entity != null)
        {
            target = new org.iesc.flightws.vo.CityVO();
            this.toCityVO(entity, target);
        }
        return target;
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#cityVOToEntity(org.iesc.flightws.vo.CityVO, org.iesc.flightws.domain.City)
     */
    public void cityVOToEntity(
        org.iesc.flightws.vo.CityVO source,
        org.iesc.flightws.domain.City target,
        boolean copyIfNull)
    {
        if (copyIfNull || source.getName() != null)
        {
            target.setName(source.getName());
        }
        if (copyIfNull || source.getCodeIATA() != null)
        {
            target.setCodeIATA(source.getCodeIATA());
        }
    }

    /**
     * Gets the current <code>principal</code> if one has been set,
     * otherwise returns <code>null</code>.
     *
     * @return the current principal
     */
    protected java.security.Principal getPrincipal()
    {
        return org.iesc.flightws.PrincipalStore.get();
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#search(int, int, int, org.iesc.flightws.Search)
     */
    public org.iesc.flightws.PaginationResult search(final int transform, final int pageNumber, final int pageSize, final org.iesc.flightws.Search search)
    {
        try
        {
            search.setPageNumber(pageNumber);
            search.setPageSize(pageSize);
            final org.iesc.flightws.PropertySearch propertySearch = new org.iesc.flightws.PropertySearch(
                this.getSession(false), org.iesc.flightws.domain.CityImpl.class, search);
            final java.util.List results = propertySearch.executeAsList();
            this.transformEntities(transform, results);
            return new org.iesc.flightws.PaginationResult(results.toArray(new java.lang.Object[0]), propertySearch.getTotalCount());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#search(int, int, org.iesc.flightws.Search)
     */
    public org.iesc.flightws.PaginationResult search(final int pageNumber, final int pageSize, final org.iesc.flightws.Search search)
    {
        return this.search(TRANSFORM_NONE, pageNumber, pageSize, search);
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#search(int, org.iesc.flightws.Search)
     */
    public java.util.Set search(final int transform, final org.iesc.flightws.Search search)
    {
        try
        {
            final org.iesc.flightws.PropertySearch propertySearch = new org.iesc.flightws.PropertySearch(
                this.getSession(false), org.iesc.flightws.domain.CityImpl.class, search);
            final java.util.Set results = propertySearch.executeAsSet();
            this.transformEntities(transform, results);
            return results;
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * @see org.iesc.flightws.domain.CityDao#search(org.iesc.flightws.Search)
     */
    public java.util.Set search(final org.iesc.flightws.Search search)
    {
        return this.search(TRANSFORM_NONE, search);
    }

    // spring-hibernate-dao-base merge-point
}