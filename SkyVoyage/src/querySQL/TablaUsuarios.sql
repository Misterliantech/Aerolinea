CREATE TABLE usuarios (
    id_usuario INT PRIMARY KEY IDENTITY(1,1),   -- ID único, autoincremental
    nombre_usuario VARCHAR(50) NOT NULL UNIQUE,  -- Nombre de usuario único
    nombre VARCHAR(100) NOT NULL,                -- Nombre completo
    correo VARCHAR(100) NOT NULL UNIQUE,         -- Correo único
    contrasena VARCHAR(255) NOT NULL,            -- Contraseña
    cedula VARCHAR(20) NOT NULL UNIQUE,          -- Cédula única
    nacionalidad VARCHAR(50) NOT NULL            -- Nacionalidad
);

