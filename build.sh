#!/bin/bash

set -e

echo "start to build ats-common"

mvn clean package

cp target/ats-common-1.0.jar ../ats-kafka-rest/src/main/resources/
