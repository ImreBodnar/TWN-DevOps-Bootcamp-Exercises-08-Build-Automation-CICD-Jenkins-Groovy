#!/bin/env groovy

def call() {
    sh "npm version minor --no-git-tag-version"
    env.NEW_VERSION = sh (script: "grep version package.json | cut -d '\"' -f4", returnStdout: true).trim()
}
