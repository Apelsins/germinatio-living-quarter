CREATE TABLE inhabitants (
    inhabitant_id         BIGSERIAL    NOT NULL,
    inhabitant_name       VARCHAR(255) NOT NULL
);

ALTER TABLE inhabitants ADD CONSTRAINT PK_inhabitant PRIMARY KEY (inhabitant_id);

CREATE TABLE living_compartments (
    living_compartment_id       BIGSERIAL NOT NULL,
    living_compartment_number   INT       NOT NULL,
    living_compartment_alias    VARCHAR(255),
    living_compartment_capacity INT       NOT NULL
);

ALTER TABLE living_compartments ADD CONSTRAINT PK_living_compartment PRIMARY KEY (living_compartment_id);
CREATE UNIQUE INDEX U_living_compartment_ON_living_compartment_number on living_compartments(living_compartment_number);

CREATE TABLE xref_inhabitant_2_living_compartment (
    inhabitant_id         BIGINT NOT NULL,
    living_compartment_id BIGINT NOT NULL
);

ALTER TABLE xref_inhabitant_2_living_compartment ADD CONSTRAINT FK_xref_2_inhabitant
    FOREIGN KEY (inhabitant_id) REFERENCES inhabitants(inhabitant_id);
ALTER TABLE xref_inhabitant_2_living_compartment ADD CONSTRAINT FK_xref_2_living_compartment
    FOREIGN KEY (living_compartment_id) REFERENCES living_compartments(living_compartment_id);