// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateSearchParameter.vsl in andromda-spring-cartridge.
//
package org.iesc.flightws;

import java.util.regex.Pattern;

/**
 * A <code>CriteriaSearchParameter</code> represents a parameter for a <code>CriteriaSearch</code>.
 * <br>
 * <br>
 * The <code>parameterValue</code> is the actual value to be searched for.
 * <br>
 * <br>
 * The <code>parameterPattern</code> describes the actual parameter which shall be considered for
 * the search. It contains the dot-seperated path and the name of the parameter starting at the
 * rootEntity of the actual <code>CriteriaSearch</code>. The pattern of a the street of an address
 * of a person would look like <i>address.street </i> (assuming the entity structure to be
 * <code>aPerson.getAddress().getStreet()</code>).
 * <br>
 * <br>
 * Usually, if a parameter is <code>null</code> (or if the parameter is of type <code>String</code>
 * and empty), it is not considered for a search. If <code>searchIfNull</code> is <code>true</code>
 * it is explicitly searched for the parameter to be null (or empty if the parameter is of type
 * <code>String</code>).<br>
 * <br>
 * The <code>comparator</code> defines the comparator for the parameter. For parameters of type
 * <code>String</code> the default comparator is the <code>LIKE_COMPARATOR</code>. The
 * <code>EQUAL_COMPARATOR</code> is default for other parameters.
 *
 * @author Stefan Reichert
 * @author Peter Friese
 * @author Chad Brandon
 */
public class CriteriaSearchParameter
    extends SearchParameter
{
    public static final Pattern PATTERN = Pattern.compile("\\.");

    /** Order relevance not set */
    public static final int RELEVANCE_UNSET = -1;

    private Object parameterValue;
    private String parameterPattern;
    private org.hibernate.criterion.MatchMode matchMode = null;
    private int orderDirection = ORDER_UNSET;
    private int orderRelevance = RELEVANCE_UNSET;

    /**
     * Constructor for CriteriaSearchParameter. Sets <code>searchIfNull</code> to
     * <code>false</code> and uses the <code>EQUAL_COMPARATOR</code>.
     *
     * @param parameterValue The actual value of the parameter.
     * @param parameterPattern The pattern of this parameter (dot-seperated path e.g. person.address.street).
     */
    public CriteriaSearchParameter(Object parameterValue, String parameterPattern)
    {
        this(parameterValue, parameterPattern, false, EQUAL_COMPARATOR);
    }

    /**
     * Constructor for CriteriaSearchParameter for a <code>String</code> parameter.
     * Sets <code>searchIfNull</code> to <code>false</code> and uses the
     * <code>LIKE_COMPARATOR</code>.
     *
     * @param parameterValue The actual value of the parameter.
     * @param parameterPattern The pattern of this parameter (dot-seperated path e.g. person.address.street).
     */
    public CriteriaSearchParameter(String parameterValue, String parameterPattern)
    {
        this(parameterValue, parameterPattern, false, LIKE_COMPARATOR);
    }

    /**
     * Constructor for CriteriaSearchParameter for a <code>String[]</code> parameter.
     * Sets <code>searchIfNull</code> to <code>false</code> and uses the
     * <code>LIKE_COMPARATOR</code>.
     *
     * @param parameterValue The actual value of the parameter.
     * @param parameterPattern The pattern of this parameter (dot-seperated path e.g. person.address.street).
     */
    public CriteriaSearchParameter(String[] parameterValue, String parameterPattern)
    {
        this(parameterValue, parameterPattern, false, LIKE_COMPARATOR);
    }

    /**
     * Constructor for CriteriaSearchParameter. Sets <code>searchIfNull</code> to <code>false</code>.
     *
     * @param parameterValue The actual value of the parameter.
     * @param parameterPattern The pattern of this parameter (dot-seperated path e.g. person.address.street).
     */
    public CriteriaSearchParameter(Object parameterValue, String parameterPattern, int comparator)
    {
        this(parameterValue, parameterPattern, false, comparator);
    }

    /**
     * Constructor for CriteriaSearchParameter.
     *
     * @param parameterValue The actual value of the parameter.
     * @param parameterPattern The pattern of this parameter (dot-seperated path e.g. person.address.street).
     * @param searchIfNull Indicates whether the query should contain an
     *     <code>IS NULL</code> if the parameter is <code>null</code>.
     */
    public CriteriaSearchParameter(
        Object parameterValue,
        String parameterPattern,
        boolean searchIfNull)
    {
        this(parameterValue, parameterPattern, searchIfNull, EQUAL_COMPARATOR);
    }

    /**
     * Constructor for CriteriaSearchParameter.
     *
     * @param parameterValue The actual value of the parameter.
     * @param parameterPattern The pattern of this parameter (dot-seperated path e.g. person.address.street).
     * @param searchIfNull Indicates whether the query should contain an
     *     <code>IS NULL</code> if the parameter is <code>null</code>.
     */
    public CriteriaSearchParameter(
        String parameterValue,
        String parameterPattern,
        boolean searchIfNull)
    {
        this(parameterValue, parameterPattern, searchIfNull, LIKE_COMPARATOR);
    }

    /**
     * Constructor for CriteriaSearchParameter.
     *
     * @param parameterValue The actual value of the parameter.
     * @param parameterPattern The pattern of this parameter (dot-seperated path e.g. person.address.street).
     * @param searchIfNull Indicates whether the query should contain an
     *     <code>IS NULL</code> if the parameter is <code>null</code>.
     */
    public CriteriaSearchParameter(
        String[] parameterValue,
        String parameterPattern,
        boolean searchIfNull)
    {
        this(parameterValue, parameterPattern, searchIfNull, LIKE_COMPARATOR);
    }

    /**
     * Constructor for CriteriaSearchParameter.
     *
     * @param parameterValue The actual value of the parameter.
     * @param parameterPattern The pattern of this parameter (dot-seperated path e.g. person.address.street).
     * @param searchIfNull Indicates whether the query should contain an
     *     <code>IS NULL</code> if the parameter is <code>null</code>.
     * @param comparator Indicates what comparator is to be used (e.g. like, =, <, ...).
     */
    public CriteriaSearchParameter(
        Object parameterValue,
        String parameterPattern,
        boolean searchIfNull,
        int comparator)
    {
        super(parameterPattern, parameterValue);
        this.parameterValue = parameterValue;
        this.parameterPattern = parameterPattern;
        super.setSearchIfNull(searchIfNull);
        this.setComparator(comparator);
    }

    /**
     * Constructor for CriteriaSearchParameter.
     *
     * @param parameterValue The actual value of the parameter.
     * @param parameterPattern The pattern of this parameter (dot-seperated path e.g. person.address.street).
     * @param searchIfNull Indicates whether the query should contain an
     *     <code>IS NULL</code> if the parameter is <code>null</code>.
     * @param matchMode The hibernate matchmode to be used in string comparisons.
     */
    public CriteriaSearchParameter(
        Object parameterValue,
        String parameterPattern,
        boolean searchIfNull,
        org.hibernate.criterion.MatchMode matchMode)
    {
         this(parameterValue, parameterPattern, searchIfNull);
         this.matchMode = matchMode;
    }

    /**
     * Constructor for CriteriaSearchParameter.
     *
     * @param parameterValue The actual value of the parameter.
     * @param parameterPattern The pattern of this parameter (dot-seperated path e.g. person.address.street).
     * @param searchIfNull Indicates whether the query should contain an
     *     <code>IS NULL</code> if the parameter is <code>null</code>.
     * @param matchMode The hibernate matchmode to be used in string comparisons.
     */
    public CriteriaSearchParameter(
        String parameterValue,
        String parameterPattern,
        boolean searchIfNull,
        org.hibernate.criterion.MatchMode matchMode)
    {
        this(parameterValue, parameterPattern, searchIfNull);
        this.matchMode = matchMode;
    }

    /**
     * Constructor for CriteriaSearchParameter.
     *
     * @param parameterValue The actual value of the parameter.
     * @param parameterPattern The pattern of this parameter (dot-seperated path e.g. person.address.street).
     * @param searchIfNull Indicates whether the query should contain an
     *     <code>IS NULL</code> if the parameter is <code>null</code>.
     * @param matchMode The hibernate matchmode to be used in string comparisons.
     */
    public CriteriaSearchParameter(
        String[] parameterValue,
        String parameterPattern,
        boolean searchIfNull,
        org.hibernate.criterion.MatchMode matchMode)
    {
        this(parameterValue, parameterPattern, searchIfNull);
        this.matchMode = matchMode;
    }

    /**
     * Constructor for CriteriaSearchParameter.
     *
     * @param parameterValue The actual value of the parameter.
     * @param parameterPattern The pattern of this parameter (dot-seperated path e.g. person.address.street).
     * @param searchIfNull Indicates whether the query should contain an
     *     <code>IS NULL</code> if the parameter is <code>null</code>.
     * @param comparator Indicates what comparator is to be used (e.g. like, =, <, ...).
     * @param matchMode The hibernate matchmode to be used in string comparisons.
     */
    public CriteriaSearchParameter(
        String parameterValue,
        String parameterPattern,
        boolean searchIfNull,
        int comparator,
        org.hibernate.criterion.MatchMode matchMode)
    {
        this(parameterValue, parameterPattern, searchIfNull, comparator);
        this.matchMode = matchMode;
    }

    /**
     * Constructor for CriteriaSearchParameter.
     *
     * @param parameterValue The actual value of the parameter.
     * @param parameterPattern The pattern of this parameter (dot-seperated path e.g. person.address.street).
     * @param comparator Indicates what comparator is to be used (e.g. like, =, <, ...).
     * @param matchMode The hibernate matchmode to be used in string comparisons.
     */
    public CriteriaSearchParameter(
        Object parameterValue,
        String parameterPattern,
        int comparator,
        org.hibernate.criterion.MatchMode matchMode)
    {
        this(parameterValue, parameterPattern, comparator);
        this.matchMode = matchMode;
    }

    /**
     * Constructor for CriteriaSearchParameter.
     *
     * @param parameterValue The actual value of the parameter.
     * @param parameterPattern The pattern of this parameter (dot-seperated path e.g. person.address.street).
     * @param matchMode The hibernate matchmode to be used in string comparisons.
     */
    public CriteriaSearchParameter(
        Object parameterValue,
        String parameterPattern,
        org.hibernate.criterion.MatchMode matchMode)
    {
        this(parameterValue, parameterPattern);
        this.matchMode = matchMode;
    }

    /**
     * Constructor for CriteriaSearchParameter.
     *
     * @param parameterValue The actual value of the parameter.
     * @param parameterPattern The pattern of this parameter (dot-seperated path e.g. person.address.street).
     * @param matchMode The hibernate matchmode to be used in string comparisons.
     */
    public CriteriaSearchParameter(
        String parameterValue,
        String parameterPattern,
        org.hibernate.criterion.MatchMode matchMode)
    {
        this(parameterValue, parameterPattern);
        this.matchMode = matchMode;
    }


    /**
     * Constructor for CriteriaSearchParameter.
     *
     * @param parameterValue The actual value of the parameter.
     * @param parameterPattern The pattern of this parameter (dot-seperated path e.g. person.address.street).
     * @param matchMode The hibernate matchmode to be used in string comparisons.
     */
    public CriteriaSearchParameter(
        String[] parameterValue,
        String parameterPattern,
        org.hibernate.criterion.MatchMode matchMode)
    {
        this(parameterValue, parameterPattern);
        this.matchMode = matchMode;
    }

    /**
     * @return The pattern of this parameter (dot-seperated path e.g. person.address.street).
     */
    public String getParameterPattern()
    {
        return parameterPattern;
    }

    /**
     * Sets the pattern of this parameter.
     *
     * @param parameterPattern The pattern of this parameter (dot-seperated path e.g. person.address.street).
     */
    public void setParameterPattern(String parameterPattern)
    {
        this.parameterPattern = parameterPattern;
    }

    /**
     * Parse the parameter pattern and return the last part of the name.
     *
     * @param parameterPattern The parameter pattern.
     * @return The last part of the parameter pattern, i.e. the attribute name.
     */
    private String parseParameterName(String parameterPattern)
    {
        // parsing the pattern of the parameter
        String[] path = CriteriaSearchParameter.PATTERN.split(parameterPattern);
        return path[path.length - 1];
    }

    /**
     * @return The last part of the parameter pattern, i.e. the attribute name.
     */
    public String getParameterName()
    {
        return parseParameterName(parameterPattern);
    }

    /**
     * @return The value of this parameter.
     */
    public Object getParameterValue()
    {
        return parameterValue;
    }

    /**
     * Sets the value of this parameter.
     *
     * @param parameterValue The value of this parameter.
     */
    public void setParameterValue(Object parameterValue)
    {
        this.parameterValue = parameterValue;
    }

    /**
     * @return The hibernate matchmode of this parameter.
     */
    public org.hibernate.criterion.MatchMode getMatchMode()
    {
        return matchMode;
    }

    /**
     * Sets the hibernate matchmode of this parameter.
     *
     * @param matchMode The hibernate matchmode.
     */
    public void setMatchMode(org.hibernate.criterion.MatchMode matchMode)
    {
        this.matchMode = matchMode;
    }

    /**
     * @return The order (ascending or descending) for this parameter.
     * @see ORDER_ASC
     * @see ORDER_DESC
     * @see ORDER_UNSET
     */
    public int getOrderDirection()
    {
        return orderDirection;
    }

    /**
     * Sets the ordering for this parameter.
     *
     * @param orderDirection The ordering for this parameter.
     */
    public void setOrderDirection(int orderDirection)
    {
        this.orderDirection = orderDirection;
    }

    /**
     * @return The relevance for this parameter.
     * @see RELEVANCE_UNSET
     */
    public int getOrderRelevance()
    {
        return orderRelevance;
    }

    /**
     * Sets the ordering relevance for this parameter.
     *
     * @param order The ordering relevance for this parameter.
     */
    public void setOrderRelevance(int relevance)
    {
        this.orderRelevance = relevance;
    }
    
    private static final long serialVersionUID = 1L;
}