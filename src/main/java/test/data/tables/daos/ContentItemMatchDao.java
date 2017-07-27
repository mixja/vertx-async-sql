/*
 * This file is generated by jOOQ.
*/
package test.data.tables.daos;


import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import test.data.tables.ContentItemMatch;
import test.data.tables.records.ContentItemMatchRecord;


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
public class ContentItemMatchDao extends DAOImpl<ContentItemMatchRecord, test.data.tables.pojos.ContentItemMatch, Integer> {

    /**
     * Create a new ContentItemMatchDao without any configuration
     */
    public ContentItemMatchDao() {
        super(ContentItemMatch.CONTENT_ITEM_MATCH, test.data.tables.pojos.ContentItemMatch.class);
    }

    /**
     * Create a new ContentItemMatchDao with an attached configuration
     */
    public ContentItemMatchDao(Configuration configuration) {
        super(ContentItemMatch.CONTENT_ITEM_MATCH, test.data.tables.pojos.ContentItemMatch.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(test.data.tables.pojos.ContentItemMatch object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<test.data.tables.pojos.ContentItemMatch> fetchById(Integer... values) {
        return fetch(ContentItemMatch.CONTENT_ITEM_MATCH.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public test.data.tables.pojos.ContentItemMatch fetchOneById(Integer value) {
        return fetchOne(ContentItemMatch.CONTENT_ITEM_MATCH.ID, value);
    }

    /**
     * Fetch records that have <code>content_item_set_id IN (values)</code>
     */
    public List<test.data.tables.pojos.ContentItemMatch> fetchByContentItemSetId(UUID... values) {
        return fetch(ContentItemMatch.CONTENT_ITEM_MATCH.CONTENT_ITEM_SET_ID, values);
    }

    /**
     * Fetch records that have <code>content_item_id IN (values)</code>
     */
    public List<test.data.tables.pojos.ContentItemMatch> fetchByContentItemId(UUID... values) {
        return fetch(ContentItemMatch.CONTENT_ITEM_MATCH.CONTENT_ITEM_ID, values);
    }

    /**
     * Fetch records that have <code>source IN (values)</code>
     */
    public List<test.data.tables.pojos.ContentItemMatch> fetchBySource(String... values) {
        return fetch(ContentItemMatch.CONTENT_ITEM_MATCH.SOURCE, values);
    }

    /**
     * Fetch records that have <code>score IN (values)</code>
     */
    public List<test.data.tables.pojos.ContentItemMatch> fetchByScore(BigDecimal... values) {
        return fetch(ContentItemMatch.CONTENT_ITEM_MATCH.SCORE, values);
    }

    /**
     * Fetch records that have <code>match IN (values)</code>
     */
    public List<test.data.tables.pojos.ContentItemMatch> fetchByMatch(Object... values) {
        return fetch(ContentItemMatch.CONTENT_ITEM_MATCH.MATCH, values);
    }
}
