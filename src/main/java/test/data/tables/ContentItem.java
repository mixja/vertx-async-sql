/*
 * This file is generated by jOOQ.
*/
package test.data.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import test.data.Cola;
import test.data.Keys;
import test.data.tables.records.ContentItemRecord;


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
public class ContentItem extends TableImpl<ContentItemRecord> {

    private static final long serialVersionUID = 1431635264;

    /**
     * The reference instance of <code>cola.content_item</code>
     */
    public static final ContentItem CONTENT_ITEM = new ContentItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContentItemRecord> getRecordType() {
        return ContentItemRecord.class;
    }

    /**
     * The column <code>cola.content_item.id</code>.
     */
    public final TableField<ContentItemRecord, UUID> ID = createField("id", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>cola.content_item.content_item_set_id</code>.
     */
    public final TableField<ContentItemRecord, UUID> CONTENT_ITEM_SET_ID = createField("content_item_set_id", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>cola.content_item.content</code>.
     */
    public final TableField<ContentItemRecord, Object> CONTENT = createField("content", org.jooq.impl.DefaultDataType.getDefaultDataType("jsonb"), this, "");

    /**
     * The column <code>cola.content_item.original_content</code>.
     */
    public final TableField<ContentItemRecord, String> ORIGINAL_CONTENT = createField("original_content", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>cola.content_item</code> table reference
     */
    public ContentItem() {
        this("content_item", null);
    }

    /**
     * Create an aliased <code>cola.content_item</code> table reference
     */
    public ContentItem(String alias) {
        this(alias, CONTENT_ITEM);
    }

    private ContentItem(String alias, Table<ContentItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private ContentItem(String alias, Table<ContentItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Cola.COLA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContentItemRecord> getPrimaryKey() {
        return Keys.CONTENT_ITEM_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContentItemRecord>> getKeys() {
        return Arrays.<UniqueKey<ContentItemRecord>>asList(Keys.CONTENT_ITEM_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItem as(String alias) {
        return new ContentItem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ContentItem rename(String name) {
        return new ContentItem(name, null);
    }
}