#!/bin/env groovy

def call() {
    withCredentials([usernamePassword(credentialsId: 'Nexus-Credentials', usernameVariable: 'NEXUS_USER', passwordVariable: 'NEXUS_PWD')]) {
        sh "echo $NEXUS_PWD | docker login -u $NEXUS_USER --password-stdin $NEXUS_ADDRESS"
        sh "docker push $NEXUS_ADDRESS/nodejs-app:$NEW_VERSION"
    }
}

