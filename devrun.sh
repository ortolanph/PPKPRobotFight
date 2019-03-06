#!/usr/bin/env bash

source environments/development.conf

java -Dserver.port=$PORT \
     -Dspring.profiles.active=$PROFILE-jar \
     -jar $JAR_LOCATION/$JAR_FILE