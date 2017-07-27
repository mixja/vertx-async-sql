/*
 * This file is generated by jOOQ.
*/
package test.data;


import javax.annotation.Generated;

import test.data.tables.ContentItem;
import test.data.tables.ContentItemAction;
import test.data.tables.ContentItemMatch;
import test.data.tables.ContentItemSet;
import test.data.tables.ContentItemStatusReport;


/**
 * Convenience access to all tables in cola
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>cola.content_item</code>.
     */
    public static final ContentItem CONTENT_ITEM = test.data.tables.ContentItem.CONTENT_ITEM;

    /**
     * The table <code>cola.content_item_action</code>.
     */
    public static final ContentItemAction CONTENT_ITEM_ACTION = test.data.tables.ContentItemAction.CONTENT_ITEM_ACTION;

    /**
     * The table <code>cola.content_item_match</code>.
     */
    public static final ContentItemMatch CONTENT_ITEM_MATCH = test.data.tables.ContentItemMatch.CONTENT_ITEM_MATCH;

    /**
     * The table <code>cola.content_item_set</code>.
     */
    public static final ContentItemSet CONTENT_ITEM_SET = test.data.tables.ContentItemSet.CONTENT_ITEM_SET;

    /**
     * The table <code>cola.content_item_status_report</code>.
     */
    public static final ContentItemStatusReport CONTENT_ITEM_STATUS_REPORT = test.data.tables.ContentItemStatusReport.CONTENT_ITEM_STATUS_REPORT;
}
