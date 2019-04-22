#!/bin/bash
set -x
curl -k --header 'Accept: application/json' 'http://localhost:8080/v2/ping' -v
set +x
