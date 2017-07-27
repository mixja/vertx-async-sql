/*
 * This file is generated by jOOQ.
*/
package test.data.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import test.data.tables.ContentItemAction;
import test.data.tables.interfaces.IContentItemAction;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ContentItemActionRecord extends UpdatableRecordImpl<ContentItemActionRecord> implements Record5<UUID, UUID, String, Object, String>, IContentItemAction {

    private static final long serialVersionUID = 421047386;

    /**
     * Setter for <code>cola.content_item_action.content_item_set_id</code>.
     */
    @Override
    public ContentItemActionRecord setContentItemSetId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item_action.content_item_set_id</code>.
     */
    @Override
    public UUID getContentItemSetId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>cola.content_item_action.content_item_id</code>.
     */
    @Override
    public ContentItemActionRecord setContentItemId(UUID value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item_action.content_item_id</code>.
     */
    @Override
    public UUID getContentItemId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>cola.content_item_action.action</code>.
     */
    @Override
    public ContentItemActionRecord setAction(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item_action.action</code>.
     */
    @Override
    public String getAction() {
        return (String) get(2);
    }

    /**
     * Setter for <code>cola.content_item_action.content</code>.
     */
    @Override
    public ContentItemActionRecord setContent(Object value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item_action.content</code>.
     */
    @Override
    public Object getContent() {
        return (Object) get(3);
    }

    /**
     * Setter for <code>cola.content_item_action.status</code>.
     */
    @Override
    public ContentItemActionRecord setStatus(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item_action.status</code>.
     */
    @Override
    public String getStatus() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, UUID, String, Object, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, UUID, String, Object, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return ContentItemAction.CONTENT_ITEM_ACTION.CONTENT_ITEM_SET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field2() {
        return ContentItemAction.CONTENT_ITEM_ACTION.CONTENT_ITEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ContentItemAction.CONTENT_ITEM_ACTION.ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field4() {
        return ContentItemAction.CONTENT_ITEM_ACTION.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ContentItemAction.CONTENT_ITEM_ACTION.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getContentItemSetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value2() {
        return getContentItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value4() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemActionRecord value1(UUID value) {
        setContentItemSetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemActionRecord value2(UUID value) {
        setContentItemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemActionRecord value3(String value) {
        setAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemActionRecord value4(Object value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemActionRecord value5(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemActionRecord values(UUID value1, UUID value2, String value3, Object value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IContentItemAction from) {
        setContentItemSetId(from.getContentItemSetId());
        setContentItemId(from.getContentItemId());
        setAction(from.getAction());
        setContent(from.getContent());
        setStatus(from.getStatus());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IContentItemAction> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContentItemActionRecord
     */
    public ContentItemActionRecord() {
        super(ContentItemAction.CONTENT_ITEM_ACTION);
    }

    /**
     * Create a detached, initialised ContentItemActionRecord
     */
    public ContentItemActionRecord(UUID contentItemSetId, UUID contentItemId, String action, Object content, String status) {
        super(ContentItemAction.CONTENT_ITEM_ACTION);

        set(0, contentItemSetId);
        set(1, contentItemId);
        set(2, action);
        set(3, content);
        set(4, status);
    }
}