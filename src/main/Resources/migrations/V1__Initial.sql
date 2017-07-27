CREATE SCHEMA IF NOT EXISTS cola;
SET search_path TO cola;
CREATE TABLE content_item_set (
    id uuid PRIMARY KEY,
    timestamp timestamp NOT NULL,
    source text
);

CREATE TABLE content_item (
    id uuid PRIMARY KEY,
    content_item_set_id uuid NOT NULL,
    content jsonb NOT NULL,
    original_content text
);

CREATE TABLE content_item_status_report (
    id uuid PRIMARY KEY,
    timestamp timestamp NOT NULL,
    status text NOT NULL CHECK(status in ('SUCCESS', 'FAILURE', 'IN_PROGRESS', 'BEGIN', 'END')),
    reason text,
    total_items_count integer,
    successful_items_count integer,
    failed_items_count integer,
    successful_items uuid[],
    failed_items jsonb[]
);

CREATE TABLE content_item_match (
    id serial PRIMARY KEY,
    content_item_set_id uuid REFERENCES content_item_set (id),
    content_item_id uuid REFERENCES content_item (id),
    source text NOT NULL,
    score numeric NOT NULL,
    match jsonb
);

CREATE TABLE content_item_action (
    content_item_set_id uuid REFERENCES content_item_set (id),
    content_item_id uuid PRIMARY KEY REFERENCES content_item (id),
    action text NOT NULL,
    content jsonb NOT NULL,
    status text NOT NULL
);

CREATE INDEX idx_content_item_content ON content_item USING GIN (content);
CREATE INDEX idx_content_item_match ON content_item_match USING GIN (match);
