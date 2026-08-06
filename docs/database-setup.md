# Database Setup

## Database Provider

The project uses Supabase PostgreSQL.

## Database Name

postgres

## Connection Method

Spring Boot connects to Supabase through PostgreSQL JDBC.

## Environment Variables

- DB_URL
- DB_USERNAME
- DB_PASSWORD

## Security Notes

- Do not commit real database credentials.
- Do not expose the database password to the React frontend.
- Store secrets in environment variables.