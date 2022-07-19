DROP DATABASE library;

CREATE DATABASE library;
USE library;

CREATE TABLE Books (
    title VARCHAR(30) NOT NULL,
    author VARCHAR(30) NOT NULL,
    ISBN INT NOT NULL,
    PRIMARY KEY (ISBN),
    stock INT NOT NULL
);

CREATE TABLE Users (
    user_id INT NOT NULL,
    PRIMARY KEY (user_id),
    First_name VARCHAR(30) NOT NULL,
    Last_name VARCHAR(30) NOT NULL,
    Contact_number VARCHAR(30) NOT NULL,
    Address_1 VARCHAR(30) NOT NULL,
    Address_2 VARCHAR(30),
    County VARCHAR(30) NOT NULL,
    Postcode VARCHAR(30) NOT NULL
);

CREATE TABLE Loaned (
    user_id INT,
    ISBN INT,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (ISBN) REFERENCES Books(ISBN),
    date_lent DATE NOT NULL,
    due_date DATE NOT NULL
);

INSERT INTO Books VALUES ("Signing Naturally", "Cheri Smith", 1581212100, 5);
INSERT INTO Books VALUES ("Physics: Principles", "Giancoli Douglas", 0321625927, 7);
INSERT INTO Books VALUES ("Medical-Surgical Nursing", "Lewis Sharon", 0323328520, 10);
INSERT INTO Books VALUES ("Essential Calculus", "James Stewart", 1133112285, 2);
INSERT INTO Books VALUES ("Lifespan Development", "Laura Berk", 0205957609, 6);
INSERT INTO Books VALUES ("Health Policymaking", "Beaufort Longest", 1567937195, 6);
INSERT INTO Books VALUES ("Economics: Principles", "R Campbell", 0078021758, 20);
INSERT INTO Books VALUES ("Harry Potter (Book 7)", "Rowling, J. K.", 0545010225, 12);
INSERT INTO Books VALUES ("Accounting Principles", "Jerry Weygandt", 1118875052, 12);
INSERT INTO Books VALUES ("Interpersonal Communication", "Kory Floyd", 0073406759, 2);

INSERT INTO Users VALUES (101, "George", "Watkins", "Num", "Add1", "Add2", "Con", "Pos");
INSERT INTO Users VALUES (102, "Sam", "Leyva", "Num", "Add1", "Add2", "Con", "Pos");
INSERT INTO Users VALUES (103, "Aaron", "Hazley", "Num", "Add1", "Add2", "Con", "Pos");
INSERT INTO Users VALUES (104, "Hubert", "Erickson", "Num", "Add1", "Add2", "Con", "Pos");
INSERT INTO Users VALUES (105, "Scott", "Kessler", "Num", "Add1", "Add2", "Con", "Pos");
INSERT INTO Users VALUES (106, "Margaret", "Elmore", "Num", "Add1", "Add2", "Con", "Pos");
INSERT INTO Users VALUES (107, "Robert", "Clarke", "Num", "Add1", "Add2", "Con", "Pos");
INSERT INTO Users VALUES (108, "Kesha", "Bennett", "Num", "Add1", "Add2", "Con", "Pos");
INSERT INTO Users VALUES (109, "Jennifer", "Paddock", "Num", "Add1", "Add2", "Con", "Pos");
INSERT INTO Users VALUES (110, "Karen", "Gallimore", "Num", "Add1", "Add2", "Con", "Pos");

INSERT INTO Loaned VALUES (101, 1581212100, '2022-05-12', '2022-06-16');
INSERT INTO Loaned VALUES (102, 0321625927, '2022-05-05', '2022-07-07');
INSERT INTO Loaned VALUES (103, 0323328520, '2022-06-22', '2022-07-20');
INSERT INTO Loaned VALUES (104, 1133112285, '2022-07-09', '2022-08-06');
INSERT INTO Loaned VALUES (105, 0205957609, '2022-05-12', '2022-06-16');
INSERT INTO Loaned VALUES (106, 1567937195, '2022-07-19', '2022-08-23');
INSERT INTO Loaned VALUES (107, 0078021758, '2022-07-15', '2022-08-19');
INSERT INTO Loaned VALUES (108, 0545010225, '2022-01-06', '2022-02-10');
INSERT INTO Loaned VALUES (109, 1118875052, '2022-06-10', '2022-07-08');
INSERT INTO Loaned VALUES (110, 0073406759, '2022-07-07', '2022-08-11');

SELECT * FROM Books;
SELECT * FROM Users;
SELECT * FROM Loaned;

COMMIT;