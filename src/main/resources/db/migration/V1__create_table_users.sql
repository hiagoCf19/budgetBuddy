CREATE TABLE users (
   id UUID PRIMARY KEY,  -- Você irá passar o UUID manualmente, não gerado automaticamente
   name VARCHAR(255) NOT NULL,
   email VARCHAR(255) NOT NULL UNIQUE,  -- Garante que o e-mail seja único
   created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
   updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);
