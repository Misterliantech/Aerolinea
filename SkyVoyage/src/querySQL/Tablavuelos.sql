CREATE TABLE vuelos (
    id_vuelo INT IDENTITY(1,1) PRIMARY KEY,  
    codigo_vuelo VARCHAR(10) NOT NULL,
    origen VARCHAR(100) NOT NULL,
    destino VARCHAR(100) NOT NULL,
    total_asientos INT NOT NULL,
    asientos_ocupados INT NOT NULL,
    fecha_salida DATETIME NOT NULL,
    estado VARCHAR(20) NOT NULL  
);