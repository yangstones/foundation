/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.user.impl.jooq.gen.tables.daos;


import com.wuda.foundation.user.impl.jooq.gen.tables.User;
import com.wuda.foundation.user.impl.jooq.gen.tables.records.UserRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 用户有很多类型，比如一种分类方法是把用户分成个人用户和企业用户，而不同类型的用户需要的字段不一样，但是他们都是用户，即 is-a user。这个表属于所有用户的基本信息，其他不同类型的用户有自己专属的表，然后用用户ID关联回这个表。这样做还有一个好处，那就是其他表中的用户ID都统一关联回这个表，这样用户ID就不会有歧义了。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserDao extends DAOImpl<UserRecord, com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User, ULong> {

    /**
     * Create a new UserDao without any configuration
     */
    public UserDao() {
        super(User.USER_, com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User.class);
    }

    /**
     * Create a new UserDao with an attached configuration
     */
    public UserDao(Configuration configuration) {
        super(User.USER_, com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User object) {
        return object.getUserId();
    }

    /**
     * Fetch records that have <code>user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User> fetchRangeOfUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(User.USER_.USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User> fetchByUserId(ULong... values) {
        return fetch(User.USER_.USER_ID, values);
    }

    /**
     * Fetch a unique record that has <code>user_id = value</code>
     */
    public com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User fetchOneByUserId(ULong value) {
        return fetchOne(User.USER_.USER_ID, value);
    }

    /**
     * Fetch records that have <code>type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User> fetchRangeOfType(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(User.USER_.TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User> fetchByType(UByte... values) {
        return fetch(User.USER_.TYPE, values);
    }

    /**
     * Fetch records that have <code>state BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User> fetchRangeOfState(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(User.USER_.STATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>state IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User> fetchByState(UByte... values) {
        return fetch(User.USER_.STATE, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(User.USER_.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User> fetchByCreateTime(LocalDateTime... values) {
        return fetch(User.USER_.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(User.USER_.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User> fetchByCreateUserId(ULong... values) {
        return fetch(User.USER_.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User> fetchRangeOfLastModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(User.USER_.LAST_MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_time IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User> fetchByLastModifyTime(LocalDateTime... values) {
        return fetch(User.USER_.LAST_MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>last_modify_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User> fetchRangeOfLastModifyUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(User.USER_.LAST_MODIFY_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User> fetchByLastModifyUserId(ULong... values) {
        return fetch(User.USER_.LAST_MODIFY_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(User.USER_.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.gen.tables.pojos.User> fetchByIsDeleted(ULong... values) {
        return fetch(User.USER_.IS_DELETED, values);
    }
}
