#!/bin/bash
set -x
curl -X GET --header 'Accept: application/json' 'http://localhost:8080/v2/ping'
set +x
