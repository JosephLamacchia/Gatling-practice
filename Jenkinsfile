pipeline {
    agent any
    stages {
        stage("Build Maven") {
            steps {
                sh 'mvn -B clean package -e'
            }
        }
        stage("Run Gatling") {
            steps {
                sh 'mvn gatling:test -e'
            }
            post {
                always {
                    gatlingArchive()
                }
            }
        }
    }
}
