CREATE TABLE activities (id BIGINT AUTO_INCREMENT,
                        start_time TIMESTAMP,
                        activity_desc VARCHAR(255),
                        activity_type VARCHAR(255),
                        PRIMARY KEY (id));

CREATE TABLE track_points(id BIGINT AUTO_INCREMENT,
                           act_time Date,
                           lat DOUBLE,
                           lon DOUBLE,
                           activityId BIGINT,
                           PRIMARY KEY (activityId),
                           FOREIGN KEY (id) REFERENCES activities(id));

insert into activities(start_time,activity_desc,activity_type) values ('2021-02-12 14:30:00','Biking in Mecsek','BIKING');
insert into activities(start_time,activity_desc,activity_type) values ('2021-02-11 12:30:00','Hiking in Mecsek','HIKING');
insert into activities(start_time,activity_desc,activity_type) values ('2021-02-11 14:30:00','Runnng in Mecsek','RUNNING');