pipeline {
    agent any
    stages {
        stage("Build Maven") {
            steps {
                sh 'mvn -B clean package'
            }
        }
        stage("Run Gatling") {
            steps {
                sh 'mvn gatling:test -Dgatling.simulationClass=C:/Users/josep/IdeaProjects/Gatling-practice/gatlingjenkinspractice/src/test/scala/simulations'
            }
            post {
                always {
                    gatlingArchive()
                }
            }
        }
    }
}
