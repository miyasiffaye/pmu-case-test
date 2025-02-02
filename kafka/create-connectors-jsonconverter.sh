#!/usr/bin/env bash

echo "-----------------------"
echo "Creating connectors ..."
echo "-----------------------"

echo
curl -i -X POST http://localhost:8083/connectors \
  -H 'Content-Type: application/json' \
  -H 'Accept: application/json' \
  -d @connectors/jsonconverter/mysql-source-course.json

echo
echo "--------------------------------------------------------------"
echo "Check state of connectors and their tasks by running script ./check-connectors-state.sh or at Kafka Connect UI, link http://localhost:8086"
echo "--------------------------------------------------------------"