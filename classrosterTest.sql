drop database if exists classRosterTest;
create database classRosterTest;

use classRosterTest;

create table teacher(
	id int primary key auto_increment,
    firstName varchar(30) not null,
    lastName varchar(50) not null,
    specialty varchar(50)
);

create table student(
	id int primary key auto_increment,
    firstName varchar(30) not null,
    lastName varchar(50) not null
);

create table course(
	id int primary key auto_increment,
    name varchar(50) not null,
    description varchar(200),
    teacherId int not null,
    foreign key (teacherId) 
    references teacher(id)
);

create table course_student(
	courseId int not null,
    studentId int not null,
    primary key(courseId, studentId),
    foreign key (courseId) 
    references course(id),
    foreign key(studentId)
    references student(id)
);