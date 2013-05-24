/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TTriggers extends org.jooq.impl.TableImpl<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord> {

	private static final long serialVersionUID = -1292838499;

	/**
	 * The singleton instance of <code>DBA.t_triggers</code>
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.TTriggers T_TRIGGERS = new org.jooq.test.sybase.generatedclasses.tables.TTriggers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord> getRecordType() {
		return org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord.class;
	}

	/**
	 * The column <code>DBA.t_triggers.id_generated</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID_GENERATED = createField("id_generated", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>DBA.t_triggers.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>DBA.t_triggers.counter</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> COUNTER = createField("counter", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>DBA.t_triggers</code> table reference
	 */
	public TTriggers() {
		super("t_triggers", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	/**
	 * Create an aliased <code>DBA.t_triggers</code> table reference
	 */
	public TTriggers(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.TTriggers.T_TRIGGERS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.sybase.generatedclasses.Keys.IDENTITY_T_TRIGGERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord> getPrimaryKey() {
		return org.jooq.test.sybase.generatedclasses.Keys.T_TRIGGERS__PK_T_TRIGGERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord>>asList(org.jooq.test.sybase.generatedclasses.Keys.T_TRIGGERS__PK_T_TRIGGERS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sybase.generatedclasses.tables.TTriggers as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.TTriggers(alias);
	}
}
