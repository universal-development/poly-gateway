# poly-gateway

[![Build Status](https://travis-ci.org/universal-development/poly-gateway.svg?branch=master)](https://travis-ci.org/universal-development/poly-gateway)

API gateway service which match HTTP requests by patterns and query appropriate service for results.

Current version: 0.1.0-SNAPSHOT

Released version: 0.0.1

Gradle dependency 

```compile 'com.unidev.polygateway:poly-gateway:0.0.1' ```

Services are mapped through path `/api/**` and are forwarder with /api prefix

## Ports

8000 - port for web requests

8001 - management interface


## API calls

List available services

`curl -v http://localhost:8001/routes`

## Stack

 Java 8

 Spring Cloud: eureka, hystrix 
 
 Spring Boot 1.4.x

 Gradle


# Building
To build project, try
`./gradlew build -PXunidev`

License
=======
 
    Copyright (c) 2017 Denis O <denis.o@linux.com>
 
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
 
       http://www.apache.org/licenses/LICENSE-2.0
 
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
