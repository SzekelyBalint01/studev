
CREATE TABLE company(
                        id	serial PRIMARY KEY,
                        companyName VARCHAR(100),
                        city	VARCHAR(100),
                        address	VARCHAR(200),
                        technologies VARCHAR[],
                        majorIndustries VARCHAR[],
                        maxStudents integer,
                        registrationEmail VARCHAR(150),
                        password VARCHAR(100),
                        contactPersonFirstname VARCHAR(100),
                        contactPersonLastname VARCHAR(100),
                        contactPersonPhoneNumber VARCHAR(20),
                        contactPersonEmail VARCHAR(150),
                        companyRegistrationNumber VARCHAR(100),
                        companyTaxNumber	VARCHAR(100),
                        description VARCHAR(500),
                        isValid boolean,
                        companyLogoLink VARCHAR(255),
                        facebook VARCHAR(255),
                        linkedIn VARCHAR(255),
                        twitter VARCHAR(255),
                        youtube VARCHAR(255),
                        website VARCHAR(255),
                        internships VARCHAR[],
                        thesisTopics VARCHAR[]
);

CREATE TABLE internship(
                           Id	serial PRIMARY KEY,
                           name	VARCHAR(100),
                           place	VARCHAR(255),
                           contactPersonName	VARCHAR(150),
                           contactPersonEmail	VARCHAR(150),
                           contactPersonPhoneNumber	VARCHAR(20),
                           startDate	TIMESTAMP,
                           endDate		TIMESTAMP,
                           technologies		VARCHAR[],
                           majors		VARCHAR[],
                           isContiguous	boolean,
                           isPaid		boolean,
                           description	VARCHAR(500),
                           isVisible		boolean
);

CREATE TABLE thesis_topic(
                             Id	serial PRIMARY KEY,
                             name	VARCHAR(100),
                             contactPersonName	VARCHAR(150),
                             contactPersonEmail	VARCHAR(150),
                             contactPersonPhoneNumber	VARCHAR(20),
                             technologies		VARCHAR[],
                             majors		VARCHAR[],
                             description	VARCHAR(500),
                             isVisible		boolean
);
