@echo off
echo "About to launch two instances "
cd ..\account-identifier-service\target
start cmd /k "java -jar account-identifier-service-1.0.0.jar --server.port=8091"
start cmd /k "java -jar account-identifier-service-1.0.0.jar --server.port=8092"

cd ..\..\bank-account-service\target
start cmd /k "java -jar bank-account-service-1.0.0.jar --server.port=8080"