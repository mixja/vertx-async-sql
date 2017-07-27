/*
 * This file is generated by jOOQ.
*/
package test.data.tables;


import java.sql.Timestamp;
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
import test.data.tables.records.ContentItemStatusReportRecord;


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
public class ContentItemStatusReport extends TableImpl<ContentItemStatusReportRecord> {

    private static final long serialVersionUID = -944234695;

    /**
     * The reference instance of <code>cola.content_item_status_report</code>
     */
    public static final ContentItemStatusReport CONTENT_ITEM_STATUS_REPORT = new ContentItemStatusReport();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContentItemStatusReportRecord> getRecordType() {
        return ContentItemStatusReportRecord.class;
    }

    /**
     * The column <code>cola.content_item_status_report.id</code>.
     */
    public final TableField<ContentItemStatusReportRecord, UUID> ID = createField("id", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>cola.content_item_status_report.timestamp</code>.
     */
    public final TableField<ContentItemStatusReportRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>cola.content_item_status_report.status</code>.
     */
    public final TableField<ContentItemStatusReportRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>cola.content_item_status_report.reason</code>.
     */
    public final TableField<ContentItemStatusReportRecord, String> REASON = createField("reason", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>cola.content_item_status_report.total_items_count</code>.
     */
    public final TableField<ContentItemStatusReportRecord, Integer> TOTAL_ITEMS_COUNT = createField("total_items_count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>cola.content_item_status_report.successful_items_count</code>.
     */
    public final TableField<ContentItemStatusReportRecord, Integer> SUCCESSFUL_ITEMS_COUNT = createField("successful_items_count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>cola.content_item_status_report.failed_items_count</code>.
     */
    public final TableField<ContentItemStatusReportRecord, Integer> FAILED_ITEMS_COUNT = createField("failed_items_count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>cola.content_item_status_report.successful_items</code>.
     */
    public final TableField<ContentItemStatusReportRecord, UUID[]> SUCCESSFUL_ITEMS = createField("successful_items", org.jooq.impl.SQLDataType.UUID.getArrayDataType(), this, "");

    /**
     * The column <code>cola.content_item_status_report.failed_items</code>.
     */
    public final TableField<ContentItemStatusReportRecord, Object[]> FAILED_ITEMS = createField("failed_items", org.jooq.impl.DefaultDataType.getDefaultDataType("jsonb").getArrayDataType(), this, "");

    /**
     * Create a <code>cola.content_item_status_report</code> table reference
     */
    public ContentItemStatusReport() {
        this("content_item_status_report", null);
    }

    /**
     * Create an aliased <code>cola.content_item_status_report</code> table reference
     */
    public ContentItemStatusReport(String alias) {
        this(alias, CONTENT_ITEM_STATUS_REPORT);
    }

    private ContentItemStatusReport(String alias, Table<ContentItemStatusReportRecord> aliased) {
        this(alias, aliased, null);
    }

    private ContentItemStatusReport(String alias, Table<ContentItemStatusReportRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ContentItemStatusReportRecord> getPrimaryKey() {
        return Keys.CONTENT_ITEM_STATUS_REPORT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContentItemStatusReportRecord>> getKeys() {
        return Arrays.<UniqueKey<ContentItemStatusReportRecord>>asList(Keys.CONTENT_ITEM_STATUS_REPORT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemStatusReport as(String alias) {
        return new ContentItemStatusReport(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ContentItemStatusReport rename(String name) {
        return new ContentItemStatusReport(name, null);
    }
}