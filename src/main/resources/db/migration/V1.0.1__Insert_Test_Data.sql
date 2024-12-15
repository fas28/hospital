-- Insert data

INSERT INTO patients (name, age) VALUES ('Manuel', 53);
INSERT INTO patients (name, age) VALUES ('Joana', 32);
INSERT INTO patients (name, age) VALUES ('Ana', 25);
INSERT INTO patients (name, age) VALUES ('Diogo', 33);
INSERT INTO patients (name, age) VALUES ('Catarina', 33);
INSERT INTO patients (name, age) VALUES ('Miguel', 40);

INSERT INTO specialities (name) VALUES ('Dermatology');
INSERT INTO specialities (name) VALUES ('Ophthalmology');
INSERT INTO specialities (name) VALUES ('Radiology');
INSERT INTO specialities (name) VALUES ('Family Medicine');
INSERT INTO specialities (name) VALUES ('Pediatrics');

INSERT INTO doctors (name, speciality) VALUES ('António', 1);
INSERT INTO doctors (name, speciality) VALUES ('Maria', 2);
INSERT INTO doctors (name, speciality) VALUES ('Carlos', 3);
INSERT INTO doctors (name, speciality) VALUES ('Gabriela', 4);
INSERT INTO doctors (name, speciality) VALUES ('Paulo', 5);

INSERT INTO pathologies (name) VALUES ('Pathology 1');
INSERT INTO pathologies (name) VALUES ('Pathology 2');
INSERT INTO pathologies (name) VALUES ('Pathology 3');
INSERT INTO pathologies (name) VALUES ('Pathology 4');
INSERT INTO pathologies (name) VALUES ('Pathology 5');
INSERT INTO pathologies (name) VALUES ('Pathology 6');
INSERT INTO pathologies (name) VALUES ('Pathology 7');

INSERT INTO symptoms (name, pathology) VALUES ('Symptom 1 Description', 1);
INSERT INTO symptoms (name, pathology) VALUES ('Symptom 2 Description', 1);
INSERT INTO symptoms (name, pathology) VALUES ('Symptom 3 Description', 2);
INSERT INTO symptoms (name, pathology) VALUES ('Symptom 4 Description', 2);
INSERT INTO symptoms (name, pathology) VALUES ('Symptom 5 Description', 2);
INSERT INTO symptoms (name, pathology) VALUES ('Symptom 6 Description', 3);
INSERT INTO symptoms (name, pathology) VALUES ('Symptom 7 Description', 3);
INSERT INTO symptoms (name, pathology) VALUES ('Symptom 8 Description', 4);
INSERT INTO symptoms (name, pathology) VALUES ('Symptom 9 Description', 5);
INSERT INTO symptoms (name, pathology) VALUES ('Symptom 10 Description', 5);
INSERT INTO symptoms (name, pathology) VALUES ('Symptom 11 Description', 5);
INSERT INTO symptoms (name, pathology) VALUES ('Symptom 12 Description', 6);
INSERT INTO symptoms (name, pathology) VALUES ('Symptom 13 Description', 6);
INSERT INTO symptoms (name, pathology) VALUES ('Symptom 14 Description', 7);
INSERT INTO symptoms (name, pathology) VALUES ('Symptom 15 Description', 7);

INSERT INTO consults (patient, doctor, speciality, pathology) VALUES (1, 1, 1, 1);
INSERT INTO consults (patient, doctor, speciality, pathology) VALUES (1, 1, 1, 2);
INSERT INTO consults (patient, doctor, speciality, pathology) VALUES (1, 2, 2, 3);
INSERT INTO consults (patient, doctor, speciality, pathology) VALUES (2, 2, 2, 3);
INSERT INTO consults (patient, doctor, speciality, pathology) VALUES (3, 3, 3, 4);
INSERT INTO consults (patient, doctor, speciality, pathology) VALUES (4, 4, 4, 5);
INSERT INTO consults (patient, doctor, speciality, pathology) VALUES (5, 5, 5, 6);
INSERT INTO consults (patient, doctor, speciality, pathology) VALUES (6, 2, 2, 7);
