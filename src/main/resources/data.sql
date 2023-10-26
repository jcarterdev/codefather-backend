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

-- Insert sample data into Flights Table
INSERT INTO Flight (id, airline_id, departure_airport_id, arrival_airport_id, departure_time, arrival_time, aircraft_id)
VALUES
    (1, 1, 1, 2, '2023-10-26 09:00:00', '2023-10-26 12:00:00', 4),
    (2, 1, 3, 4, '2023-10-27 14:00:00', '2023-10-27 16:30:00', 4),
    (3, 1, 5, 1, '2023-10-28 10:30:00', '2023-10-28 18:30:00', 5),
    (4, 1, 2, 5, '2023-10-29 13:45:00', '2023-10-29 17:15:00', 5);



