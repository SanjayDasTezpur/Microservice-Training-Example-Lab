# spring-boot-axon
Event Sourcing with Spring Boot and Axon



Calling the API
------------------

1. With the database configured we are now able to call our REST API to verify that the application works as expected. First, let’s create a new account:

curl --data {\"name\":\"aditya\"} -H "Content-Type: application/json" localhost:8080/accounts

The response is the account id, e.g. 23f31cec-15e3-4e14-903b-4547b351384a


2. With the new account you can deposit money:
curl -X PUT --data 1000 -H "Content-Type: application/json" localhost:8080/accounts/23f31cec-15e3-4e14-903b-4547b351384a/balance

and withdraw money:

curl -X PUT --data -10 -H "Content-Type: application/json" localhost:8080/accounts/23f31cec-15e3-4e14-903b-4547b351384a/balance

Both requests will only return HTTP Status 202 and no body. At the moment there is no way to request the current balance of an account.

3. It is also possible to verify that you cannot overdraw the account:

curl -X PUT --data -1000 -H "Content-Type: application/json" localhost:8080/accounts/23f31cec-15e3-4e14-903b-4547b351384a/balance

This will result in error with the message: Insufficient balance.

4. And finally you can close the bank account:
 	
curl -X DELETE localhost:8080/accounts/23f31cec-15e3-4e14-903b-4547b351384a


5. to get the all the events of given id
curl -X GET localhost:8080/accounts/23f31cec-15e3-4e14-903b-4547b351384a/events