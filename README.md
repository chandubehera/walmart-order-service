🚀 Postman Test Instructions
Start the Application:
Run the Application.java file.

Access H2 Console (Optional for DB Check):
URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:ordersdb
Username: sa
Password: (leave empty)
API Endpoints (Test with Postman)

Create Order: POST /api/orders
{
"productName": "Smartphone",
"quantity": 2,
"price": 500.00
}


Get Order by ID: GET /api/orders/1
Get All Orders: GET /api/orders
Delete Order: DELETE /api/orders/1


