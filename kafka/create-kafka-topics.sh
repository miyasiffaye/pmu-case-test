#!/usr/bin/env bash

echo
echo "Create topic mysql.pmu_course.course"
echo "------------------------------------"
docker exec -t zookeeper kafka-topics --create --bootstrap-server kafka:9092 --replication-factor 1 --partitions 5 --topic mysql.pmu_course.course

echo
echo "List topics"
echo "-----------"
docker exec -t zookeeper kafka-topics --list --bootstrap-server kafka:9092
