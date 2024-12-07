insert into address (id, address_line1, address_line2, city, postal_code)
            values (1, 'xx', 'yy', 'city', '62-030');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (2, 'aaa', 'bbb', 'wroclaw', '54-153');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (3, 'DDD', 'CCC', 'city', '62-030');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (4, 'EEE', 'FFF', 'wroclaw', '54-153');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (5, 'GGG', 'HHH', 'city', '62-030');




insert into patient (id, first_name, last_name, email, telephone_number, address_id, patient_number, date_of_birth, has_priority_privileges)
            values (1,'John', 'Doe', 'test@test.test', '123456789', 1, '1', '2000-01-05', TRUE);
insert into patient (id, first_name, last_name, email, telephone_number, address_id, patient_number, date_of_birth, has_priority_privileges)
            values (2, 'Jane', 'Doe', 'a@a.a', '987654321', 2, '2', '1996-01-01', FALSE);
insert into patient (id, first_name, last_name, email, telephone_number, address_id, patient_number, date_of_birth, has_priority_privileges)
            values (3, 'Tom', 'Doe', 'b@b.b', '123123123', 1, '3', '1981-01-01', FALSE);
insert into patient (id, first_name, last_name, email, telephone_number, address_id, patient_number, date_of_birth, has_priority_privileges)
            values (4, 'Jerry', 'Doe', 'c@c.c', '321321321', 3, '4', '1999-02-01', TRUE);



insert into doctor (id, first_name, last_name, email, telephone_number, address_id, doctor_number, specialization)
            values (1, 'John', 'Doe', '1@1.1', '123456789', 1, '1', 'dentist');
insert into doctor (id, first_name, last_name, email, telephone_number, address_id, doctor_number, specialization)
            values (2, 'Jane', 'Doe', '2@2.2', '987654321', 4, '2', 'surgeon');
insert into doctor (id, first_name, last_name, email, telephone_number, address_id, doctor_number, specialization)
            values (3, 'Tom', 'Doe', '3@3.3', '123123123', 5, '3', 'dermatologist');



INSERT INTO visit (id, description, time, patient_id, doctor_id)
            VALUES (1, 'W trakcie', '2024-10-11 12:00:00', 1, 1);
INSERT INTO visit (id, description, time, patient_id, doctor_id)
            VALUES (2, '2020-01-02', '2020-01-02 13:00:00', 2, 2);
INSERT INTO visit (id, description, time, patient_id, doctor_id)
            VALUES (3, '2020-01-03', '2020-01-02 14:00:00', 3, 3);
INSERT INTO visit (id, description, time, patient_id, doctor_id)
            VALUES (4, '2020-01-04', '2020-01-04 15:00:00', 4, 1);
INSERT INTO visit (id, description, time, patient_id, doctor_id)
            VALUES (5, '2020-01-05', '2020-01-25 16:00:00', 1, 2);
INSERT INTO visit (id, description, time, patient_id, doctor_id)
            VALUES (6, '2020-01-06', '2020-01-03 17:00:00', 2, 3);
INSERT INTO visit (id, description, time, patient_id, doctor_id)
            VALUES (7, '2020-01-07', '2020-01-01 18:00:00', 3, 1);
INSERT INTO visit (id, description, time, patient_id, doctor_id)
            VALUES (8, '2020-01-08', '2020-01-09 19:00:00', 4, 2);



INSERT INTO medical_treatment (id, description, type)
            VALUES (1, 'Wizyta kontrolna', 'USG');
INSERT INTO medical_treatment (id, description, type)
            VALUES (2, 'Badania medycyny pracy', 'EKG');
INSERT INTO medical_treatment (id, description, type)
            VALUES (3, 'Prześwietlenie', 'RTG');
INSERT INTO medical_treatment (id, description, type)
            VALUES (4, 'Detekcja problemów żołądkowych', 'USG');
INSERT INTO medical_treatment (id, description, type)
            VALUES (5, 'Badania kontrolne', 'EKG');

INSERT INTO visit_medical_treatment (visit_id, medical_treatment_id)
            VALUES (1, 1);
INSERT INTO visit_medical_treatment (visit_id, medical_treatment_id)
            VALUES (2, 2);
INSERT INTO visit_medical_treatment (visit_id, medical_treatment_id)
            VALUES (3, 3);
INSERT INTO visit_medical_treatment (visit_id, medical_treatment_id)
            VALUES (3, 4);
INSERT INTO visit_medical_treatment (visit_id, medical_treatment_id)
            VALUES (5, 5);
INSERT INTO visit_medical_treatment (visit_id, medical_treatment_id)
            VALUES (6, 1);
INSERT INTO visit_medical_treatment (visit_id, medical_treatment_id)

            VALUES (7, 2);
INSERT INTO visit_medical_treatment (visit_id, medical_treatment_id)
            VALUES (8, 3);
INSERT INTO visit_medical_treatment (visit_id, medical_treatment_id)
            VALUES (8, 4);
INSERT INTO visit_medical_treatment (visit_id, medical_treatment_id)
            VALUES (8, 5);

