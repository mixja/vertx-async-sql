/*
 * This file is generated by jOOQ.
*/
package test.data.tables.interfaces;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;


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
public interface IContentItemStatusReport extends Serializable {

    /**
     * Setter for <code>cola.content_item_status_report.id</code>.
     */
    public IContentItemStatusReport setId(UUID value);

    /**
     * Getter for <code>cola.content_item_status_report.id</code>.
     */
    public UUID getId();

    /**
     * Setter for <code>cola.content_item_status_report.timestamp</code>.
     */
    public IContentItemStatusReport setTimestamp(Timestamp value);

    /**
     * Getter for <code>cola.content_item_status_report.timestamp</code>.
     */
    public Timestamp getTimestamp();

    /**
     * Setter for <code>cola.content_item_status_report.status</code>.
     */
    public IContentItemStatusReport setStatus(String value);

    /**
     * Getter for <code>cola.content_item_status_report.status</code>.
     */
    public String getStatus();

    /**
     * Setter for <code>cola.content_item_status_report.reason</code>.
     */
    public IContentItemStatusReport setReason(String value);

    /**
     * Getter for <code>cola.content_item_status_report.reason</code>.
     */
    public String getReason();

    /**
     * Setter for <code>cola.content_item_status_report.total_items_count</code>.
     */
    public IContentItemStatusReport setTotalItemsCount(Integer value);

    /**
     * Getter for <code>cola.content_item_status_report.total_items_count</code>.
     */
    public Integer getTotalItemsCount();

    /**
     * Setter for <code>cola.content_item_status_report.successful_items_count</code>.
     */
    public IContentItemStatusReport setSuccessfulItemsCount(Integer value);

    /**
     * Getter for <code>cola.content_item_status_report.successful_items_count</code>.
     */
    public Integer getSuccessfulItemsCount();

    /**
     * Setter for <code>cola.content_item_status_report.failed_items_count</code>.
     */
    public IContentItemStatusReport setFailedItemsCount(Integer value);

    /**
     * Getter for <code>cola.content_item_status_report.failed_items_count</code>.
     */
    public Integer getFailedItemsCount();

    /**
     * Setter for <code>cola.content_item_status_report.successful_items</code>.
     */
    public IContentItemStatusReport setSuccessfulItems(UUID... value);

    /**
     * Getter for <code>cola.content_item_status_report.successful_items</code>.
     */
    public UUID[] getSuccessfulItems();

    /**
     * Setter for <code>cola.content_item_status_report.failed_items</code>.
     */
    public IContentItemStatusReport setFailedItems(Object... value);

    /**
     * Getter for <code>cola.content_item_status_report.failed_items</code>.
     */
    public Object[] getFailedItems();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IContentItemStatusReport
     */
    public void from(test.data.tables.interfaces.IContentItemStatusReport from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IContentItemStatusReport
     */
    public <E extends test.data.tables.interfaces.IContentItemStatusReport> E into(E into);
}