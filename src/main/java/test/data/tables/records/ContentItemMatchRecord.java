/*
 * This file is generated by jOOQ.
*/
package test.data.tables.records;


import java.math.BigDecimal;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import test.data.tables.ContentItemMatch;
import test.data.tables.interfaces.IContentItemMatch;


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
public class ContentItemMatchRecord extends UpdatableRecordImpl<ContentItemMatchRecord> implements Record6<Integer, UUID, UUID, String, BigDecimal, Object>, IContentItemMatch {

    private static final long serialVersionUID = -1470003028;

    /**
     * Setter for <code>cola.content_item_match.id</code>.
     */
    @Override
    public ContentItemMatchRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item_match.id</code>.
     */
    @Override
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>cola.content_item_match.content_item_set_id</code>.
     */
    @Override
    public ContentItemMatchRecord setContentItemSetId(UUID value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item_match.content_item_set_id</code>.
     */
    @Override
    public UUID getContentItemSetId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>cola.content_item_match.content_item_id</code>.
     */
    @Override
    public ContentItemMatchRecord setContentItemId(UUID value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item_match.content_item_id</code>.
     */
    @Override
    public UUID getContentItemId() {
        return (UUID) get(2);
    }

    /**
     * Setter for <code>cola.content_item_match.source</code>.
     */
    @Override
    public ContentItemMatchRecord setSource(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item_match.source</code>.
     */
    @Override
    public String getSource() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cola.content_item_match.score</code>.
     */
    @Override
    public ContentItemMatchRecord setScore(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item_match.score</code>.
     */
    @Override
    public BigDecimal getScore() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>cola.content_item_match.match</code>.
     */
    @Override
    public ContentItemMatchRecord setMatch(Object value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>cola.content_item_match.match</code>.
     */
    @Override
    public Object getMatch() {
        return (Object) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, UUID, UUID, String, BigDecimal, Object> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, UUID, UUID, String, BigDecimal, Object> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ContentItemMatch.CONTENT_ITEM_MATCH.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field2() {
        return ContentItemMatch.CONTENT_ITEM_MATCH.CONTENT_ITEM_SET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field3() {
        return ContentItemMatch.CONTENT_ITEM_MATCH.CONTENT_ITEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ContentItemMatch.CONTENT_ITEM_MATCH.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return ContentItemMatch.CONTENT_ITEM_MATCH.SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field6() {
        return ContentItemMatch.CONTENT_ITEM_MATCH.MATCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
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
    public UUID value3() {
        return getContentItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value6() {
        return getMatch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemMatchRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemMatchRecord value2(UUID value) {
        setContentItemSetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemMatchRecord value3(UUID value) {
        setContentItemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemMatchRecord value4(String value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemMatchRecord value5(BigDecimal value) {
        setScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemMatchRecord value6(Object value) {
        setMatch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContentItemMatchRecord values(Integer value1, UUID value2, UUID value3, String value4, BigDecimal value5, Object value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IContentItemMatch from) {
        setId(from.getId());
        setContentItemSetId(from.getContentItemSetId());
        setContentItemId(from.getContentItemId());
        setSource(from.getSource());
        setScore(from.getScore());
        setMatch(from.getMatch());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IContentItemMatch> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContentItemMatchRecord
     */
    public ContentItemMatchRecord() {
        super(ContentItemMatch.CONTENT_ITEM_MATCH);
    }

    /**
     * Create a detached, initialised ContentItemMatchRecord
     */
    public ContentItemMatchRecord(Integer id, UUID contentItemSetId, UUID contentItemId, String source, BigDecimal score, Object match) {
        super(ContentItemMatch.CONTENT_ITEM_MATCH);

        set(0, id);
        set(1, contentItemSetId);
        set(2, contentItemId);
        set(3, source);
        set(4, score);
        set(5, match);
    }
}
