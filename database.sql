CREATE TABLE courseList (
    courseID INT NOT NULL AUTO_INCREMENT,
    courseName VARCHAR(255) NOT NULL,
    PRIMARY KEY (courseID)
);

INSERT INTO courseList (courseName) VALUES
('Introduction to Computer Science'),
('Data Structures and Algorithms'),
('Database Systems'),
('Web Development'),
('Operating Systems'),
('Computer Networks'),
('Artificial Intelligence'),
('Software Engineering'),
('Programming Languages'),
('Computer Graphics'),
('Mobile Application Development'),
('Cybersecurity'),
('Computer Architecture'),
('Computer Vision'),
('Distributed Systems'),
('Cloud Computing'),
('Machine Learning'),
('Natural Language Processing'),
('Human-Computer Interaction'),
('Computer Ethics'),
('Big Data Analytics'),
('Information Retrieval'),
('Parallel Computing'),
('Data Mining'),
('Robotics'),
('Computer Music'),
('Computational Biology'),
('Computer Games'),
('Internet of Things'),
('Blockchain Technology'),
('Quantum Computing'),
('Virtual Reality'),
('Augmented Reality'),
('Computer Animation'),
('Computer Vision'),
('Computer Forensics'),
('Computer Hardware'),
('Computer Software'),
('Computer Programming'),
('Computer Engineering'),
('Computer Science'),
('Computer Information Systems'),
('Computer Security'),
('Computer Vision'),
('Computer Music'),
('Computational Biology'),
('Computer Games'),
('Internet of Things'),
('Blockchain Technology'),
('Quantum Computing'),
('Virtual Reality'),
('Augmented Reality'),
('Computer Animation'),
('Computer Vision'),
('Computer Forensics'),
('Computer Hardware'),
('Computer Software'),
('Computer Programming'),
('Computer Engineering'),
('Computer Science'),
('Computer Information Systems'),
('Computer Security');

-- /for admin login
INSERT Users (user_name, password, email, type) VALUES
('admin', 'admin', 'admin@gmail.com', 'admin');

-- /for student login
INSERT Users (user_name, password, email, type) VALUES
('Alice', 'Alice', 'alice@gmail.com', 'student'),
('Bob', 'Bob', 'bob@gmail.com', 'student'),
('Charlie', 'Charlie', 'charlie@gmail.com', 'student'),
('David', 'David', 'david@gmail.com', 'student'),
('Eve', 'Eve', 'eve@gmail.com', 'student'),
('Frank', 'Frank', 'david@gmail.com', 'student'),
('Grace', 'Grace', 'Grace@gmail.com', 'student'),
('Heidi', 'Heidi', 'Heidi@gmail.com', 'student'),
('Ivan', 'Ivan', 'david@gmail.com', 'student');