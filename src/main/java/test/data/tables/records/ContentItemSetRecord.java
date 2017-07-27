/*
 * This file is generated by jOOQ.
*/
package test.data.tables.records;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import test.data.tables.ContentItemSet;
import test.data.tables.interfaces.IContentItemSet;


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
public class ContentItemSetRecord extends UpdatableRecordImpl<ContentItemSetRecord> implements Record3<UUID, Timestamp, String>, IContentItemSet {

    private static final long serialVersionUID = 1948780462;

    /**
     * Setter for <code>cola.content_item_set.id</code>.
     */
    @Override
    public ContentItemSetRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item_set.id</code>.
     */
    @Override
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>cola.content_item_set.timestamp</code>.
     */
    @Override
    public ContentItemSetRecord setTimestamp(Timestamp value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item_set.timestamp</code>.
     */
    @Override
    public Timestamp getTimestamp() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>cola.content_item_set.source</code>.
     */
    @Override
    public ContentItemSetRecord setSource(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item_set.source</code>.
     */
    @Override
    public String getSource() {
        return (String) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UUID, Timestamp, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UUID, Timestamp, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return ContentItemSet.CONTENT_ITEM_SET.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return ContentItemSet.CONTENT_ITEM_SET.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ContentItemSet.CONTENT_ITEM_SET.SOURCE;
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
    public Timestamp value2() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemSetRecord value1(UUID value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemSetRecord value2(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemSetRecord value3(String value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemSetRecord values(UUID value1, Timestamp value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IContentItemSet from) {
        setId(from.getId());
        setTimestamp(from.getTimestamp());
        setSource(from.getSource());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IContentItemSet> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContentItemSetRecord
     */
    public ContentItemSetRecord() {
        super(ContentItemSet.CONTENT_ITEM_SET);
    }

    /**
     * Create a detached, initialised ContentItemSetRecord
     */
    public ContentItemSetRecord(UUID id, Timestamp timestamp, String source) {
        super(ContentItemSet.CONTENT_ITEM_SET);

        set(0, id);
        set(1, timestamp);
        set(2, source);
    }
}
