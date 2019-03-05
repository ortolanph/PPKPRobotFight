#!/usr/bin/env bash

source environments/development.conf

java -Dserver.port=$PORT \
     -Dspring.profiles.active=$PROFILE \
      -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=$DEBUG_PORT \
     -jar $JAR_LOCATION/$JAR_FILE