#!/bin/bash
set -x
#curl --tlsv1 -k --header 'Accept: application/json' 'https://localhost:8080/v2/ping' -v
curl -X GET --header 'Accept: application/json' 'http://localhost:8080/v2/ping' -v
set +x
