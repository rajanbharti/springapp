
CREATE TABLE admin(id INT PRIMARY KEY,username VARCHAR(20),password VARCHAR(20));

CREATE TABLE questions(qid INT, cid INT,question TEXT,isMCQ TINYINT(1),PRIMARY KEY(qid,cid));

CREATE TABLE answers(qid INT,cid INT,answer TEXT,PRIMARY KEY(qid,cid));

CREATE TABLE options(question_id INT,course_id VARCHAR(7),ops SET())