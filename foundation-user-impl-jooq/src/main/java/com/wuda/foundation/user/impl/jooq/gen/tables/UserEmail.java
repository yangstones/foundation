/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.user.impl.jooq.gen.tables;


import com.wuda.foundation.user.impl.jooq.gen.Indexes;
import com.wuda.foundation.user.impl.jooq.gen.Keys;
import com.wuda.foundation.user.impl.jooq.gen.User;
import com.wuda.foundation.user.impl.jooq.gen.tables.records.UserEmailRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 用户的email
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserEmail extends TableImpl<UserEmailRecord> {

    private static final long serialVersionUID = -950403119;

    /**
     * The reference instance of <code>user.user_email</code>
     */
    public static final UserEmail USER_EMAIL = new UserEmail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserEmailRecord> getRecordType() {
        return UserEmailRecord.class;
    }

    /**
     * The column <code>user.user_email.id</code>.
     */
    public final TableField<UserEmailRecord, ULong> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>user.user_email.user_id</code>.
     */
    public final TableField<UserEmailRecord, ULong> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>user.user_email.email_id</code>.
     */
    public final TableField<UserEmailRecord, ULong> EMAIL_ID = createField(DSL.name("email_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>user.user_email.usage</code>. emai;l的用途。比如用于登录
     */
    public final TableField<UserEmailRecord, UByte> USAGE = createField(DSL.name("usage"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "emai;l的用途。比如用于登录");

    /**
     * The column <code>user.user_email.state</code>. 状态，每种用途的email状态可能不同，比如如果用于登录的email，状态可以是禁止登录状态
     */
    public final TableField<UserEmailRecord, UByte> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "状态，每种用途的email状态可能不同，比如如果用于登录的email，状态可以是禁止登录状态");

    /**
     * The column <code>user.user_email.description</code>. 简单描述
     */
    public final TableField<UserEmailRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "简单描述");

    /**
     * The column <code>user.user_email.create_time</code>.
     */
    public final TableField<UserEmailRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>user.user_email.create_user_id</code>.
     */
    public final TableField<UserEmailRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>user.user_email.last_modify_time</code>.
     */
    public final TableField<UserEmailRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>user.user_email.last_modify_user_id</code>.
     */
    public final TableField<UserEmailRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>user.user_email.is_deleted</code>.
     */
    public final TableField<UserEmailRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>user.user_email</code> table reference
     */
    public UserEmail() {
        this(DSL.name("user_email"), null);
    }

    /**
     * Create an aliased <code>user.user_email</code> table reference
     */
    public UserEmail(String alias) {
        this(DSL.name(alias), USER_EMAIL);
    }

    /**
     * Create an aliased <code>user.user_email</code> table reference
     */
    public UserEmail(Name alias) {
        this(alias, USER_EMAIL);
    }

    private UserEmail(Name alias, Table<UserEmailRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserEmail(Name alias, Table<UserEmailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("用户的email"), TableOptions.table());
    }

    public <O extends Record> UserEmail(Table<O> child, ForeignKey<O, UserEmailRecord> key) {
        super(child, key, USER_EMAIL);
    }

    @Override
    public Schema getSchema() {
        return User.USER;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_EMAIL_FK_USER_ID);
    }

    @Override
    public Identity<UserEmailRecord, ULong> getIdentity() {
        return Keys.IDENTITY_USER_EMAIL;
    }

    @Override
    public UniqueKey<UserEmailRecord> getPrimaryKey() {
        return Keys.KEY_USER_EMAIL_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserEmailRecord>> getKeys() {
        return Arrays.<UniqueKey<UserEmailRecord>>asList(Keys.KEY_USER_EMAIL_PRIMARY, Keys.KEY_USER_EMAIL_IDX_UNIQUE);
    }

    @Override
    public UserEmail as(String alias) {
        return new UserEmail(DSL.name(alias), this);
    }

    @Override
    public UserEmail as(Name alias) {
        return new UserEmail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserEmail rename(String name) {
        return new UserEmail(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserEmail rename(Name name) {
        return new UserEmail(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<ULong, ULong, ULong, UByte, UByte, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
