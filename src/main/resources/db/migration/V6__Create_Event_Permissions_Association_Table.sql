CREATE TABLE event_permissions(
    event_id BIGINT NOT NULL,
    permission_id BIGINT NOT NULL,
    PRIMARY KEY (event_id, permission_id),
    CONSTRAINT event_fk FOREIGN KEY (event_id) REFERENCES events(id),
    CONSTRAINT permission_fk FOREIGN KEY (permission_id) REFERENCES permissions(id)
)