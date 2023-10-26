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