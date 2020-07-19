/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.user.impl.jooq.generation.tables.daos;


import com.wuda.foundation.user.impl.jooq.generation.tables.UserAccount;
import com.wuda.foundation.user.impl.jooq.generation.tables.records.UserAccountRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 用户账号信息，适用各种类型的用户
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserAccountDao extends DAOImpl<UserAccountRecord, com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount, ULong> {

    /**
     * Create a new UserAccountDao without any configuration
     */
    public UserAccountDao() {
        super(UserAccount.USER_ACCOUNT, com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount.class);
    }

    /**
     * Create a new UserAccountDao with an attached configuration
     */
    public UserAccountDao(Configuration configuration) {
        super(UserAccount.USER_ACCOUNT, com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount object) {
        return object.getUserAccountId();
    }

    /**
     * Fetch records that have <code>user_account_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchRangeOfUserAccountId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(UserAccount.USER_ACCOUNT.USER_ACCOUNT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_account_id IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchByUserAccountId(ULong... values) {
        return fetch(UserAccount.USER_ACCOUNT.USER_ACCOUNT_ID, values);
    }

    /**
     * Fetch a unique record that has <code>user_account_id = value</code>
     */
    public com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount fetchOneByUserAccountId(ULong value) {
        return fetchOne(UserAccount.USER_ACCOUNT.USER_ACCOUNT_ID, value);
    }

    /**
     * Fetch records that have <code>user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchRangeOfUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(UserAccount.USER_ACCOUNT.USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchByUserId(ULong... values) {
        return fetch(UserAccount.USER_ACCOUNT.USER_ID, values);
    }

    /**
     * Fetch a unique record that has <code>user_id = value</code>
     */
    public com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount fetchOneByUserId(ULong value) {
        return fetchOne(UserAccount.USER_ACCOUNT.USER_ID, value);
    }

    /**
     * Fetch records that have <code>username BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchRangeOfUsername(String lowerInclusive, String upperInclusive) {
        return fetchRange(UserAccount.USER_ACCOUNT.USERNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchByUsername(String... values) {
        return fetch(UserAccount.USER_ACCOUNT.USERNAME, values);
    }

    /**
     * Fetch records that have <code>password BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchRangeOfPassword(String lowerInclusive, String upperInclusive) {
        return fetchRange(UserAccount.USER_ACCOUNT.PASSWORD, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchByPassword(String... values) {
        return fetch(UserAccount.USER_ACCOUNT.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>state BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchRangeOfState(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(UserAccount.USER_ACCOUNT.STATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>state IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchByState(UByte... values) {
        return fetch(UserAccount.USER_ACCOUNT.STATE, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(UserAccount.USER_ACCOUNT.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchByCreateTime(LocalDateTime... values) {
        return fetch(UserAccount.USER_ACCOUNT.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(UserAccount.USER_ACCOUNT.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchByCreateUserId(ULong... values) {
        return fetch(UserAccount.USER_ACCOUNT.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchRangeOfLastModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(UserAccount.USER_ACCOUNT.LAST_MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_time IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchByLastModifyTime(LocalDateTime... values) {
        return fetch(UserAccount.USER_ACCOUNT.LAST_MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>last_modify_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchRangeOfLastModifyUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(UserAccount.USER_ACCOUNT.LAST_MODIFY_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchByLastModifyUserId(ULong... values) {
        return fetch(UserAccount.USER_ACCOUNT.LAST_MODIFY_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(UserAccount.USER_ACCOUNT.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserAccount> fetchByIsDeleted(ULong... values) {
        return fetch(UserAccount.USER_ACCOUNT.IS_DELETED, values);
    }
}
