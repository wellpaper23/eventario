CREATE TABLE events(
    id BIGSERIAL PRIMARY KEY NOT NULL,
    uuid UUID NOT NULL UNIQUE DEFAULT gen_random_uuid(),
    name VARCHAR(255) NOT NULL,
    description TEXT,
    date DATE NOT NULL,
    time TIME NOT NULL,
    status VARCHAR(255) NOT NULL,
    creator VARCHAR(255) NOT NULl


)