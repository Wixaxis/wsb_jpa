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




insert into patient (id, first_name, last_name, email, telephone_number, address_id, patient_number, date_of_birth)
            values (1,'John', 'Doe', 'test@test.test', '123456789', 1, '1', '2000-01-05');
insert into patient (id, first_name, last_name, email, telephone_number, address_id, patient_number, date_of_birth)
            values (2, 'Jane', 'Doe', 'a@a.a', '987654321', 2, '2', '1996-01-01');
insert into patient (id, first_name, last_name, email, telephone_number, address_id, patient_number, date_of_birth)
            values (3, 'Tom', 'Doe', 'b@b.b', '123123123', 1, '3', '1981-01-01');
insert into patient (id, first_name, last_name, email, telephone_number, address_id, patient_number, date_of_birth)
            values (4, 'Jerry', 'Doe', 'c@c.c', '321321321', 3, '4', '1999-02-01');



insert into doctor (id, first_name, last_name, email, telephone_number, address_id, doctor_number, specialization)
            values (1, 'John', 'Doe', '1@1.1', '123456789', 1, '1', 'dentist');
insert into doctor (id, first_name, last_name, email, telephone_number, address_id, doctor_number, specialization)
            values (2, 'Jane', 'Doe', '2@2.2', '987654321', 4, '2', 'surgeon');
insert into doctor (id, first_name, last_name, email, telephone_number, address_id, doctor_number, specialization)
            values (3, 'Tom', 'Doe', '3@3.3', '123123123', 5, '3', 'dermatologist');
