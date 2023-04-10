/*Sql Query Command*/

DROP TABLE IF EXISTS model_table;
DROP TABLE IF EXISTS category_table;
DROP TABLE IF EXISTS line_table;


CREATE TABLE line_table(
	id smallserial,
    name text NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE category_table(
	id smallserial NOT NULL,
	line_id smallserial NOT NULL,
    name text NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(line_id)
        REFERENCES line_table (id)
        ON DELETE CASCADE
);

CREATE TABLE model_table(
	id smallserial NOT NULL,
	category_id smallserial NOT NULL,
    name text NOT NULL,
    PRIMARY KEY(name),
    FOREIGN KEY(category_id)
        REFERENCES category_table (id)
        ON DELETE CASCADE
);



INSERT INTO line_table (name)
VALUES
    ('Ares'), -- 1
    ('Cronos'); -- 2

INSERT INTO category_table (line_id, name)
VALUES
    (2, 'Cronos Old'), -- 1
    (2, 'Cronos L'), -- 2
    (2, 'Cronos NG'), -- 3
    (1,   'Ares TB'), -- 4
    (1,   'Ares THS'); -- 5

INSERT INTO model_table(category_id, name)
VALUES
    (1, 'Cronos 6001-A'),
    (1, 'Cronos 6003'),
    (1, 'Cronos 7023'),
    (2,   'Cronos 6021L'),
    (2,   'Cronos 7023L'),
    (3,  'Cronos 6001-NG'),
    (3,  'Cronos 6003-NG'),
    (3,  'Cronos 6021-NG'),
    (3,  'Cronos 6031-NG'),
    (3,  'Cronos 7021-NG'),
    (3,  'Cronos 7023-NG'),
    (4,    'Ares 7021'),
    (4,    'Ares 7031'),
    (4,    'Ares 7023'),
    (5,   'Ares 8023 15'),
    (5,   'Ares 8023 200'),
    (5,   'Ares 8023 2,5');