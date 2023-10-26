-- Insert sample data into Airports Table
INSERT INTO Airport (id, name, IATA_code, location)
VALUES
    (1, 'John F. Kennedy International Airport', 'JFK', 'New York, USA'),
    (2, 'Los Angeles International Airport', 'LAX', 'Los Angeles, USA'),
    (3, 'Heathrow Airport', 'LHR', 'London, UK'),
    (4, 'Charles de Gaulle Airport', 'CDG', 'Paris, France'),
    (5, 'Tokyo Haneda Airport', 'HND', 'Tokyo, Japan');


INSERT INTO Airline (id, name, IATA_code)
VALUES
    (1, 'Southwest', 'WNCO');

-- Insert sample data for Boeing 737 subtypes into Aircrafts Table
INSERT INTO Aircraft (id, aircraft_type, seating_capacity)
VALUES
    (1, 'Boeing 737-700', 126),
    (2, 'Boeing 737-800', 162),
    (3, 'Boeing 737-900', 180),
    (4, 'Boeing 737-700', 130),
    (5, 'Boeing 737-800', 155);

-- Insert sample data into Flight Table
INSERT INTO Flight (id, airline_id, departure_airport_id, arrival_airport_id, departure_time, arrival_time, aircraft_id)
VALUES
    (1, 1, 1, 2, '2023-10-26 09:00:00', '2023-10-26 12:00:00', 4),
    (2, 1, 3, 4, '2023-10-27 14:00:00', '2023-10-27 16:30:00', 4),
    (3, 1, 5, 1, '2023-10-28 10:30:00', '2023-10-28 18:30:00', 5),
    (4, 1, 2, 5, '2023-10-29 13:45:00', '2023-10-29 17:15:00', 5);

-- Insert sample data into Passenger Table
INSERT INTO Passenger (id, first_name, last_name, email, phone)
VALUES
    (1, 'John', 'Doe', 'john.doe@email.com', '+1-123-456-7890'),
    (2, 'Jane', 'Smith', 'jane.smith@email.com', '+1-987-654-3210'),
    (3, 'Michael', 'Johnson', 'michael.johnson@email.com', '+1-555-555-5555'),
    (4, 'Emily', 'Davis', 'emily.davis@email.com', '+1-888-888-8888'),
    (5, 'Robert', 'Brown', 'robert.brown@email.com', '+1-777-777-7777');


-- Insert sample booking data into Bookings Table
INSERT INTO Booking (id, flight_id, passenger_id, booking_date, seat_number)
VALUES
    (1, 1, 1, '2023-10-26 08:00:00', 'A1'),
    (2, 2, 2, '2023-10-26 09:30:00', 'B3'),
    (3, 3, 3, '2023-10-27 11:15:00', 'C2'),
    (4, 4, 4, '2023-10-27 13:00:00', 'D5'),
    (5, 1, 5, '2023-10-28 14:45:00', 'A3');

-- Insert sample schedule data into Schedules Table
INSERT INTO Schedule (id, flight_id, day_of_week, departure_time, arrival_time)
VALUES
    (1, 1, 1, '09:00:00', '12:00:00'), -- Monday
    (2, 1, 3, '09:00:00', '12:00:00'), -- Wednesday
    (3, 2, 2, '14:00:00', '16:30:00'), -- Tuesday
    (4, 2, 4, '14:00:00', '16:30:00'), -- Thursday
    (5, 3, 5, '10:30:00', '18:30:00'); -- Friday


-- Insert sample data into Employee Table
INSERT INTO Employee (id, first_name, last_name, seniority, shift_preference)
VALUES
    (1, 'John', 'Doe', 3, 'MORNING'),
    (2, 'Jane', 'Smith', 2, 'AFTERNOON'),
    (3, 'Michael', 'Johnson', 5, 'NIGHT'),
    (4, 'Emily', 'Davis', 1, 'MORNING'),
    (5, 'Robert', 'Brown', 4, 'AFTERNOON');


INSERT INTO forecast(id, part_of_day, timestamp, number_of_flights)
VALUES
    (1, 'morning','2023-09-01',10)
    ,(2, 'afternoon','2023-09-01',6)
    ,(3, 'night','2023-09-01',6)
    ,(4, 'morning','2023-09-02',13)
    ,(5, 'afternoon','2023-09-02',9)
    ,(6, 'night','2023-09-02',9)
    ,(7, 'morning','2023-09-03',9)
    ,(8, 'afternoon','2023-09-03',7)
    ,(9, 'night','2023-09-03',7)
    ,(10, 'morning','2023-09-04',13)
    ,(11, 'afternoon','2023-09-04',8)
    ,(12, 'night','2023-09-04',8)
    ,(13, 'morning','2023-09-05',9)
    ,(14, 'afternoon','2023-09-05',7)
    ,(15, 'night','2023-09-05',7)
    ,(16, 'morning','2023-09-06',9)
    ,(17, 'afternoon','2023-09-06',5)
    ,(18, 'night','2023-09-06',5)
    ,(19, 'morning','2023-09-07',10)
    ,(20, 'afternoon','2023-09-07',6)
    ,(21, 'night','2023-09-07',6)
    ,(22, 'morning','2023-09-08',11)
    ,(23, 'afternoon','2023-09-08',8)
    ,(24, 'night','2023-09-08',8)
    ,(25, 'morning','2023-09-09',12)
    ,(26, 'afternoon','2023-09-09',8)
    ,(27, 'night','2023-09-09',8)
    ,(28, 'morning','2023-09-10',10)
    ,(29, 'afternoon','2023-09-10',7)
    ,(30, 'night','2023-09-10',7)
    ,(31, 'morning','2023-09-11',12)
    ,(32, 'afternoon','2023-09-11',9)
    ,(33, 'night','2023-09-11',9)
    ,(34, 'morning','2023-09-12',10)
    ,(35, 'afternoon','2023-09-12',7)
    ,(36, 'night','2023-09-12',7)
    ,(37, 'morning','2023-09-13',9)
    ,(38, 'afternoon','2023-09-13',6)
    ,(39, 'night','2023-09-13',6)
    ,(40, 'morning','2023-09-14',10)
    ,(41, 'afternoon','2023-09-14',6)
    ,(42, 'night','2023-09-14',6);

