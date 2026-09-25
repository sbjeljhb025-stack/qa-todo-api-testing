## Requirements Traceability Matrix

The traceability matrix connects the expected API behaviour to the manual test case and the automated test that verifies it.

Requirement / Behaviour

Test Case

Automated Test

Test Type

Status

Retrieve an existing Todo

## TC001

GetTodoTests.shouldGetTodoSuccessfully

Functional / Positive

Covered

Retrieve another existing Todo

TC002

GetTodoTests.shouldGetAnotherTodoSuccessfully

Functional / Positive

Covered

Handle a non-existent Todo

TC003

GetTodoNegativeTests.shouldHandleNonExistentTodo

Negative / Edge

Covered

Create an incomplete Todo

TC004

CreateTodoTests.shouldCreateTodo

Functional / Positive

Covered

Create a completed Todo

TC005

CreateTodoTests.shouldCreateCompletedTodo

Functional / Positive

Covered

Update a Todo

TC006

UpdateTodoTests.shouldUpdateTodo

Functional / Positive

Covered

Delete a Todo

TC007

DeleteTodoTests.shouldDeleteTodo

Functional / Positive

Covered

Validate HTTP status codes

TC001-TC007

All automated tests

Response validation

Covered

Validate important response fields

TC001-TC007

All applicable automated tests

Response validation

Covered

Coverage Summary

Manual test cases: 7

Automated test cases: 7

CRUD operations covered: GET, POST, PUT, DELETE

Positive testing: 6 tests

Negative/edge testing: 1 test

Traceability Flow

Requirement / Expected Behaviour
↓
Manual Test Case
↓
Automated Test
↓
Test Result
↓
Observation / Defect

The matrix should be updated when requirements or test cases change so that every important behaviour remains traceable to evidence.
