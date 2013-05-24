/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PCreateAuthorByName extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1889896325;

	/**
	 * The parameter <code>DBA.p_create_author_by_name.p_first_name</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> P_FIRST_NAME = createParameter("p_first_name", org.jooq.impl.SQLDataType.VARCHAR.length(50));

	/**
	 * The parameter <code>DBA.p_create_author_by_name.p_last_name</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> P_LAST_NAME = createParameter("p_last_name", org.jooq.impl.SQLDataType.VARCHAR.length(50));

	/**
	 * Create a new routine call instance
	 */
	public PCreateAuthorByName() {
		super("p_create_author_by_name", org.jooq.test.sybase.generatedclasses.Dba.DBA);

		addInParameter(P_FIRST_NAME);
		addInParameter(P_LAST_NAME);
	}

	/**
	 * Set the <code>p_first_name</code> parameter IN value to the routine
	 */
	public void setPFirstName(java.lang.String value) {
		setValue(org.jooq.test.sybase.generatedclasses.routines.PCreateAuthorByName.P_FIRST_NAME, value);
	}

	/**
	 * Set the <code>p_last_name</code> parameter IN value to the routine
	 */
	public void setPLastName(java.lang.String value) {
		setValue(org.jooq.test.sybase.generatedclasses.routines.PCreateAuthorByName.P_LAST_NAME, value);
	}
}
