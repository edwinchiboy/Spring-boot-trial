CREATE TABLE IF NOT EXISTS Content
(
    id           INTEGER AUTO_INCREMENT,
    title        Varchar(225) NOT NULL,
    desc  TEXT,
    status       Varchar(20)  NOT NULL,
    content_type VARCHAR(50)  NOT NULL,
    date_created TIMESTAMP    NOT NULL,
    date_updated TIMESTAMP,
    url          VARCHAR,
    PRIMARY KEY (id)
);

-- INSERT  INTO Content(title, desc,status,content_type,date_created )
-- VALUES ('My Spring Data blog post','A Post about spring data', 'IDEA','ARTICLE',CURRENT_TIME()  )