CREATE TABLE clientes (
    id_cliente INT IDENTITY(1,1) PRIMARY KEY, 
    documento_identidad VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefono VARCHAR(15) NOT NULL,
    ciudad_origen VARCHAR(100) NOT NULL,
    ciudad_destino VARCHAR(100) NOT NULL,
    fecha_compra TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
