#!/bin/bash

set -e

echo "start to build ats-common"

mvn clean package install -X -e

