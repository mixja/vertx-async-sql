/*
 * This file is generated by jOOQ.
*/
package test.data.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import test.data.tables.ContentItem;
import test.data.tables.interfaces.IContentItem;


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
public class ContentItemRecord extends UpdatableRecordImpl<ContentItemRecord> implements Record4<UUID, UUID, Object, String>, IContentItem {

    private static final long serialVersionUID = 654285921;

    /**
     * Setter for <code>cola.content_item.id</code>.
     */
    @Override
    public ContentItemRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item.id</code>.
     */
    @Override
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>cola.content_item.content_item_set_id</code>.
     */
    @Override
    public ContentItemRecord setContentItemSetId(UUID value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item.content_item_set_id</code>.
     */
    @Override
    public UUID getContentItemSetId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>cola.content_item.content</code>.
     */
    @Override
    public ContentItemRecord setContent(Object value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item.content</code>.
     */
    @Override
    public Object getContent() {
        return (Object) get(2);
    }

    /**
     * Setter for <code>cola.content_item.original_content</code>.
     */
    @Override
    public ContentItemRecord setOriginalContent(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item.original_content</code>.
     */
    @Override
    public String getOriginalContent() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, UUID, Object, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, UUID, Object, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return ContentItem.CONTENT_ITEM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field2() {
        return ContentItem.CONTENT_ITEM.CONTENT_ITEM_SET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field3() {
        return ContentItem.CONTENT_ITEM.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ContentItem.CONTENT_ITEM.ORIGINAL_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value2() {
        return getContentItemSetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value3() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOriginalContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemRecord value1(UUID value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemRecord value2(UUID value) {
        setContentItemSetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemRecord value3(Object value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemRecord value4(String value) {
        setOriginalContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemRecord values(UUID value1, UUID value2, Object value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IContentItem from) {
        setId(from.getId());
        setContentItemSetId(from.getContentItemSetId());
        setContent(from.getContent());
        setOriginalContent(from.getOriginalContent());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IContentItem> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContentItemRecord
     */
    public ContentItemRecord() {
        super(ContentItem.CONTENT_ITEM);
    }

    /**
     * Create a detached, initialised ContentItemRecord
     */
    public ContentItemRecord(UUID id, UUID contentItemSetId, Object content, String originalContent) {
        super(ContentItem.CONTENT_ITEM);

        set(0, id);
        set(1, contentItemSetId);
        set(2, content);
        set(3, originalContent);
    }
}