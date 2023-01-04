CREATE TABLE survey (
	survey_id	number(10)		NOT NULL,
	title_admin	varchar2(200)		NULL,
	title_view	varchar2(200)		NULL,
	description	varchar2(1000)		NULL,
	creat_time	date		NULL,
	modify_time	date		NULL
);


CREATE TABLE question (
	question_id	number(10)		NOT NULL,
	question	varchar2(1000)		NULL,
	question_type_id	number(10)		NULL,
	survey_id	number(10)		NULL,
	survey_id2	number(10)		NOT NULL
);

CREATE TABLE question_type (
	question_type_id	number(10)		NOT NULL,
	question_type	varchar2(10)		NULL,
	question_id	number(10)		NOT NULL
);

CREATE TABLE response (
	response_id	number(10)		NOT NULL,
	response	varchar2(2000)		NULL,
	question_id	number(10)		NOT NULL
);

ALTER TABLE survey ADD CONSTRAINT PK_SURVEY PRIMARY KEY (
	survey_id
);

ALTER TABLE question ADD CONSTRAINT PK_QUESTION PRIMARY KEY (
	question_id
);

ALTER TABLE question_type ADD CONSTRAINT PK_QUESTION_TYPE PRIMARY KEY (
	question_type_id
);

ALTER TABLE response ADD CONSTRAINT PK_RESPONSE PRIMARY KEY (
	response_id
);

ALTER TABLE question ADD CONSTRAINT FK_survey_TO_question_1 FOREIGN KEY (
	survey_id2
)
REFERENCES survey (
	survey_id
);

ALTER TABLE question_type ADD CONSTRAINT FK_question_TO_question_type_1 FOREIGN KEY (
	question_id
)
REFERENCES question (
	question_id
);

ALTER TABLE response ADD CONSTRAINT FK_question_TO_response_1 FOREIGN KEY (
	question_id
)
REFERENCES question (
	question_id
);


COMMIT;



