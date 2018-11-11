Insert into user (id, email, first_name, last_name) 
values (HIBERNATE_SEQUENCE.nextval, 'jgrand@simplon.co', 'Jules', 'Grand');

Insert into user (id, email, first_name, last_name) 
values (HIBERNATE_SEQUENCE.nextval, 'testsimplon.co', 'Laetitia', 'Dhont');


insert into link (id, date, topic, url, user_id) 
values (HIBERNATE_SEQUENCE.nextval, '2018-11-07', 'WEB', 'http://google.fr', 1);

insert into link (id, date, topic, url, user_id) 
values (HIBERNATE_SEQUENCE.nextval, '2018-11-07', 'WEB', 'http://github.fr', 2);

insert into link (id, date, topic, url, user_id) 
values (HIBERNATE_SEQUENCE.nextval, '2018-11-07', 'WEB', 'https://www.linkedin.com', 2);