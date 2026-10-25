#!/bin/env groovy

def call() {
    withCredentials([usernamePassword(credentialsId: 'github-credentials', usernameVariable: 'GIT_USER', passwordVariable: 'GIT_PWD')]) {
        sh "git config user.email jenkins.ci@example.com"
        sh "git config user.name JenkinsCI"
        sh "git add ."
        sh "git commit -m 'CI pipeline: Version Increment'"
        sh "git push https://$GIT_USER:$GIT_PWD@github.com/$GIT_USER/TWN-DevOps-Bootcamp-Exercises-08-Build-Automation-CICD-Jenkins.git HEAD:main"
    }
}
