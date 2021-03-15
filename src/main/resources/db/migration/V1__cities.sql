CREATE TABLE cities (city_id BIGINT AUTO_INCREMENT NOT NULL,
                    zip VARCHAR (4) NOT NULL,
                    city VARCHAR (40) NOT NULL,
                    PRIMARY KEY (city_id));

CREATE TABLE citizens (citizen_id BIGINT AUTO_INCREMENT NOT NULL,
                        citizen_name VARCHAR (200) NOT NULL,
                        zip VARCHAR (6) NOT NULL,
                        age BIGINT NOT NULL,
                        email VARCHAR(200),
                        taj varchar(10),
                        number_of_vaccination BIGINT,
                        last_vaccination TIMESTAMP,
                        PRIMARY KEY (citizen_id));

CREATE TABLE VACCINATIONS (vaccination_id BIGINT NOT NULL,
                   citizen_id BIGINT NOT NULL,
                    vaccination_date TIMESTAMP NOT NULL,
                    status VARCHAR (10),
                    note VARCHAR(200),
                    vaccination_type VARCHAR (20),
                    PRIMARY KEY (vaccination_id),
                    FOREIGN KEY (citizen_id) REFERENCES citizens (citizen_id));

