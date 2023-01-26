INSERT INTO inhabitants (inhabitant_name)
VALUES ('John'),
    ('Alex'),
    ('Igor'),
    ('Petr');

INSERT INTO living_compartments (living_compartment_number, living_compartment_alias, living_compartment_capacity)
VALUES (2321, 'Первый дом', 10),
    (2322, 'Второй дом', 10);

INSERT INTO xref_inhabitant_2_living_compartment (inhabitant_id, living_compartment_id)
VALUES (1, 1),
       (2, 1),
       (3, 2);