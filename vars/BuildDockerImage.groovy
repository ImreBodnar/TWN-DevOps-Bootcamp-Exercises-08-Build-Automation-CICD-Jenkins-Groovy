#!/bin/env groovy

def call() {
    sh "docker build -t $NEXUS_ADDRESS/nodejs-app:$NEW_VERSION ."
}
