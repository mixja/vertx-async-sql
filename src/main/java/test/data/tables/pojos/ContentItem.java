/*
 * This file is generated by jOOQ.
*/
package test.data.tables.pojos;


import java.util.UUID;

import javax.annotation.Generated;

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
public class ContentItem implements IContentItem {

    private static final long serialVersionUID = -774665970;

    private UUID   id;
    private UUID   contentItemSetId;
    private Object content;
    private String originalContent;

    public ContentItem() {}

    public ContentItem(ContentItem value) {
        this.id = value.id;
        this.contentItemSetId = value.contentItemSetId;
        this.content = value.content;
        this.originalContent = value.originalContent;
    }

    public ContentItem(
        UUID   id,
        UUID   contentItemSetId,
        Object content,
        String originalContent
    ) {
        this.id = id;
        this.contentItemSetId = contentItemSetId;
        this.content = content;
        this.originalContent = originalContent;
    }

    @Override
    public UUID getId() {
        return this.id;
    }

    @Override
    public ContentItem setId(UUID id) {
        this.id = id;
        return this;
    }

    @Override
    public UUID getContentItemSetId() {
        return this.contentItemSetId;
    }

    @Override
    public ContentItem setContentItemSetId(UUID contentItemSetId) {
        this.contentItemSetId = contentItemSetId;
        return this;
    }

    @Override
    public Object getContent() {
        return this.content;
    }

    @Override
    public ContentItem setContent(Object content) {
        this.content = content;
        return this;
    }

    @Override
    public String getOriginalContent() {
        return this.originalContent;
    }

    @Override
    public ContentItem setOriginalContent(String originalContent) {
        this.originalContent = originalContent;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ContentItem (");

        sb.append(id);
        sb.append(", ").append(contentItemSetId);
        sb.append(", ").append(content);
        sb.append(", ").append(originalContent);

        sb.append(")");
        return sb.toString();
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
}