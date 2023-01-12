CREATE TABLE inhabitants (
    inhabitant_id   BIGSERIAL   NOT NULL PRIMARY KEY,
    inhabitant_name VARCHAR(50) NOT NULL
);

CREATE INDEX i_inhabitant_on_inhabitant_id ON inhabitants(inhabitant_id);