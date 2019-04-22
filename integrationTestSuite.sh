#!/bin/bash
set -x
curl -X GET --header 'Accept: application/json' 'https://localhost:8080/v2/ping' -v
set +x
