#!/usr/bin/env sh

PRG="$0"
SAVED="`pwd`"
cd "`dirname \"$PRG\"`" >/dev/null
APP_HOME="`pwd -P`"
cd "$SAVED" >/dev/null

exec java -jar "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" "$@"
