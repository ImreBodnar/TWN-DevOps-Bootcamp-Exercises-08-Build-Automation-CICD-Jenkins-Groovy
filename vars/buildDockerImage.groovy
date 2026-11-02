#!/bin/env groovy

def call(String imageName) {
    sh "docker build -t $NEXUS_ADDRESS/$imageName:$NEW_VERSION ."
}
