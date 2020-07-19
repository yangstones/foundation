/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.store.impl.jooq.generation.tables;


import com.wuda.foundation.store.impl.jooq.generation.FoundationStore;
import com.wuda.foundation.store.impl.jooq.generation.Indexes;
import com.wuda.foundation.store.impl.jooq.generation.Keys;
import com.wuda.foundation.store.impl.jooq.generation.tables.records.StoreGeneralRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * 店铺基本信息
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StoreGeneral extends TableImpl<StoreGeneralRecord> {

    private static final long serialVersionUID = 1008852237;

    /**
     * The reference instance of <code>foundation_store.store_general</code>
     */
    public static final StoreGeneral STORE_GENERAL = new StoreGeneral();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StoreGeneralRecord> getRecordType() {
        return StoreGeneralRecord.class;
    }

    /**
     * The column <code>foundation_store.store_general.store_general_id</code>.
     */
    public final TableField<StoreGeneralRecord, ULong> STORE_GENERAL_ID = createField(DSL.name("store_general_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_store.store_general.store_id</code>. 主键
     */
    public final TableField<StoreGeneralRecord, ULong> STORE_ID = createField(DSL.name("store_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "主键");

    /**
     * The column <code>foundation_store.store_general.store_name</code>. 店铺名称
     */
    public final TableField<StoreGeneralRecord, String> STORE_NAME = createField(DSL.name("store_name"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "店铺名称");

    /**
     * The column <code>foundation_store.store_general.create_time</code>.
     */
    public final TableField<StoreGeneralRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_store.store_general.create_user_id</code>.
     */
    public final TableField<StoreGeneralRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_store.store_general.last_modify_time</code>.
     */
    public final TableField<StoreGeneralRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_store.store_general.last_modify_user_id</code>.
     */
    public final TableField<StoreGeneralRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_store.store_general.is_deleted</code>.
     */
    public final TableField<StoreGeneralRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_store.store_general</code> table reference
     */
    public StoreGeneral() {
        this(DSL.name("store_general"), null);
    }

    /**
     * Create an aliased <code>foundation_store.store_general</code> table reference
     */
    public StoreGeneral(String alias) {
        this(DSL.name(alias), STORE_GENERAL);
    }

    /**
     * Create an aliased <code>foundation_store.store_general</code> table reference
     */
    public StoreGeneral(Name alias) {
        this(alias, STORE_GENERAL);
    }

    private StoreGeneral(Name alias, Table<StoreGeneralRecord> aliased) {
        this(alias, aliased, null);
    }

    private StoreGeneral(Name alias, Table<StoreGeneralRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("店铺基本信息"), TableOptions.table());
    }

    public <O extends Record> StoreGeneral(Table<O> child, ForeignKey<O, StoreGeneralRecord> key) {
        super(child, key, STORE_GENERAL);
    }

    @Override
    public Schema getSchema() {
        return FoundationStore.FOUNDATION_STORE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.STORE_GENERAL_FK_STORE_ID);
    }

    @Override
    public Identity<StoreGeneralRecord, ULong> getIdentity() {
        return Keys.IDENTITY_STORE_GENERAL;
    }

    @Override
    public UniqueKey<StoreGeneralRecord> getPrimaryKey() {
        return Keys.KEY_STORE_GENERAL_PRIMARY;
    }

    @Override
    public List<UniqueKey<StoreGeneralRecord>> getKeys() {
        return Arrays.<UniqueKey<StoreGeneralRecord>>asList(Keys.KEY_STORE_GENERAL_PRIMARY);
    }

    @Override
    public StoreGeneral as(String alias) {
        return new StoreGeneral(DSL.name(alias), this);
    }

    @Override
    public StoreGeneral as(Name alias) {
        return new StoreGeneral(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StoreGeneral rename(String name) {
        return new StoreGeneral(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StoreGeneral rename(Name name) {
        return new StoreGeneral(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, ULong, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
