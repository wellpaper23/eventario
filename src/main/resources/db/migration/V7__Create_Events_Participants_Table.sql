CREATE TABLE participants(
        event_id BIGINT NOT NULL,
        user_id BIGINT NOT NULL,
        PRIMARY KEY (event_id, user_id),
        event_participant_id UUID NOT NULL DEFAULT gen_random_uuid(),
        CONSTRAINT event_fk FOREIGN KEY (event_id) REFERENCES events(id),
        CONSTRAINT permission_fk FOREIGN KEY (user_id) REFERENCES "user"(id)
)