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



