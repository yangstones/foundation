/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.item.impl.jooq.generation.tables.records;


import com.wuda.foundation.item.impl.jooq.generation.tables.ItemVariation;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 规格。比如一件衣服，有红色，白色两种规格。具体的属性和值保存在MongoDB. 不能用属性ID关联, 而是要具体的属性名称和值, 避免关联的属性修改. 
 * 注意和SKU之间的区别.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemVariationRecord extends UpdatableRecordImpl<ItemVariationRecord> implements Record9<ULong, ULong, String, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = 849622134;

    /**
     * Setter for <code>foundation_item.item_variation.item_variation_id</code>.
     */
    public void setItemVariationId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>foundation_item.item_variation.item_variation_id</code>.
     */
    public ULong getItemVariationId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>foundation_item.item_variation.item_id</code>.
     */
    public void setItemId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>foundation_item.item_variation.item_id</code>.
     */
    public ULong getItemId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>foundation_item.item_variation.name</code>. 规格名称。方便管理。
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>foundation_item.item_variation.name</code>. 规格名称。方便管理。
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>foundation_item.item_variation.state</code>. 状态
     */
    public void setState(UByte value) {
        set(3, value);
    }

    /**
     * Getter for <code>foundation_item.item_variation.state</code>. 状态
     */
    public UByte getState() {
        return (UByte) get(3);
    }

    /**
     * Setter for <code>foundation_item.item_variation.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>foundation_item.item_variation.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>foundation_item.item_variation.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>foundation_item.item_variation.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>foundation_item.item_variation.last_modify_time</code>.
     */
    public void setLastModifyTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>foundation_item.item_variation.last_modify_time</code>.
     */
    public LocalDateTime getLastModifyTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>foundation_item.item_variation.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>foundation_item.item_variation.last_modify_user_id</code>.
     */
    public ULong getLastModifyUserId() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>foundation_item.item_variation.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>foundation_item.item_variation.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, ULong, String, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<ULong, ULong, String, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return ItemVariation.ITEM_VARIATION.ITEM_VARIATION_ID;
    }

    @Override
    public Field<ULong> field2() {
        return ItemVariation.ITEM_VARIATION.ITEM_ID;
    }

    @Override
    public Field<String> field3() {
        return ItemVariation.ITEM_VARIATION.NAME;
    }

    @Override
    public Field<UByte> field4() {
        return ItemVariation.ITEM_VARIATION.STATE;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return ItemVariation.ITEM_VARIATION.CREATE_TIME;
    }

    @Override
    public Field<ULong> field6() {
        return ItemVariation.ITEM_VARIATION.CREATE_USER_ID;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return ItemVariation.ITEM_VARIATION.LAST_MODIFY_TIME;
    }

    @Override
    public Field<ULong> field8() {
        return ItemVariation.ITEM_VARIATION.LAST_MODIFY_USER_ID;
    }

    @Override
    public Field<ULong> field9() {
        return ItemVariation.ITEM_VARIATION.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getItemVariationId();
    }

    @Override
    public ULong component2() {
        return getItemId();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public UByte component4() {
        return getState();
    }

    @Override
    public LocalDateTime component5() {
        return getCreateTime();
    }

    @Override
    public ULong component6() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime component7() {
        return getLastModifyTime();
    }

    @Override
    public ULong component8() {
        return getLastModifyUserId();
    }

    @Override
    public ULong component9() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getItemVariationId();
    }

    @Override
    public ULong value2() {
        return getItemId();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public UByte value4() {
        return getState();
    }

    @Override
    public LocalDateTime value5() {
        return getCreateTime();
    }

    @Override
    public ULong value6() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime value7() {
        return getLastModifyTime();
    }

    @Override
    public ULong value8() {
        return getLastModifyUserId();
    }

    @Override
    public ULong value9() {
        return getIsDeleted();
    }

    @Override
    public ItemVariationRecord value1(ULong value) {
        setItemVariationId(value);
        return this;
    }

    @Override
    public ItemVariationRecord value2(ULong value) {
        setItemId(value);
        return this;
    }

    @Override
    public ItemVariationRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public ItemVariationRecord value4(UByte value) {
        setState(value);
        return this;
    }

    @Override
    public ItemVariationRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public ItemVariationRecord value6(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public ItemVariationRecord value7(LocalDateTime value) {
        setLastModifyTime(value);
        return this;
    }

    @Override
    public ItemVariationRecord value8(ULong value) {
        setLastModifyUserId(value);
        return this;
    }

    @Override
    public ItemVariationRecord value9(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public ItemVariationRecord values(ULong value1, ULong value2, String value3, UByte value4, LocalDateTime value5, ULong value6, LocalDateTime value7, ULong value8, ULong value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ItemVariationRecord
     */
    public ItemVariationRecord() {
        super(ItemVariation.ITEM_VARIATION);
    }

    /**
     * Create a detached, initialised ItemVariationRecord
     */
    public ItemVariationRecord(ULong itemVariationId, ULong itemId, String name, UByte state, LocalDateTime createTime, ULong createUserId, LocalDateTime lastModifyTime, ULong lastModifyUserId, ULong isDeleted) {
        super(ItemVariation.ITEM_VARIATION);

        set(0, itemVariationId);
        set(1, itemId);
        set(2, name);
        set(3, state);
        set(4, createTime);
        set(5, createUserId);
        set(6, lastModifyTime);
        set(7, lastModifyUserId);
        set(8, isDeleted);
    }
}
