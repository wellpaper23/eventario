CREATE TABLE event_activities(
    event_id BIGINT NOT NULL,
    activity_id BIGINT NOT NULL,
    PRIMARY KEY (event_id, activity_id),
    date date,
    time time,
    status VARCHAR(255),
    CONSTRAINT activity_fk FOREIGN KEY(activity_id) REFERENCES activity(id),
    CONSTRAINT event_fk FOREIGN KEY (event_id) REFERENCES events(id)


)