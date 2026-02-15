CREATE TABLE permissions(
    id BIGSERIAL PRIMARY KEY,
    uuid UUID UNIQUE NOT NULL DEFAULT gen_random_uuid(),
    name VARCHAR(255),
    description TEXT,
    type_permission VARCHAR(50),
    origin VARCHAR(20)

)