DELETE
FROM orders;

DELETE
FROM customers;

DELETE
FROM agents;

INSERT INTO AGENTS (agentcode, agentname, workingarea, commission, phone, country)
            VALUES (1, 'Ramasundar', 'Bangalore', 0.15, '077-25814763', ''),
                   (2, 'Alex', 'London', 0.13, '075-12458969', ''),
                   (3, 'Alford', 'New York', 0.12, '044-25874365', ''),
                   (4, 'Ravi', 'Bangalore', 0.15, '077-45625874', ''),
                   (5, 'Santakumar', 'Chennai', 0.14, '007-22388644', ''),
                   (6, 'Lucida', 'San Jose', 0.12, '044-52981425', ''),
                   (7, 'Anderson', 'Brisban', 0.13, '045-21447739', ''),
                   (8, 'Subbarao', 'Bangalore', 0.14, '077-12346674', ''),
                   (9, 'Mukesh', 'Mumbai', 0.11, '029-12358964', ''),
                   (10, 'McDen', 'London', 0.15, '078-22255588', ''),
                   (11, 'Ivan', 'Torento', 0.15, '008-22544166', ''),
                   (12, 'Benjamin', 'Hampshair', 0.11, '008-22536178', '');

INSERT INTO CUSTOMERS (custcode, custname, custcity, workingarea, custcountry, grade, openingamt, receiveamt, paymentamt, outstandingamt, phone, agentcode)
               VALUES (1, 'Holmes', 'London', 'London', 'UK', '2', 6000.00, 5000.00, 7000.00, 4000.00, 'BBBBBBB', 3),
                      (2, 'Micheal', 'New York', 'New York', 'USA', '2', 3000.00, 5000.00, 2000.00, 6000.00, 'CCCCCCC', 8),
                      (3, 'Albert', 'New York', 'New York', 'USA', '3', 5000.00, 7000.00, 6000.00, 6000.00, 'BBBBSBB', 8),
                      (4, 'Ravindran', 'Bangalore', 'Bangalore', 'India', '2', 5000.00, 7000.00, 4000.00, 8000.00, 'AVAVAVA', 11),
                      (5, 'Cook', 'London', 'London', 'UK', '2', 4000.00, 9000.00, 7000.00, 6000.00, 'FSDDSDF', 6),
                      (6, 'Stuart', 'London', 'London', 'UK', '1', 6000.00, 8000.00, 3000.00, 11000.00, 'GFSGERS', 3),
                      (7, 'Bolt', 'New York', 'New York', 'USA', '3', 5000.00, 7000.00, 9000.00, 3000.00, 'DDNRDRH', 8),
                      (8, 'Fleming', 'Brisban', 'Brisban', 'Australia', '2', 7000.00, 7000.00, 9000.00, 5000.00, 'NHBGVFC', 5),
                      (9, 'Jacks', 'Brisban', 'Brisban', 'Australia', '1', 7000.00, 7000.00, 7000.00, 7000.00, 'WERTGDF', 5),
                      (10, 'Yearannaidu', 'Chennai', 'Chennai', 'India', '1', 8000.00, 7000.00, 7000.00, 8000.00, 'ZZZZBFV', 10),
                      (11, 'Sasikant', 'Mumbai', 'Mumbai', 'India', '1', 7000.00, 11000.00, 7000.00, 11000.00, '147-25896312', 2),
                      (12, 'Ramanathan', 'Chennai', 'Chennai', 'India', '1', 7000.00, 11000.00, 9000.00, 9000.00, 'GHRDWSD', 10),
                      (13, 'Avinash', 'Mumbai', 'Mumbai', 'India', '2', 7000.00, 11000.00, 9000.00, 9000.00, '113-12345678',2),
                      (14, 'Winston', 'Brisban', 'Brisban', 'Australia', '1', 5000.00, 8000.00, 7000.00, 6000.00, 'AAAAAAA', 5),
                      (15, 'Karl', 'London', 'London', 'UK', '0', 4000.00, 6000.00, 7000.00, 3000.00, 'AAAABAA', 6),
                      (16, 'Shilton', 'Torento', 'Torento', 'Canada', '1', 10000.00, 7000.00, 6000.00, 11000.00, 'DDDDDDD', 4),
                      (17, 'Charles', 'Hampshair', 'Hampshair', 'UK', '3', 6000.00, 4000.00, 5000.00, 5000.00, 'MMMMMMM', 9),
                      (18, 'Srinivas', 'Bangalore', 'Bangalore', 'India', '2', 8000.00, 4000.00, 3000.00, 9000.00, 'AAAAAAB', 7),
                      (19, 'Steven', 'San Jose', 'San Jose', 'USA', '1', 5000.00, 7000.00, 9000.00, 3000.00, 'KRFYGJK', 10),
                      (20, 'Karolina', 'Torento', 'Torento', 'Canada', '1', 7000.00, 7000.00, 9000.00, 5000.00, 'HJKORED', 4),
                      (21, 'Martin', 'Torento', 'Torento', 'Canada', '2', 8000.00, 7000.00, 7000.00, 8000.00, 'MJYURFD', 4),
                      (22, 'Ramesh', 'Mumbai', 'Mumbai', 'India', '3', 8000.00, 7000.00, 3000.00, 12000.00, 'Phone No', 2),
                      (23, 'Rangarappa', 'Bangalore', 'Bangalore', 'India', '2', 8000.00, 11000.00, 7000.00, 12000.00, 'AAAATGF', 1),
                      (24, 'Venkatpati', 'Bangalore', 'Bangalore', 'India', '2', 8000.00, 11000.00, 7000.00, 12000.00, 'JRTVFDD', 7),
                      (25, 'Sundariya', 'Chennai', 'Chennai', 'India', '3', 7000.00, 11000.00, 7000.00, 11000.00, 'PPHGRTS', 10);

INSERT INTO ORDERS (ordnum, ordamount, advanceamount, custcode, orderdescription)
            VALUES (1, 1000.00, 600.00, 13, 'SOD'),
                   (2, 3000.00, 500.00, 19, 'SOD'),
                   (3, 4500.00, 900.00, 7, 'SOD'),
                   (4, 2000.00, 0.00, 16, 'SOD'),
                   (5, 4000.00, 600.00, 22, 'SOD'),
                   (6, 2000.00, 0.00, 12, 'SOD'),
                   (7, 3500.00, 2000.00, 2, 'SOD'),
                   (8, 2500.00, 400.00, 03, 'SOD'),
                   (9, 500.00, 0.00, 23, 'SOD'),
                   (10, 4000.00, 700.00, 7, 'SOD'),
                   (11, 1500.00, 600.00, 8, 'SOD'),
                   (12, 2500.00, 0.00, 25, 'SOD');

INSERT INTO PAYMENTS (paymentid, type)
              VALUES (1, 'Cash'),
                     (2, 'Gift Card'),
                     (3, 'Credit Card'),
                     (4, 'Mobile Pay');

INSERT INTO ORDERSPAYMENTS (ordnum, paymentid)
                    VALUES (1, 1),
                           (2, 2),
                           (3, 3),
                           (3, 2),
                           (4, 4),
                           (5, 2),
                           (6, 3),
                           (7, 4),
                           (8, 1),
                           (9, 3),
                           (10, 4),
                           (11, 2),
                           (12, 1);

/*
Must tell hibernate of the id numbers already used.
The number after with must be greater that the highest number id assigned.
 */alter sequence hibernate_sequence restart with 50;