#!/usr/bin/env bash

echo "-------------------------------"
echo "Connector and their tasks state"
echo "-------------------------------"

curl localhost:8083/connectors/mysql-source-course/status


echo
echo "You can also use Kafka Connect UI, link http://localhost:8086"
echo