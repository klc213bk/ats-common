#!/bin/bash

set -e

echo "start to build ats-common"

mvn clean package install -X -e --settings /home/steven/gitrepo/ats/ats-common/settings-ats.xml

