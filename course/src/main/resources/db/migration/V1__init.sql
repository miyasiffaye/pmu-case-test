
DROP TABLE IF EXISTS partant;
DROP TABLE IF EXISTS course;

CREATE TABLE `course`(
  `pk_course_id` BIGINT(20) AUTO_INCREMENT  PRIMARY KEY,
  `course_name` varchar(100)  NOT NULL,
  `course_number` int   NOT NULL,
  `course_date` timestamp NOT NULL,
  CONSTRAINT UC_course UNIQUE (course_name,course_number, course_date)
)  ;


CREATE TABLE `partant` (
  `pk_partant_id` BIGINT(20) AUTO_INCREMENT  PRIMARY KEY,
  `partant_number` int  NOT NULL  ,
  `partant_name` varchar(100)  NOT NULL,
   courseid  BIGINT(20) NOT NULL,
   FOREIGN KEY (`courseid`) REFERENCES `course` (`pk_course_id`) ON DELETE CASCADE
) ;