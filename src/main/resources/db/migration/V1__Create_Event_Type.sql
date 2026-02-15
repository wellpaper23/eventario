CREATE TABLE type (
    id_type BIGSERIAL PRIMARY KEY,
    uuid_type UUID UNIQUE NOT NULL DEFAULT gen_random_uuid(),
    name VARCHAR(255),
    description TEXT

)