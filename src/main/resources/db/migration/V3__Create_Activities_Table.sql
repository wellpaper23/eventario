CREATE TABLE activity(
    uuid UUID UNIQUE NOT NULL DEFAULT gen_random_uuid(),
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT


)