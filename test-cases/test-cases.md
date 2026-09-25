## Manual Test Cases

## API Under Test

JSONPlaceholder Todo API
Base URL: https://jsonplaceholder.typicode.com

ID

Test

Method

Endpoint

Expected Result

TC001

Get existing todo

GET

/todos/1

200 and ID 1

TC002

Get another existing todo

GET

/todos/5

200 and ID 5

TC003

Get non-existent todo

GET

/todos/9999

Document actual API behaviour

TC004

Create a todo

POST

/todos

201 and submitted data returned

TC005

Create completed todo

POST

/todos

201 and completed=true

TC006

Update a todo

PUT

/todos/1

200 and updated data returned

TC007

Delete a todo

DELETE

/todos/1

200

## Test Types

Positive testing: valid requests and expected responses.

Negative/edge testing: non-existent resource.

Functional testing: API operations work as intended.

Response validation: status codes and JSON fields are checked.