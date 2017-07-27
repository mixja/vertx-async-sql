/*
 * This file is generated by jOOQ.
*/
package test.data.tables.daos;


import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import test.data.tables.ContentItem;
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
public class ContentItemDao extends DAOImpl<ContentItemRecord, test.data.tables.pojos.ContentItem, UUID> {

    /**
     * Create a new ContentItemDao without any configuration
     */
    public ContentItemDao() {
        super(ContentItem.CONTENT_ITEM, test.data.tables.pojos.ContentItem.class);
    }

    /**
     * Create a new ContentItemDao with an attached configuration
     */
    public ContentItemDao(Configuration configuration) {
        super(ContentItem.CONTENT_ITEM, test.data.tables.pojos.ContentItem.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected UUID getId(test.data.tables.pojos.ContentItem object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<test.data.tables.pojos.ContentItem> fetchById(UUID... values) {
        return fetch(ContentItem.CONTENT_ITEM.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public test.data.tables.pojos.ContentItem fetchOneById(UUID value) {
        return fetchOne(ContentItem.CONTENT_ITEM.ID, value);
    }

    /**
     * Fetch records that have <code>content_item_set_id IN (values)</code>
     */
    public List<test.data.tables.pojos.ContentItem> fetchByContentItemSetId(UUID... values) {
        return fetch(ContentItem.CONTENT_ITEM.CONTENT_ITEM_SET_ID, values);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<test.data.tables.pojos.ContentItem> fetchByContent(Object... values) {
        return fetch(ContentItem.CONTENT_ITEM.CONTENT, values);
    }

    /**
     * Fetch records that have <code>original_content IN (values)</code>
     */
    public List<test.data.tables.pojos.ContentItem> fetchByOriginalContent(String... values) {
        return fetch(ContentItem.CONTENT_ITEM.ORIGINAL_CONTENT, values);
    }
}