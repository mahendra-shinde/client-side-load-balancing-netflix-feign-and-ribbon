@echo off
echo "About to build account-identifier-service ..."
cd ..\account-identifier-service
mvn clean package

echo "About to build bank-account-service ..."
cd ..\..\bank-account-service
mvn clean package

cd ..\..