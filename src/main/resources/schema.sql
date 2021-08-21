/*
 Step 3 : Create table that will keep user information.

 Note :

 1. schema.sql file is executed automatically when spring boot starts
 2. The CREATE TABLE ... is SQL command to create table
 3. IF NOT EXISTS , is added so the app always tries to run this, but doesnt re create the table
    if it already exists.
 4. When adding this, verify with the Database connection if the table was created.
 */

CREATE TABLE IF NOT EXISTS users (
            id INT AUTO_INCREMENT PRIMARY KEY,
            first_name VARCHAR(40),
            last_name VARCHAR(40),
            password VARCHAR(255),
            email VARCHAR(255)
);