
SHELL=/bin/sh
UID := $(shell id -u)

compile:
	./mvnw compile

cleantest:
	./mvnw clean test

package:
	./mvnw clean package

packageverify:
	./mvnw clean package verify

# run before commiting
cleanverify:
	./mvnw clean verify

run-jar:
	cd target && \
	java -jar quickstart-0.0.1-SNAPSHOT.jar

