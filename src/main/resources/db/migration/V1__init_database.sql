CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    stock INTEGER,
    name VARCHAR(255),
    price FLOAT,
    category VARCHAR(255),
    description TEXT
);
