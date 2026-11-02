#!/bin/env groovy

def call(String imageName) {
    withCredentials([usernamePassword(credentialsId: 'Nexus-Credentials', usernameVariable: 'NEXUS_USER', passwordVariable: 'NEXUS_PWD')]) {
        sh "echo $NEXUS_PWD | docker login -u $NEXUS_USER --password-stdin $NEXUS_ADDRESS"
        sh "docker push $NEXUS_ADDRESS/$imageName:$NEW_VERSION"
    }
}

