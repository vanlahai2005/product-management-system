# Product CRUD Requirements

## 1. Purpose

The Product module manages product information and product stock.

## 2. Product Data

Each product contains:

- id
- name
- description
- price
- stockQuantity
- createdAt
- updatedAt

## 3. Functional Requirements

The system must allow users to:

- Create a new product
- View all products
- View one product by ID
- Update an existing product
- Delete a product

## 4. Business Rules

### Product name

- Must not be blank
- Maximum length: 150 characters

### Description

- Optional
- Maximum length: 1000 characters

### Price

- Must not be null
- Must be greater than 0
- Must use BigDecimal in Java

### Stock quantity

- Must not be null
- Must be greater than or equal to 0

### ID

- Generated automatically by the database
- Must not be supplied manually by the client

### Timestamps

- createdAt is generated when a product is created
- updatedAt is updated when a product is modified

## 5. Planned REST APIs

| Method | Endpoint | Description |
|---|---|---|
| POST | /api/products | Create a product |
| GET | /api/products | Get all products |
| GET | /api/products/{id} | Get product details |
| PUT | /api/products/{id} | Update a product |
| DELETE | /api/products/{id} | Delete a product |

## 6. Error Cases

- Product not found: return HTTP 404
- Invalid product data: return HTTP 400
- Unexpected server error: return HTTP 500