CREATE TABLE applications
(
    id           BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    company      VARCHAR(50)                 NOT NULL,
    contact_info VARCHAR(50),
    role_title   VARCHAR(50)                 NOT NULL,
    status       VARCHAR(20) DEFAULT 'SAVED' NOT NULL,
    source       VARCHAR(50),
    remote_flag  BOOLEAN     DEFAULT FALSE   NOT NULL,
    location     VARCHAR(50),
    link         TEXT,
    deadline     DATE,
    applied_date DATE,
    created_at   TIMESTAMPTZ DEFAULT NOW()   NOT NULL,
        CONSTRAINT chk_status CHECK ( status IN
                                      ('SAVED', 'APPLIED', 'SCREENING', 'INTERVIEW',
                                       'OFFER', 'ACCEPTED', 'REJECTED', 'WITHDRAWN'))
);
