CREATE TABLE reservation (
	reservation_id	number(10)		NOT NULL
);

CREATE TABLE customer (
	customer_id	number(10)		NOT NULL,
	customer_name	varchar2(100)		NULL,
	customer_phone	number(20)		NULL,
	customer_money	number(100)		NULL,
	customer_email	varchar2(100)		NULL,
	customer_point	number(100)		NULL,
	customer_checkin	date		NULL,
	customer_checkout	date		NULL,
	customer_memo	varchar2(200)		NULL,
	customer_count	number(20)		NULL,
	reservation_id	number(10)		NOT NULL,
	Field	VARCHAR(255)		NULL
);

CREATE TABLE room (
	room_id	number(10)		NOT NULL,
	room_name	varchar2(100)		NULL,
	room_explain	varchar2(200)		NULL,
	room_use	varchar2(100)		NULL,
	reservation_id	number(10)		NOT NULL
);

CREATE TABLE room_info (
	room_info_id	number(10)		NOT NULL,
	room_size	varchar2(100)		NULL,
	room_person	number(10)		NULL,
	room_price	number(100)		NULL,
	room_address	varchar2(100)		NULL,
	room_id	number(10)		NOT NULL
);

ALTER TABLE reservation ADD CONSTRAINT PK_RESERVATION PRIMARY KEY (
	reservation_id
);

ALTER TABLE customer ADD CONSTRAINT PK_CUSTOMER PRIMARY KEY (
	customer_id
);

ALTER TABLE room ADD CONSTRAINT PK_ROOM PRIMARY KEY (
	room_id
);

ALTER TABLE room_info ADD CONSTRAINT PK_ROOM_INFO PRIMARY KEY (
	room_info_id
);

ALTER TABLE customer ADD CONSTRAINT FK_reservation_TO_customer_1 FOREIGN KEY (
	reservation_id
)
REFERENCES reservation (
	reservation_id
);

ALTER TABLE room ADD CONSTRAINT FK_reservation_TO_room_1 FOREIGN KEY (
	reservation_id
)
REFERENCES reservation (
	reservation_id
);

ALTER TABLE room_info ADD CONSTRAINT FK_room_TO_room_info_1 FOREIGN KEY (
	room_id
)
REFERENCES room (
	room_id
);
