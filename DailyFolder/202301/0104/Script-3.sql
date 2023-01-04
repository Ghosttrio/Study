CREATE TABLE forum (
	forum_id	number(10)		NOT NULL,
	forum_title	varchar2(100)		NULL,
	forum_nick	varchar2(50)		NULL
);

CREATE TABLE post (
	post_id	number(10)		NOT NULL,
	post_contents	varchar2(1000)		NULL,
	forum_id	number(10)		NOT NULL
);

CREATE TABLE comment_ (
	comment_id	number(10)		NOT NULL,
	comment_id2	varchar2(50)		NULL,
	comment_pw	varchar2(50)		NULL,
	comment_contents	varchar2(500)		NULL,
	comment_nick	varchar2(50)		NULL,
	post_id	number(10)		NOT NULL
);

ALTER TABLE forum ADD CONSTRAINT PK_FORUM PRIMARY KEY (
	forum_id
);

ALTER TABLE post ADD CONSTRAINT PK_POST PRIMARY KEY (
	post_id
);

ALTER TABLE comment_ ADD CONSTRAINT PK_COMMENT PRIMARY KEY (
	comment_id
);

ALTER TABLE post ADD CONSTRAINT FK_forum_TO_post_1 FOREIGN KEY (
	forum_id
)
REFERENCES forum (
	forum_id
);

ALTER TABLE comment_ ADD CONSTRAINT FK_post_TO_comment_1 FOREIGN KEY (
	post_id
)
REFERENCES post (
	post_id
);


SELECT * FROM forum;

SELECT * FROM post;

SELECT * FROM comment_;


