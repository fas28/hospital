-- Create table

CREATE TABLE patients
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age  INT          NOT NULL
);

CREATE TABLE specialities
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);


CREATE TABLE doctors
(
    id         SERIAL PRIMARY KEY,
    name       VARCHAR(100) NOT NULL,
    speciality INT          NOT NULL,
    FOREIGN KEY (speciality) REFERENCES specialities (id)
);

CREATE TABLE pathologies
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE symptoms
(
    id        SERIAL PRIMARY KEY,
    name      VARCHAR(100) NOT NULL,
    pathology INT          NOT NULL,
    FOREIGN KEY (pathology) REFERENCES pathologies (id)
);

CREATE TABLE appointments
(
    id        SERIAL PRIMARY KEY,
    patient   INT NOT NULL,
    doctor    INT NOT NULL,
    pathology INT NOT NULL,
    FOREIGN KEY (patient) REFERENCES patients (id),
    FOREIGN KEY (doctor) REFERENCES doctors (id),
    FOREIGN KEY (pathology) REFERENCES pathologies (id)
);
